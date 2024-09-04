package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedExcption {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是我们期望的异常成功");
        throw new RuntimeException();
    }
}
