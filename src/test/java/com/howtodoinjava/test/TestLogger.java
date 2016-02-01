package com.howtodoinjava.test;

import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2/1/2016.
 */
public class TestLogger {

    public static void main(String [] argus){
//        PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));
        Logger log = Logger.getLogger(TestLogger.class);
        log.error("hello");
    }
}
