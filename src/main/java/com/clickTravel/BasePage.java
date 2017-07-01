package com.clickTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 .
 * This is the base page
 */
public class BasePage
{
    public static WebDriver driver;

    BasePage(){
        PageFactory.initElements(driver,this);
    }
}
