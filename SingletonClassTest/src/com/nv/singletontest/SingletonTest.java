package com.nv.singletontest;

import com.nv.singleton.SingletonClass;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonClass s1=SingletonClass.getInstance();
		SingletonClass s2=SingletonClass.getInstance();
		
		System.out.println(s1.hashCode() +"   "+s2.hashCode());
		
		
		System.out.println("is s1==s2"+(s1==s2));
		
		s1.generateMsg("Naveen");
	}

}
