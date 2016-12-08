package raven;

import java.io.InputStream;
import java.util.concurrent.CompletableFuture;

import org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor;

import play.Application;
import play.Configuration;
import play.Environment;
import play.Logger;
import play.inject.ApplicationLifecycle;


public class BaseLifecycle {


	protected void start(Environment env, Configuration conf, Application app, ApplicationLifecycle al) {
		Global.init(env, conf, app, al);
		Logger.info("");
		Logger.info("");
		Logger.info("########### Starting app " + Global.getAppName() + " version " + Global.getAppVersion() + " ###########");
		Logger.info("");
		Logger.info("");
		Logger.info("Mode: " + env.mode().name());
		String executorThreads = conf.getString("raven.executor.size");
		if (executorThreads != null) {
			int t = Integer.valueOf(executorThreads);
			if (t > 0) {
				Executor.setThreads(t);
			}
		}
		
		al.addStopHook(() -> {
			Logger.info("");
			Logger.info("");
			Logger.info("########### Stopping app " + Global.getAppName() + " version " + Global.getAppVersion() + " ###########");
			Logger.info("");
			Logger.info("");
			if (env.isProd()) {
				// ss.publishToActivityChannel("Production Padwow instance
				// shutting down");
			}
			Executor.shutdownExecutorService();
			return CompletableFuture.completedFuture(null);
		});

	}

	// Snakeyaml methods
	protected Object load(String resourceName) {
		return load(Global.getEnv().resourceAsStream(resourceName), Global.getEnv().classLoader());
	}

	private static Object load(InputStream is, ClassLoader classloader) {
		org.yaml.snakeyaml.Yaml yaml = new org.yaml.snakeyaml.Yaml(new CustomClassLoaderConstructor(classloader));
		return yaml.load(is);
	}
}
