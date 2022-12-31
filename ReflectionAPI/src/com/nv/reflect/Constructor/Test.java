package com.nv.reflect.Constructor;

public class Test {
    int a=10;
    String b="Naveen";
    
    
    public Test() {
    	System.out.println("Test.Test() :: 0 param Constructor" );
    }
    
    public Test(int a, String b) {
    	this.a=a;
    	this.b=b;
    	System.out.println("Test.Test() :: 2-param Constructor");
    	
    }

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
    
    
}
