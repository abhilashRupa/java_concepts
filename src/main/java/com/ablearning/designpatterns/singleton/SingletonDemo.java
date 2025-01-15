package com.ablearning.designpatterns.singleton;

public class SingletonDemo {
	public static void main(String[] args){
		LogManagerDemo logManager1 = LogManagerDemo.getLogManagerInstance();
		System.out.println(logManager1.hashCode());

		LogManagerDemo logManager2 = LogManagerDemo.getLogManagerInstance();
		System.out.println(logManager2.hashCode());
	}
}

class LogManagerDemo{
	
	static LogManagerDemo logManager = new LogManagerDemo();
	
	private LogManagerDemo(){
		System.out.println("instance created.");
	};
	
	public static LogManagerDemo getLogManagerInstance(){
		return logManager;
	}
}

