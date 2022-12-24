package com.nv.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nv.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//set the file directory in an object
        // FileSystemResource fsr=new FileSystemResource("src/main/java/com/nv/cfg/applicationContext.xml");
		
		ClassPathResource cpr=new ClassPathResource("com/nv/cfg/applicationContext.xml");
         
         //Create the IOC container
         XmlBeanFactory factory=new XmlBeanFactory(cpr);
         
         //get bean
         Object obj=factory.getBean("wmg");
         
         //Type casting 
         
         WishMessageGenerator wish=(WishMessageGenerator)obj;
         //Calling generate message function
         String result=wish.generateMessage("Naveen");
         
         System.out.println(result);
        
	}

}
