package com.cydeo.step_definitions;

import com.cydeo.pages.TextboxPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TextBox_StepDefinitions {

        TextboxPage textboxPage = new TextboxPage();

    @Given("User is on textbox home page")
    public void user_is_on_textbox_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("demogo.url"));
       // com.cydeo.utilities.Driver.getDriver().get("https://demoqa.com/text-box");
    }
    @When("user enter {string}")
    public void user_enter(String string) {
      textboxPage.fullName.sendKeys("Nuray Mercan");
    }
    @When("user write enter {string}")
    public void user_write_enter(String string) {
     textboxPage.Email.sendKeys("nuray@gmail.com");
    }
    @When("user  enters {string}")
    public void user_enters(String string) {
        textboxPage.currentAdress.sendKeys("4567.sok.Izmir");

    }
    @Then("user click to summit button")
    public void user_click_to_summit_button() {
        textboxPage.submitBtn.click();

    }




}
