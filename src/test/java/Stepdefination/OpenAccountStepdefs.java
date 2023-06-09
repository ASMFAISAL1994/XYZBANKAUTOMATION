package Stepdefination;

import POM.Element;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Stepdefination.AddCustomerStepdefs.driver;

public class OpenAccountStepdefs {
    Element element;
    @Given("user in open account page")
    public void userInOpenAccountPage() throws InterruptedException {
        element=new Element(driver);
        element.userInOpenAccountPage();

    }

    @When("user select customer name")
    public void userSelectCustomerName() throws InterruptedException {
        element.userSelectCustomerName();

    }

    @And("user select currancy")
    public void userSelectCurrancy() {
        element.userSelectCurrancy();

    }

    @And("click process")
    public void clickProcess() {
        element.clickProcess();

    }

    @Then("account creat successfully")
    public void accountCreatSuccessfully() throws InterruptedException {
        element.accountCreatSuccessfully();
    }
}
