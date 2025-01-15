package com.ablearning.designpatterns.singleton;

public class SingletonSynchronized {
	
	public static void main(String[] args){
		
		LogManagerSynchronized logmanager1 = LogManagerSynchronized.getLogManagerInstance();
		LogManagerSynchronized logmanager2 = LogManagerSynchronized.getLogManagerInstance();
		
	}
	
}

class LogManagerSynchronized{
	
	static LogManagerSynchronized logmanager;
	
	private LogManagerSynchronized(){
		System.out.println("instance created");
	}
	
	public static LogManagerSynchronized getLogManagerInstance(){
		if (logmanager == null)
			logmanager = new LogManagerSynchronized();
		
		return logmanager;
	}
	
	
}
