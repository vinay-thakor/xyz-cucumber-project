package uk.co.xyz.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.xyz.utility.Utility;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());


    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement _firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement _lastNameField;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement _postCodeField;

    @FindBy(css = "button.btn.btn-default")
    WebElement _addCustomerBtn;

    public void enterFirstName(String firstname) {
        //String firstname = "vinay " + Utility.getRandomString(2);
        Reporter.addStepLog(" Enter first name: " + firstname + " in the field " + _firstNameField.toString() + "<br>");
        waitUntilElementToBeClickable(_firstNameField, 10);
        sendTextToElement(_firstNameField, firstname);
        log.info(" Enter first name: " + firstname + " in the field " + _firstNameField.toString());
    }

    public void enterLastName(String lName) {
        Reporter.addStepLog(" Enter last name: " + lName + " in the field " + _lastNameField.toString() + "<br>");
        waitUntilElementToBeClickable(_lastNameField, 10);
        sendTextToElement(_lastNameField, lName);
        log.info(" Enter last name: " + lName + " in the field " + _lastNameField.toString());
    }

    public void enterPostCode(String pcode) {
        Reporter.addStepLog(" Enter postcode: " + pcode + " in the field " + _postCodeField.toString() + "<br>");
        waitUntilElementToBeClickable(_postCodeField, 10);
        sendTextToElement(_postCodeField, pcode);
        log.info(" Enter postcode: " + pcode + " in the field " + _postCodeField.toString());
    }

    public void clickOnAddCustomerButton(String popTxt) {
        Reporter.addStepLog(" Click on AddCustomer button: " + _addCustomerBtn.toString() + "<br>");
        waitUntilElementToBeClickable(_addCustomerBtn, 10);
        clickOnElement(_addCustomerBtn);

        verifyTextAssertMethodForAlert(popTxt);
        alertAccept();

        log.info(" Click on AddCustomer button: " + _addCustomerBtn.toString());
    }
    public void clickOnAddCustomer(){
        Reporter.addStepLog("clicking on add custome tab " + _addCustomerBtn.toString());
               clickOnElement(_addCustomerBtn);
         Alert alert = driver.switchTo().alert();
         alert.accept();
        log.info("clicking on add custome tab " + _addCustomerBtn.toString());
    }

}
