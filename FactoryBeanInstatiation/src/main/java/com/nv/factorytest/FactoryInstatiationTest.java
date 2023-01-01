package com.nv.factorytest;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryInstatiationTest {
   public static void main(String[] args) {
	   
	   //Creating IOC container
	 DefaultListableBeanFactory factory =new DefaultListableBeanFactory();
	 
	 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	 
	 reader.loadBeanDefinitions("com/nv/cfgs/applicationContext.xml");
	 
	 //getting spring bean class object 
	 Class cls=factory.getBean("c1", Class.class);
	 
	 System.out.println(cls.getClass()+"   "+cls.getName()+"    "+cls.toString());
   }
}
