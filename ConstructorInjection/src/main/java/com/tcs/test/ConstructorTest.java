package com.tcs.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.tcs.beans.WishMessageGenerator;

public class ConstructorTest {

	public static void main(String[] args) {
		//set the file directory in an object
       // FileSystemResource fsr=new FileSystemResource("src/main/java/com/tcs/cfg/applicationContext.xml");
		ClassPathResource cpr=new ClassPathResource("com/tcs/cfg/applicationContext.xml");

        //Create the IOC container
       // XmlBeanFactory factory=new XmlBeanFactory(cpr);
        
		/*//get bean
		Object obj=factory.getBean("wmg");
		
		//Type casting 
		
		WishMessageGenerator wish=(WishMessageGenerator)obj;*/
        
      //get bean
       // WishMessageGenerator obj=factory.getBean("wmg",WishMessageGenerator.class);
		  //No need of typecasting
       // String result=obj.generateMessage("Naveen");
        //Type casting 
        
      //  WishMessageGenerator wish=(WishMessageGenerator)obj;
        //Calling generate message function
		// System.out.println(result);
        
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/tcs/cfg/applicationContext.xml");
        
      //get bean
        WishMessageGenerator obj=factory.getBean("wmg",WishMessageGenerator.class);
 		  //No need of typecasting
        String result=obj.generateMessage("Naveen");
        
       System.out.println(result);
	}

}
