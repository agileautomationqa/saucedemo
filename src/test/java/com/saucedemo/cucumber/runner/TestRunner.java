package com.saucedemo.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Hiral Yagnik
 * Project Name: Saucedemo
 */

@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.saucedemo.cucumber.steps"},
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/rerun.txt"},
        tags = ("@test")
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
