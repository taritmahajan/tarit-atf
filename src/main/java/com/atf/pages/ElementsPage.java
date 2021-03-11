package com.atf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    WebDriver driver;

    @FindBy(xpath = "//li/span[text()='Text Box']")
    public WebElement LINK_TEXTBOX;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
}
