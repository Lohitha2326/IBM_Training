package com.ibm.MySpringApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
  public static void main(String[] args) {
	  //creates object 
    ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    
    //accessing the methods using object created by application context
    Developer d1=(Developer) context.getBean("dev1");//id name is dev1
    d1.a=100;
    System.out.println(d1.a);
    
    Developer d2=(Developer) context.getBean("dev1");
    System.out.println(d2.a);
    
    
    d1.code();
    
    
    
    
  }
}
