package com.clickTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 */
public class LoginPage extends Utils {






    public void enterUserName()
    {
        driver.findElement(By.id("emailAddress")).sendKeys("qualityassurance@clicktravel.com");

    }

    public void enterPassword()
    {
        driver.findElement(By.id("password")).sendKeys("Testing123");
    }

    public void clickOnSignInButton()
    {
        driver.findElement(By.xpath("//form[@id='credentials']/fieldset/div[3]/button")).click();
    }
}
