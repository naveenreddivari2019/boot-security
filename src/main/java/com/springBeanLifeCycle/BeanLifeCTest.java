package com.springBeanLifeCycle;

import com.springBeanLifeCycle.BeanLifeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeCTest {
    public static void main(String[] args) {
        ApplicationContext ctx=new  AnnotationConfigApplicationContext(BeanLifeConfiguration.class);
        ((AnnotationConfigApplicationContext) ctx).close();

    }
}
