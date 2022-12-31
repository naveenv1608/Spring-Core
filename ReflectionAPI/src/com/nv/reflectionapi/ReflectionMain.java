package com.nv.reflectionapi;

public class ReflectionMain {
	
	int a=10;
	String b="Hello";
	
	public ReflectionMain(){
		System.out.println("ReflectionMain.ReflectionMain()  :: 0- param constructor");
		
	}

	@Override
	public String toString() {
		return "ReflectionMain [a=" + a + ", b=" + b + "]";
	}
	
	

}
