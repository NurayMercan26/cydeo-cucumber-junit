package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="prependedInput")
    public WebElement loginUser;

    @FindBy(id="prependedInput2")
    public WebElement loginpass;

    @FindBy(id= "_submit")
    public WebElement loginBtn;

    public void login (String username, String password){
        loginUser.sendKeys(username);
        loginpass.sendKeys(password);
        loginBtn.click();
    }


}
