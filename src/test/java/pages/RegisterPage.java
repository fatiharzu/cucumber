package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(id = "mobilephone")
    public WebElement phone;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement firstPassword;

    @FindBy(id = "secondPassword")
    public WebElement passwordConfirmation;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath= "//*[text()='Registration saved!']")
    public WebElement successMessage;


}
