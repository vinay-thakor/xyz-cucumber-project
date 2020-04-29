$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/xyz/resources/featurefile/Bankmanger.feature");
formatter.feature({
  "line": 1,
  "name": "Bank manager features",
  "description": "\r\nBank manager can open account successfully",
  "id": "bank-manager-features",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20514392900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can add customer successfully",
  "description": "",
  "id": "bank-manager-features;user-can-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Bank Manager link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on add customer link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter first name \"Vinay\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter last name \"Thakor\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter Postcode \"W1t 6AB\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on Add customer button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 1078005300,
  "status": "passed"
});
formatter.match({
  "location": "BankmanageSteps.iClickOnBankManagerLink()"
});
formatter.result({
  "duration": 2398440000,
  "status": "passed"
});
formatter.match({
  "location": "BankmanageSteps.iClickOnAddCustomerLink()"
});
formatter.result({
  "duration": 148704000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vinay",
      "offset": 20
    }
  ],
  "location": "BankmanageSteps.iEnterFirstName(String)"
});
formatter.result({
  "duration": 559031000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thakor",
      "offset": 19
    }
  ],
  "location": "BankmanageSteps.iEnterLastName(String)"
});
formatter.result({
  "duration": 241526500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "W1t 6AB",
      "offset": 18
    }
  ],
  "location": "BankmanageSteps.iEnterPostcode(String)"
});
formatter.result({
  "duration": 239477700,
  "status": "passed"
});
formatter.match({
  "location": "BankmanageSteps.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 191733300,
  "status": "passed"
});
formatter.after({
  "duration": 207600,
  "status": "passed"
});
formatter.before({
  "duration": 15040348100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User can open account successfully",
  "description": "",
  "id": "bank-manager-features;user-can-open-account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am on bank manager log in page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I click on open account link",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I select customer name form menu",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select currency from menu",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on process button",
  "keyword": "Then "
});
formatter.match({
  "location": "BankmanageSteps.iAmOnBankManagerLogInPage()"
});
formatter.result({
  "duration": 11404875100,
  "status": "passed"
});
formatter.match({
  "location": "BankmanageSteps.iClickOnOpenAccountLink()"
});
formatter.result({
  "duration": 20126585200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@class\u003d\u0027btn btn-lg tab btn-primary\u0027]\"}\n  (Session info: chrome\u003d81.0.4044.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-59P8T20\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.122, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:58999}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3e4d8720e08a55004843c6ad1ed85e5b\n*** Element info: {Using\u003dxpath, value\u003d//button[@class\u003d\u0027btn btn-lg tab btn-primary\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat uk.co.xyz.utility.Utility.clickOnElement(Utility.java:129)\r\n\tat uk.co.xyz.pages.BankMangerLoginPage.ClickOnOpenAc(BankMangerLoginPage.java:17)\r\n\tat uk.co.xyz.cucumber.stepdefs.BankmanageSteps.iClickOnOpenAccountLink(BankmanageSteps.java:52)\r\n\tat ✽.When I click on open account link(src/test/java/uk/co/xyz/resources/featurefile/Bankmanger.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BankmanageSteps.iSelectCustomerNameFormMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankmanageSteps.iSelectCurrencyFromMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankmanageSteps.iClickOnProcessButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 865108700,
  "status": "passed"
});
});