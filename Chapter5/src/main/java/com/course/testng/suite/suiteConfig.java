package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class suiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("开始测试");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("测试结束");
    }
}

