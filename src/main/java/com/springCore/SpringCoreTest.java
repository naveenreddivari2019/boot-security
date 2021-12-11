package com.springCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringCoreTest {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Student s1 = (Student) factory.getBean("studentbean");
        System.out.println(s1.getId() + " | " + s1.getName());

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s2 = (Student) ctx.getBean("studentbean");
        Address a1=(Address) ctx.getBean("address");
        a1.setCity("Bangalore");

        System.out.println(s2.getId() + " | " + s2.getName()+" | "+s2.getAddress().getCity()+" | "+s2.getCourse()+" | "
        +s2.getKvm());
        s2.M1();
        //ApplicationContext ctx1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s3 = (Student) ctx.getBean("studentbean");
        System.out.println(s1+" : "+s2+" : "+s3);
    }
}
