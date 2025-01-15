package com.ablearning.designpatterns.singleton;

public class SingletonLazyDemo {
	public static void main(String[] args){
		
		LogManager logManager1 = LogManager.getLogManagerInstance();
		LogManager logManager2 = LogManager.getLogManagerInstance();
		
		System.out.println(logManager1.hashCode());
		System.out.println(logManager2.hashCode());
		
	}
}

class LogManager{
	
	static LogManager logManager;
	
	private LogManager(){
		System.out.println("instance created.");
	}
	
	public static LogManager getLogManagerInstance(){
		if(logManager==null)
			logManager = new LogManager();
		return logManager;

		
	}
	
}
