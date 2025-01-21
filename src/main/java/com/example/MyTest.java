package com.example;

import org.testng.annotations.Test;
import io.qameta.allure.Step;

public class MyTest {

    @Test
    public void testMethod() {
        step1();
        step2();
    }

    @Step("Step 1")
    public void step1() {
        // Step 1 code here
    }

    @Step("Step 2")
    public void step2() {
        // Step 2 code here
    }
}
