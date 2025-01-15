package com.ablearning.designpatterns.singleton;

public class SingletonDoubleCheckedLock {
	
	public static void main(String[] args){
		Thread t1 = new Thread(() -> {
			LogManagerDoubleCheckedLock logManager1 = LogManagerDoubleCheckedLock.getLogManagerInstance();
		});
	
	
	Thread t2 = new Thread(() -> {
		LogManagerDoubleCheckedLock logManager2 = LogManagerDoubleCheckedLock.getLogManagerInstance();
	});
	
	t1.start();
	t2.start();
	
	}
}

class LogManagerDoubleCheckedLock{
	
	public static LogManagerDoubleCheckedLock logManager;
	
	private LogManagerDoubleCheckedLock(){
		System.out.println("LogManagerDoubleCheckedLock instance created");
	}
	
	public static LogManagerDoubleCheckedLock getLogManagerInstance(){
		if(logManager == null)
			synchronized(LogManagerDoubleCheckedLock.class){
				if(logManager == null)
					logManager = new LogManagerDoubleCheckedLock();		
			}
				
		return logManager;
	}
	
}


