package uk.co.xyz.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.xyz.utility.Utility;

public class BankMangerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankMangerLoginPage.class.getName());
   @FindBy(xpath = "//button[@class='btn btn-lg tab btn-primary']")
   WebElement _openAC;

   public void ClickOnOpenAc(){
       Reporter.addStepLog("Clicking onopen ac " + _openAC.toString());
       clickOnElement(_openAC);
       log.info("Clicking onopen ac " + _openAC.toString());

   }





    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement _addcutomerLink;

    @FindBy(id = "userSelect")
    WebElement _yourNameField;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement _loginBtn;

    @FindBy(xpath = "//label[contains(text(),'Your Name')]")
    WebElement _yourNameText;



    public void clickOnAddCustomerLink(){
        Reporter.addStepLog("add customer link"+_addcutomerLink.toString()+"<br>");
        clickOnElement(_addcutomerLink);
        log.info("add customer link"+_addcutomerLink.toString());
    }
    public void searchCustomer(String srchCust) {
        Reporter.addStepLog(" Search customer: " + _yourNameField.toString() + "<br>");
        waitUntilElementToBeClickable(_yourNameField, 20);
        selectByVisibleTextFromDropDown(_yourNameField, srchCust);
        log.info(" Search customer: " + _yourNameField.toString());
    }

    public void clickOnLoginButton() {
        Reporter.addStepLog(" Search customer: " + _yourNameField.toString() + "<br>");
        waitUntilElementToBeClickable(_loginBtn, 20);
        clickOnElement(_loginBtn);
        log.info(" Search customer: " + _yourNameField.toString());
    }

    public void verifyYourNameTextDisplayed(String yourName) {
        Reporter.addStepLog(" Verify your name: " + yourName + " is displayed " + _yourNameText.toString() + "<br>");
        waitUntilElementToBeClickable(_yourNameText, 20);
        verifyTextAssertMethod(_yourNameText, yourName);
        log.info(" Verify your name: " + yourName + " is displayed " + _yourNameText.toString());
    }

}
