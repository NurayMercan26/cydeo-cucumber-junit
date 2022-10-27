package com.cydeo.step_definitions;


import com.cydeo.pages.SeamlesslyProfilePage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Seamless_StepDefinitions {

    SeamlesslyProfilePage seamlesslyProfilePage = new SeamlesslyProfilePage();


    @Given("User is on Seamlessly home page")
    public void user_is_on_seamlessly_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }
    @When("user enters username")
    public void user_enters_username() {
          seamlesslyProfilePage.inputUsername.sendKeys("Employee111");
    }
    @When("user write enters password")
    public void user_write_enters_password() {
         seamlesslyProfilePage.inputPassword.sendKeys("Employee123");
    }
    @When("user click to login button")
    public void user_click_to_login_button() {
      seamlesslyProfilePage.loginButton.click();
    }
    @When("user click dropdown")
    public void user_click_dropdown() {
      seamlesslyProfilePage.dropdownButton.click();

    }
    @Then("user clicks setting")
    public void user_clicks_setting() {
       seamlesslyProfilePage.SettingButton.click();

    }


    @Then("user click profile picture")
    public void user_click_profile_picture() {
        seamlesslyProfilePage.ProfileButton.click();
    }
    @Then("user select published")
    public void user_select_published() {
       seamlesslyProfilePage.publicButton.click();
    }



    // orderPage.inputCity.sendKeys(string);
// //verify actual title contains string (coming from feature file)
    //        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    @Given("User is on Seamlessly setting  page")
    public void user_is_on_seamlessly_setting_page() {
       Driver.getDriver().get("https://qa.seamlessly.net/index.php/settings/user");
    }

    @When("user enter username")
    public void user_enter_username() {
        seamlesslyProfilePage.inputUsername.sendKeys("Employee111");
    }
    @When("user write enter password")
    public void user_write_enter_password() {
        seamlesslyProfilePage.inputPassword.sendKeys("Employee123");
    }

    @When("user click  login button")
    public void user_click_login_button() {
        seamlesslyProfilePage.loginButton.click();
    }

    @When("user enter  full name")
    public void user_enter_full_name() {
        seamlesslyProfilePage.fullName.sendKeys("Nuray Mercan");
    }
    @When("user enters write email")
    public void user_enters_write_email() {
        seamlesslyProfilePage.Email.sendKeys("nuraymercan26@gmail.com");
    }


    @When("user click menu Item")
    public void user_click_menu_ıtem() {
        seamlesslyProfilePage.menuItem.click();
    }
    @When("user click private button")
    public void user_click_private_button() {
        seamlesslyProfilePage.privateButton.click();
    }

    @When("user is  enter  phone number")
    public void user_is_enter_phone_number() {
       seamlesslyProfilePage.phone.sendKeys("05064231211");
    }
    @When("user enter adress")
    public void user_enter_adress() {
        seamlesslyProfilePage.Address.sendKeys("421.sok.Batıkent");

    }
    @When("user selects language")
    public void user_selects_language() {
        WebElement language =seamlesslyProfilePage.Language;
        Select MultiLanguage = new Select(language);
        MultiLanguage.selectByVisibleText("English (US)");

    }
    @When("user writes website")
    public void user_writes_website() {
      seamlesslyProfilePage.Website.sendKeys("My life Nuray Mercan");
    }
    @When("user writes twitter adress")
    public void user_writes_twitter_adress() {
        seamlesslyProfilePage.Twitter.sendKeys("@nuray");

    }
    @When("user select local dropdown")
    public void user_select_local_dropdown() {
        WebElement Locale = seamlesslyProfilePage.LocaleInput;
        Select MultiLocale = new Select(Locale);
        MultiLocale.selectByVisibleText("Turkish");

    }
    @Then("User see enter titles inside personal info under Profile Settings page")
    public void user_see_enter_titles_inside_personal_info_under_profile_settings_page() {
        System.out.println("User see enter titles inside personal info under Profile Settings page");
    }




}


