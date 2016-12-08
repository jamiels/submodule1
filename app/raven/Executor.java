package raven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
	private static ExecutorService executorService;
	private static int threads = 5;
	
	public static ExecutorService getExecutorService() {
		if(executorService==null) {
			executorService = Executors.newFixedThreadPool(threads);
		}
		return executorService;
	}
	
	public static void shutdownExecutorService() {
		if(executorService!=null) {
			executorService.shutdown();
		}
	}

	public static int getThreads() {
		return threads;
	}

	public static void setThreads(int t) {
		threads = t;
	}
}
