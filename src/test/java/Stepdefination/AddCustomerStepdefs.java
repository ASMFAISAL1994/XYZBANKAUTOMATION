package Stepdefination;

import Core.Helper;
import POM.Element;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class AddCustomerStepdefs {
    public static WebDriver driver;

    Element element;


    @Given("base url")
    public void baseUrl() {
        Helper helper = new Helper();
        driver=helper.browser();


    }

    @When("click bank manager button And also click Add Customer button")
    public void clickBankManagerButtonAndAlsoClickAddCustomerButton() throws InterruptedException {
        element=new Element(driver);
        element.clickBankManagerAndCustomerButton();


    }

    @And("user will fillup {string}, {string}, {string}")
    public void userWillFillup(String firstName, String LastName, String Postcode) throws InterruptedException {
        element.firstnamelastnamepostcode(firstName,LastName,Postcode);

    }

    @And("user will click add customer button")
    public void userWillClickAddCustomerButton() throws InterruptedException {
        element.clickaddcustomerbutton();

    }

    @And("user will click alert ok button")
    public void userWillClickAlertOkButton() throws InterruptedException {
        element.userwillclickalertokbutton();

    }

    @Then("user find open account")
    public void userFindOpenAccount() {
    }
}
