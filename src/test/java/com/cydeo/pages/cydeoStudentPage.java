package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cydeoStudentPage {

    public cydeoStudentPage(){

            PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
        }

        @FindBy(id = "inputEmail")
        public WebElement searchBox;

        @FindBy (id="inputPassword")
        public WebElement Password;

        @FindBy (xpath = " //button[@class='btn btn-lg btn-primary btn-block']")
        public WebElement Button;

        public void login(String usarname, String password){
          searchBox.sendKeys(usarname);
          Password.sendKeys(password);
          Button.click();

        }


    }

