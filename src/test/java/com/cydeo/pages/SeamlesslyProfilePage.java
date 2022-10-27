package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeamlesslyProfilePage {

    public SeamlesslyProfilePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id ="user")
    public WebElement inputUsername;

    @FindBy(id ="password")
    public WebElement inputPassword;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath= "//img[@src='/index.php/avatar/Employee111/32?v=35']")
    public WebElement dropdownButton;

    @FindBy(xpath= "//img [@src = '/apps/settings/img/admin.svg?v=c77e0e80']")
    public WebElement SettingButton;
    @FindBy(xpath= "//div[@class='profile__header']")
    public WebElement Access;
    @FindBy(xpath= "//a[@class='primary profile__header__container__edit-button']")
    public WebElement Edit;
    //div[@class='profile__header']

    ////a[@class='primary profile__header__container__edit-button']

    @FindBy(xpath= "//a[@aria-label='Change privacy level of profile picture']")
    public WebElement ProfileButton;

    @FindBy(xpath= "//span[.='Synchronize to trusted servers and the global and public address book']")
    public WebElement publicButton;
    @FindBy(xpath= "//*[@id=\"expanddiv\"]/ul/li[5]/a\t")
    public WebElement logout;



  // @FindBy(id= "oc-dialog-1-content-input")
 // public WebElement confirmPassword;


   @FindBy(id="displayname")
   public WebElement fullName;

//   @FindBy(xpath = "//span[@class='action-button__longtext']")
  //  public WebElement ScopeMenu;

    @FindBy(id="email")
    public WebElement Email;
    //span[@class='icon-federation-menu icon-link']
    //span[.='Only visible to people matched via phone number integration through Talk on mobile']
    @FindBy(xpath = "//span[@class='icon-federation-menu icon-link']")
    public WebElement menuItem;

    @FindBy(xpath = "//span[.='Only visible to people matched via phone number integration through Talk on mobile']")
    public WebElement privateButton;

    @FindBy(id="phone")
    public WebElement phone;

    @FindBy(id="address")
    public WebElement Address;

    @FindBy(id="language")
    public WebElement Language;

    @FindBy(id="localeinput")
    public WebElement LocaleInput;

    @FindBy(id="website")
    public WebElement Website;

    @FindBy(id="twitter")
    public WebElement Twitter;

    @FindBy(id="organization")
    public WebElement Organization;

    @FindBy(id="student")
    public WebElement Role;

    @FindBy(id="headline")
    public WebElement headline;

    @FindBy(id="biography")
    public WebElement biography;

}
