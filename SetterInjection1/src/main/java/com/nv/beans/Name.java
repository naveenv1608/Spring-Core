package com.nv.beans;

import java.util.Scanner;

public class Name {
	String name="";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Scanner sc=new Scanner(System.in);
	String fullname=sc.nextLine();
	
	 
   public static String sendName(String name,String fullname) {
	  name=fullname;
	  return name;
   }

}
