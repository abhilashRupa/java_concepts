package com.ablearning.designpatterns.singleton;

public class SingletonEnum {
	public static void main(String[] args){
		
			LogManagerEnum logManager1 = LogManagerEnum.INSTANCE;
			LogManagerEnum logManager2 = LogManagerEnum.INSTANCE;
			
			System.out.println(logManager1.hashCode());
			System.out.println(logManager2.hashCode());

			logManager1.i = 10;
			logManager1.show();

			logManager2.i = 20;
			logManager1.show();
		
	}
}

enum LogManagerEnum{
	INSTANCE;

	int i;
	public void show(){
		System.out.println(i);
	}
}
