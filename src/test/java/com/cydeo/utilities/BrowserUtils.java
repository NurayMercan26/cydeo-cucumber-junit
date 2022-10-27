package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    /*
   This method will accept int (in seconds)and execute Tread.sleep for given duration
    */
    public static void sleep(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch(InterruptedException e){

        }
    }

    /*
    this method accepts  3 argumets.
    Arg1: webdriver
    Arg2: expectedInUrl : for verify if the url contains given string.
       - ıf condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */
    public static void switchWindowAndVerify( String expectedInUrl, String expectedInTitle){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: "+Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains("expectedInUrl")){
                break;
            }
        }

//5. Assert: Title contains “Etsy”

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }
    /*
    This method accepts a string "expectedTitle"and asserts if it is true
     */
    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }
    /*
    creating a utility method for Explicit Wait so we don't have to repeat the lines
     */
   // public static void waitForInvisibilityOf(WebElement webElement){

        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
       // wait.until(ExpectedConditions.invisibilityOf(webElement));

   // }

    /**
     * This method will accept a String as expected value and verify  with actual URL contains the value.
     * @param expectedInURL : you can explain here
     */
    public static void verifyURLContains(String expectedInURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }

    /**
     * This method will accept a dropdown as a Webelement and return
     * all of the options text in a List of String
     * @param dropdownElement
     * @return
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){

        //List of all ACTUAL  month <options> as a web element
        Select select = new Select(dropdownElement);
        List<WebElement>actualOptionsWebElement = select.getOptions();
        // List of all ACTUAL month <options> as astring
        List<String>actualOptionsAsString= new ArrayList<>();
        for (WebElement each : actualOptionsWebElement) {
            actualOptionsAsString.add(each.getText());
        }
        return actualOptionsAsString;
    }

    /**
     * This method will accept a group radio buttons as list of Webelement
     * It will loop through the list, and click to the radio button with provided attributeValue
     * @param radioButtons
     * @param attributeValue
     */
    public static void clickRadiobutton(List<WebElement> radioButtons,String attributeValue){

        for (WebElement each : radioButtons) {

            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }

        }

    }

}
