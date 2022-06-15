package com.zensar.spring.core.demo;

import org.springframework.ontext.ApplicationContext;
import org.springframework.ontext.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext();
    	
       Vehicle obj = (Vehicle)context.getBean("vehicle");
       obj.drive();
    }
}