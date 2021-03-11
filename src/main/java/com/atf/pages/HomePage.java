package com.atf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{

    WebDriver driver;

    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement LINK_ELEMENTS;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

}
