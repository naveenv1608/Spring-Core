package com.nv.constructor;

public class ConstructorMain {
 String name="Veeramalla";
 
 
 public ConstructorMain(String name) {
	System.out.println(this.name);
	 System.out.println(name);
	 this.name=name;
	 System.out.println(this.name);
 }
}
