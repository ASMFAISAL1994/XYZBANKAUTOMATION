package Stepdefination;

import POM.Element;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static Stepdefination.AddCustomerStepdefs.driver;

//import static Stepdefinition.AddCustomerStepdefs.driver;
public class DeletStepdefs {
    Element element;
//    WebDriver driver;
    @Given("user in customer page")
    public void userInCustomerPage() throws InterruptedException {
        element=new Element(driver);
        element.userInCustomerPage();


    }

    @When("user search name")
    public void userSearchName() throws InterruptedException {

        element.userSearchName();

    }

    @And("deleat the account")
    public void deleatTheAccount() throws InterruptedException {
        element.deleatTheAccount();

    }

    @Then("successfully account will be deleted")
    public void successfullyAccountWillBeDeleted() {
    }
}
