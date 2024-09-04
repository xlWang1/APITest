package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        Object[][] o = new Object[][]{
                {"lisi",25}
        };
        return o;
    }
    @Test(dataProvider = "data")
    public void dataProviderTest(String name,int age){
        System.out.println("name = "+name+"; age = "+age);
    }

    @Test(dataProvider = "methoddata")
    public void test1(String name,int age){
        System.out.println("name = "+name+"; age = "+age);
    }
    @Test(dataProvider = "methoddata")
    public void test2(String name, int age) {
        System.out.println("name = "+name+"; age = "+age);
    }
    @DataProvider(name = "methoddata")
    public Object[][] methoddata(Method method){
        Object[][] o = null;
        if(method.getName().equals("test1")){
            o = new Object[][]{
                    {"zhangsan",25},
                    {"lisi",26}
            };
        }else if(method.getName().equals("test2")){
            o = new Object[][]{
                    {"wangwu",28},
                    {"zhaoliu",27}
            };
        }
        return o;
    }
}
