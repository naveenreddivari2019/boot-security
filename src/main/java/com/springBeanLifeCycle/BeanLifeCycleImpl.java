package com.springBeanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

@Component
public class BeanLifeCycleImpl implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware, BeanFactoryAware, BeanPostProcessor {
//https://springframework.guru/spring-bean-lifecycle/
    public BeanLifeCycleImpl(){
        System.out.println("BeanLifeCycleImpl Constrctor.....");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy called....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init called....");
    }
    @PreDestroy
    public void destroyC() throws Exception {
        System.out.println("Cust Destroy called....");
    }
    @PostConstruct
    public void init() throws Exception {
        System.out.println("Cust Init called....");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware...........");
        System.out.println("setBeanFactory:: AwareBeanImpl singleton= "
                + beanFactory.isSingleton("beanLifeCycleImpl"));
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("BeanNameAware...............");
        System.out.println("setBeanName:: Bean Name defined in context= "
                + beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.printf("postProcessBeforeInitialization..........");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.printf("postProcessAfterInitialization..........");
        return null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext method of AwareBeanImpl is called");
        System.out.println("setApplicationContext:: Bean Definition Names= "
                + Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }
}
