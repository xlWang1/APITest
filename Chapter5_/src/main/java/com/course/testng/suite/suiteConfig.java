package com.course.testng.suite;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
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

    @BeforeGroups("stu")
    public void beforeGroupsOnStu(){
        System.out.println("GroupsOnMethod中的beforeGroups运行");
    }
    @AfterGroups("stu")
    public void afterGroupsOnStu(){
        System.out.println("GroupsOnMethod中的afterGroups运行");
    }


}

