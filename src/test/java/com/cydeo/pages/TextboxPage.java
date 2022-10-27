package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextboxPage {
    public TextboxPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "userName")
    public WebElement fullName;

    @FindBy(id = "userEmail-Wrapper")
    public WebElement Email;

    @FindBy(id = "currentAddress")
    public WebElement currentAdress;

    @FindBy(id = "submit")
    public WebElement submitBtn;
}
