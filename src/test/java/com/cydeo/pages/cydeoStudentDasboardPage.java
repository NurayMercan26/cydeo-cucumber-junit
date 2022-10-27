package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class cydeoStudentDasboardPage {

    public cydeoStudentDasboardPage(){

            PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
        }


    @FindBy(xpath = " //li[@class= 'nav-item dropdown']")
    public WebElement dropdownButton;


    @FindBy(xpath = " //a[@class='dropdown-item']")
    public WebElement logout;


    public void logout() {

    dropdownButton.click();
    logout.click();
    }
    }

