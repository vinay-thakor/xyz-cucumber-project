package uk.co.xyz.cucumber.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.xyz.pages.*;

public class BankmanageSteps {
    @When("^I click on Bank Manager link$")
    public void iClickOnBankManagerLink() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @Then("^I click on add customer link$")
    public void iClickOnAddCustomerLink() {
        new BankMangerLoginPage().clickOnAddCustomerLink();

    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new AddCustomerPage().enterFirstName(firstName);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        new AddCustomerPage().enterLastName(lastName);

    }

    @And("^I enter Postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String postcode)  {
       new AddCustomerPage().enterPostCode(postcode);
    }

    @Then("^I click on Add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomer();

    }

    @Given("^I am on bank manager log in page$")
    public void iAmOnBankManagerLogInPage() {
        new BankMangerLoginPage().clickOnLoginButton();
    }

    @When("^I click on open account link$")
    public void iClickOnOpenAccountLink() {
        new BankMangerLoginPage().ClickOnOpenAc();

    }
    @And("^I select customer name form menu$")
    public void iSelectCustomerNameFormMenu() {
        new OpenAccountPage().searchCustomerCreatedInFirstTest("Harry Potter");

    }

    @And("^I select currency from menu$")
    public void iSelectCurrencyFromMenu() {
        new OpenAccountPage().selectCurrencyPound(6);
    }


    @Then("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton("Account created successfully with account Number ");
    }
}
