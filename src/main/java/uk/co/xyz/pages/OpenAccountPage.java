package uk.co.xyz.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.xyz.utility.Utility;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());
    @FindBy(id = "userSelect")
    WebElement _customerNameField;

    @FindBy(id = "currency")
    WebElement _currencyField;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement _processBtn;


    public void searchCustomerCreatedInFirstTest(String custSearch) {
        Reporter.addStepLog(" Search for Customer " + custSearch + " from the drop down " + _customerNameField.toString() + "<br>");
        waitUntilElementToBeClickable(_customerNameField, 20);
        selectByVisibleTextFromDropDown(_customerNameField, custSearch);
        log.info(" Search for Customer " + custSearch + " from the drop down " + _customerNameField.toString());
    }

    public void selectCurrencyPound(int index) {
        Reporter.addStepLog(" Select Currency from drop down: " + _currencyField.toString() + "<br>");
        waitUntilElementToBeClickable(_currencyField, 20);
        selectByIndexFromDropDown(_currencyField, index);
        log.info(" Select Currency from drop down: " + _currencyField.toString());
    }

    public void clickOnProcessButton(String popTxt) {
        Reporter.addStepLog(" Click on Process button: " + _processBtn.toString() + "<br>");
        waitUntilElementToBeClickable(_processBtn, 20);
        clickOnElement(_processBtn);
        verifyTextAssertMethodForAlert(popTxt);
        alertAccept();

        log.info(" Click on Process button: " + _processBtn.toString());
    }

}
