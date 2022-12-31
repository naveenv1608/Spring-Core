package com.nv.reflectionapi;

public class ReflectionTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c=Class.forName(args[0]);
		Class c1=Class.forName(args[1]);
		Object obj=c.newInstance();
		Object obj1=c1.newInstance();
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		//com.nv.reflectionapi.ReflectionMain
	}

}
