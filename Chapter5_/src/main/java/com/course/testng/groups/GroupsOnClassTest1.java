package com.course.testng.groups;

import org.testng.annotations.Test;
@Test(groups = "stu")
public class GroupsOnClassTest1 {
    @Test
    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1运行");
    }
    @Test
    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2运行");
    }
}
