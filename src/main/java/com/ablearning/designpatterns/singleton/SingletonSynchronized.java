package com.ablearning.designpatterns.singleton;

public class SingletonSynchronized {
	
	public static void main(String[] args){
		
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				LogManagerSynchronized logmanager1 = LogManagerSynchronized.getLogManagerInstance();
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				LogManagerSynchronized logmanager2 = LogManagerSynchronized.getLogManagerInstance();
			}
		});

		t1.start();
		t2.start();

	}
	
}

class LogManagerSynchronized{
	
	static LogManagerSynchronized logmanager;
	
	private LogManagerSynchronized(){
		System.out.println("LogManagerSynchronized instance created");
	}
	
	public static synchronized LogManagerSynchronized getLogManagerInstance(){
		if (logmanager == null)
			logmanager = new LogManagerSynchronized();
		
		return logmanager;
	}
}
