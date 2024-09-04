package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @AfterMethod
    public void AfterTest(){
        System.out.println("这是测试之后的方法");
    }

    //在测试方法执行之前执行
    @BeforeMethod
    public void BeforeTest(){
        System.out.println("这是测试之前的方法");
    }

    //测试方法2
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是测试类之前的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是测试类之后的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("这是测试套件之前的方法");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("这是测试套件之后的方法");
    }

}
