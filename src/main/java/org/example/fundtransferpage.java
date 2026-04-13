//package org.example;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.*;
//import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Duration;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//public class fundtransferpage {
//
//    WebDriver driver;
//
//    @FindBy(name = "payersaccount")
//    WebElement payer;
//
//    @FindBy(name = "payeeaccount")
//    WebElement payee;
//
//    @FindBy(name = "ammount")
//    WebElement amount;
//
//    @FindBy(name = "desc")
//    WebElement description;
//
//    @FindBy(name = "AccSubmit")
//    WebElement submit;
//
//    public fundtransferpage(WebDriver driver) {
//        this.driver = driver;
//
//        AjaxElementLocatorFactory factory =
//                new AjaxElementLocatorFactory(driver, 10);
//        PageFactory.initElements(factory, this);
//    }
//
//
//    public void goToFundTransfer() {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        WebElement fundLink = wait.until(
//                ExpectedConditions.presenceOfElementLocated(By.linkText("Fund Transfer"))
//        );
//
//
//        ((JavascriptExecutor) driver).executeScript(
//                "arguments[0].scrollIntoView(true);", fundLink
//        );
//
//        // small pause for overlay to disappear
//        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
//
//        // JS click bypasses overlay completely
//        ((JavascriptExecutor) driver).executeScript(
//                "arguments[0].click();", fundLink
//        );
//
//    }
//
//    public void setPayer(String p) { payer.sendKeys(p); }
//    public void setPayee(String p) { payee.sendKeys(p); }
//    public void setAmount(String a) { amount.sendKeys(a); }
//    public void setDescription(String d) { description.sendKeys(d); }
//    public void clickSubmit() { submit.click(); }
//}
