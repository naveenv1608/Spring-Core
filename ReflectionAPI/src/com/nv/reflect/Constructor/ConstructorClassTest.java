package com.nv.reflect.Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorClassTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
          Class c=Class.forName("com.nv.reflect.Constructor.Test");
          Constructor con[]=c.getDeclaredConstructors();
          Object obj= con[0].newInstance();
          System.out.println(obj.toString());
           System.out.println("======================================");
          Object obj1= con[1].newInstance(5,"Naveen");
          System.out.println(obj.toString());
           System.out.println("======================================");
           
          
           
          
	}

}
