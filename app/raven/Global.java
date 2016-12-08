package raven;

import play.Application;
import play.Configuration;
import play.Environment;
import play.inject.ApplicationLifecycle;

public class Global {
	private static Environment env;
	private static Configuration conf;
	private static Application app;
	private static ApplicationLifecycle al;
	
	private static String appName;
	private static String appVersion;
	private static String appTitle;


	
	public static void init(Environment env, Configuration conf, Application app, ApplicationLifecycle al) {
		Global.env = env;
		Global.conf = conf;
		Global.app = app;
		Global.al = al;
		appName = conf.getString("raven.app.name");
		appVersion = conf.getString("raven.app.version");
		appTitle = conf.getString("raven.app.title");
	}

	public static Environment getEnv() {
		return env;
	}

	public static Configuration getConf() {
		return conf;
	}

	public static Application getApp() {
		return app;
	}

	public static ApplicationLifecycle getAl() {
		return al;
	}

	public static String getAppVersion() {
		return appVersion;
	}

	public static String getAppTitle() {
		return appTitle;
	}

	public static String getAppName() {
		return appName;
	}		


	
	
}
