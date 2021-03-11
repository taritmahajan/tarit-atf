package com.atf.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class DriverManager {

    public static WebDriver driver;


    public void initiateDriver(){
        System.out.println("before test called");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +
                "\\src\\main\\resources\\Drivers\\chromedriver_88.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void tearDown(){
            if(!driver.equals(null)) {
                driver.close();
            }
        }
    }

