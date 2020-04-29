package uk.co.xyz.cucumber.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.xyz.pages.AccountPage;
import uk.co.xyz.pages.CustomerLoginPage;
import uk.co.xyz.pages.HomePage;

public class MyStepdefs {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on customer link$")
    public void iClickOnCustomerLink() {
        new HomePage().clickOnCustomerLoginTab();
    }

    @And("^I select customer name form drop down$")
    public void iSelectCustomerNameFormDropDown() {
        new CustomerLoginPage().searchCustomer("Harry Potter");
    }

    @Then("^I click on log in button$")
    public void iClickOnLogInButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @And("^I click on deposit link$")
    public void iClickOnDepositLink() {
        new AccountPage().clickOnDepositTab();
    }

    @And("^I enter amount to be deposited \"([^\"]*)\"$")
    public void iEnterAmountToBeDeposited(String amount) {
        new AccountPage().enterAmount(amount);

    }

    @And("^I click on deposit button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositButton();
    }

    @Then("^I should see message successfully$")
    public void iShouldSeeMessageSuccessfully() {
        new AccountPage().verifyMessageDepositSuccessful("Deposit Successful");
    }
}
