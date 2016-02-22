package com.howtodoinjava.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * Created by Administrator on 2/16/2016.
 */
public class UnitTestBase {
    private ClassPathXmlApplicationContext context;

    private String springXmlpath;

    public UnitTestBase(String springXmlpath){
        this.springXmlpath = springXmlpath;
    }

    @Before
    public void before(){
        if(StringUtils.isEmpty(springXmlpath)){
            springXmlpath = "classpath:spring-*.xml";
        }

        try{
            String [] sl = springXmlpath.split("[,\\s]+");
            System.out.println("Print out split list:");
            for(int i = 0; i < sl.length; i++){
                System.out.println(sl[i]);
            }

            context = new ClassPathXmlApplicationContext(springXmlpath.split("[,\\s]+"));
            context.start();
        }catch(BeansException be){
            be.printStackTrace();
        }
    }

    @After
    public void after(){
        context.destroy();
    }

    protected Object getBean(String beanName){
        try{
            return context.getBean(beanName);
        }catch(BeansException be){
            be.printStackTrace();
            return null;
        }
    }

}
