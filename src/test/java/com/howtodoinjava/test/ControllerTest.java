package com.howtodoinjava.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Administrator on 2/15/2016.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class ControllerTest extends UnitTestBase{
    public ControllerTest(){
        super("classpath:spring-servlet.xml");
    }

    @Test
    public void test(){

    }
}
