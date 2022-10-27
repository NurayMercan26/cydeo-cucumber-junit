package com.cydeo.tests;

import com.cydeo.pages.SeamlesslyProfilePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestNgSeamlessly {
    SeamlesslyProfilePage seamlesslyProfilePage = new SeamlesslyProfilePage();

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @BeforeClass
    public static void setup(){
        System.out.println("---->BeforeClass is running!");
    }

    @AfterClass
    public static void teardownClass(){
        System.out.println("---->AfterClass is running");
    }



    @Test
    public void Test1(){

        //Enter username
        seamlesslyProfilePage.inputUsername.sendKeys("Employee111");

        //Enter Password
        seamlesslyProfilePage.inputPassword.sendKeys("Employee123");

        //Enter login button
        seamlesslyProfilePage.loginButton.click();
         //user click dropdown
        seamlesslyProfilePage.dropdownButton.click();

        //user clicks setting
        seamlesslyProfilePage.SettingButton.click();

        //Enter profile picture
        seamlesslyProfilePage.ProfileButton.click();

        //Enter public button
        seamlesslyProfilePage.publicButton.click();

        //User is on Seamlessly setting  page
        Driver.getDriver().get("https://qa.seamlessly.net/index.php/settings/user");

        //User is on Seamlessly setting  page
        System.out.println("User is on Seamlessly setting  page");

        //User enter name
        seamlesslyProfilePage.fullName.sendKeys("Nuray Mercan");

        //user enters write email
        seamlesslyProfilePage.Email.sendKeys("nuraymercan26@gmail.com");

        //user click menu Item
        seamlesslyProfilePage.menuItem.click();

        //user click private button
        seamlesslyProfilePage.privateButton.click();

        //user is  enter  phone number
        seamlesslyProfilePage.phone.sendKeys("05064231211");

        //user enter adress
        seamlesslyProfilePage.Address.sendKeys("421.sok.Batıkent");

        //user selects language
        WebElement language =seamlesslyProfilePage.Language;
        Select MultiLanguage = new Select(language);
        MultiLanguage.selectByVisibleText("English (US)");

        //user writes website
        seamlesslyProfilePage.Website.sendKeys("My life Nuray Mercan");
        //user writes twitter adress
        seamlesslyProfilePage.Twitter.sendKeys("@nuray");
        //user select local dropdown
        WebElement Locale = seamlesslyProfilePage.LocaleInput;
        Select MultiLocale = new Select(Locale);
        MultiLocale.selectByVisibleText("Turkish");

        //User see enter titles inside personal info under Profile Settings page
        System.out.println("User see enter titles inside personal info under Profile Settings page");
    }
}
