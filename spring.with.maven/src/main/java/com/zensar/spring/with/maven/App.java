package com.zensar.spring.with.maven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




import com.zensar.beans.Student;



public class App {
public static void main(String[] args) {



ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");



Student student = context.getBean("s1", Student.class);



System.out.println(student);

((AbstractApplicationContext) context).close();



}
}