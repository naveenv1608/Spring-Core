package com.nv.singleton;

public class SingletonClass {
	
	private static SingletonClass INSTANCE;
	
	private SingletonClass() {
		System.out.println("SingletonClass.SingletonClass()");
	}
	
	public static SingletonClass getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SingletonClass();
		}
		
		return INSTANCE;
	}
	
	public void generateMsg(String msg) {
		System.out.println(msg);
	}

}
