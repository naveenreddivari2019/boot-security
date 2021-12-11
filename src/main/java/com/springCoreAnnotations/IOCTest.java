package com.springCoreAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    public static void main(String[] args) {
        ApplicationContext ioc=new AnnotationConfigApplicationContext(SpringBeansFactory.class);
        Address addr=(Address) ioc.getBean("addr");
        System.out.printf("address : "+addr.getCity()+" | ");

/*        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
        Student s=(Student) ctx.getBean("student");
        System.out.println("s : "+s.getId()+" | "+s.getName());*/

        Student s=(Student) ioc.getBean("ss");
        System.out.println("s : "+s.getId()+" | "+s.getName()+" | "+s.getAddress().getCity());


    }
}
