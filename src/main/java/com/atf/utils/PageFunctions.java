package com.atf.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class PageFunctions {

    WebDriver driver;

    public PageFunctions(WebDriver driver){
        this.driver = driver;
    }

    public void click(WebElement element,String elName){
        try{
            element.click();
            System.out.println("Clicked at " + elName);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            System.out.println("Unable to click at " + elName);
        }
    }

    public void verifyText(WebElement element,String expectedText){
        try{
            if(element.getText().equals(expectedText)){
                System.out.println("text verified success.");
            }else{
                System.out.println("text verification failed");
            }
        }catch (NoSuchElementException e){
            System.out.println("Element not found to verify text.");
        }
    }

    public void scrollToView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
