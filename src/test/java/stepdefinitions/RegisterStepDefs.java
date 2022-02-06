package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegisterStepDefs {
    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();
    @Given("User is on register page")
    public void user_is_on_register_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmiBank_registration_url"));

    }
    @Given("user sends ssn {string}")
    public void user_sends_ssn(String string) {
     //   registerPage.ssnBox.sendKeys(ssnNumber);
        string = faker.idNumber().ssnValid();
        Driver.waitAndSendText(registerPage.ssnBox,string, 1);
    }
    @Given("user sends firstname as {string} and lastname as {string}")
    public void user_sends_firstname_as_and_lastname_as(String string, String string2) {
  //      registerPage.firstName.sendKeys(firstName);
  //      registerPage.lastName.sendKeys(lastName);
        string=faker.name().firstName();
        string2=faker.name().lastName();
        Driver.waitAndSendText(registerPage.firstName,string,1);
        Driver.waitAndSendText(registerPage.lastName,string2, 1);
    }

    @When("user sends address as {string}")
    public void user_sends_address_as(String address) {
        Driver.waitAndSendText(registerPage.address,address,1);
    }
    @Given("user sends phone number as {string}")
    public void user_sends_phone_number_as(String phoneNumber) {
 //       registerPage.phone.sendKeys(phoneNumber);
        Driver.waitAndSendText(registerPage.phone,phoneNumber, 1);
    }
    @Given("user sends username as {string}")
    public void user_sends_username_as(String userName) {
//        registerPage.username.sendKeys(userName);
        Driver.waitAndSendText(registerPage.username,userName,1);
    }
    @When("user sends  email as {string}")
    public void user_sends_email_as(String string) {
        string = faker.internet().emailAddress();
        Driver.waitAndSendText(registerPage.email,string,1);
    }
    @Given("user sends new password as {string}")
    public void user_sends_new_password_as(String firstPassword) {

        registerPage.firstPassword.sendKeys(firstPassword);
    }
    @Given("user sends second password as {string}")
    public void user_sends_second_password_as(String passwordConfirmation) {
        registerPage.passwordConfirmation.sendKeys(passwordConfirmation);
    }
    @Given("user clicks register button")
    public void user_clicks_register_button() {

        Driver.waitAndClick(registerPage.registerButton,1);
    }
    @Then("user see pop up {string}")
    public void user_see_pop_up(String successMessage) {
        Driver.wait(1);

       Assert.assertTrue(registerPage.successMessage.isDisplayed());
    }
    @Then("user close application")
    public void user_close_application() {

        Driver.closeDriver();
    }



}

