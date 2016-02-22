package com.howtodoinjava.test;

import com.howtodoinjava.demo.bean.HelloBean;
import org.junit.Test;

/**
 * Created by Administrator on 2/16/2016.
 */
public class HelloBeanTest extends UnitTestBase {
    public HelloBeanTest(){
        super("classpath:spring-bean.xml");
    }

    @Test
    public void testall(){
        HelloBean bs = (HelloBean)super.getBean("helloBean");
        bs.helloBean();

        HelloBean bs2 = (HelloBean)super.getBean("helloBean");
        bs2.helloBean();
    }

    @Test
    public void test(){
        HelloBean bs = (HelloBean)super.getBean("helloBean");
        bs.helloBean();
    }
}
