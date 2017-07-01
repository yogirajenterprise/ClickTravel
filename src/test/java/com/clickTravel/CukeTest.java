package com.clickTravel;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",format = "html:target/CucumberReport",tags = "@SmokeTest")
public class CukeTest
{
}
