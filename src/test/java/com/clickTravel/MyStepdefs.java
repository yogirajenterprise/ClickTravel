package com.clickTravel;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.clickTravel.BasePage.driver;

/**
 *
 */
public class MyStepdefs {

    LoginPage loginPage = new LoginPage();

    @Given("^a user with valid credentials$")
    public void aUserWithValidCredentials()  {

    }

    @When("^user enter username qualityassurance@clicktravelcom$")
    public void userEnterUsernameQualityassuranceClicktravelcom()  {
        loginPage.enterUserName();
    }

    @And("^enter password Testing123$")
    public void enterPasswordTesting()  {
        loginPage.enterPassword();
    }

    @Then("^authentication is successful$")
    public void authenticationIsSuccessful()  {
        loginPage.clickOnSignInButton();
    }

    @And("^the user can view his dashboard$")
    public void theUserCanViewHisDashboard()  {

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualText = driver.findElement(By.id("page-heading")).getText();
        Assert.assertEquals("User is not on DashBoard", "Hello QA",actualText);
    }
}
