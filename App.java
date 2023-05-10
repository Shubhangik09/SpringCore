package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/configure.xml");
//     Student student=(Student) context.getBean("stud");
//     System.out.println(student);
     Student student1=(Student) context.getBean("stud1");
     System.out.println(student1);
    }
}
