package com.atf.stepDef;

import com.atf.pages.ElementsPage;
import com.atf.pages.HomePage;
import com.atf.utils.DriverManager;
import com.atf.utils.PageFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class ElementsSteps extends DriverManager{

    public HomePage homePage;
    public ElementsPage elementsPage;
    public PageFunctions pageFunctions;

    @Before
    public void setup(){
        initiateDriver();
        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
        pageFunctions = new PageFunctions(driver);
    }

    @After
    public void endScenario(){
        tearDown();
    }

    @Then("navigate to Elements page")
    public void navigate_to_elements_page() {
        pageFunctions.scrollToView(homePage.LINK_ELEMENTS);
        pageFunctions.click(homePage.LINK_ELEMENTS,"Elements Option");
    }

    @Then("verify Textbox functionality")
    public void verify_textbox_functionality() {
        pageFunctions.click(elementsPage.LINK_TEXTBOX,"Textbox option");
    }

}

