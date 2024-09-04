package com.course.testng.groups;


import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethodTest {
    @Test(groups = "stu")
    public void test1(){
        System.out.println("GroupsOnMethod中的stu1运行");
    }
    @Test(groups = "stu")
    public void test2(){
        System.out.println("GroupsOnMethod中的stu2运行");
    }
    @Test(groups = "teacher")
    public void test3(){
        System.out.println("GroupsOnMethod中的teacher1运行");
    }
    @Test(groups = "teacher")
    public void test4(){
        System.out.println("GroupsOnMethod中的teacher2运行");
    }

}
