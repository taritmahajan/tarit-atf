package com.atf.stepDef;

import com.atf.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;


public class CommonSteps extends DriverManager{

    @Given("open the website")
    public void open_the_website() {
        driver.get("https://demoqa.com/");
    }

}
