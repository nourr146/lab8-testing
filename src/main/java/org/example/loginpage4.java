//package org.example;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.*;
//import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
//
//public class loginpage4 {
//
//    WebDriver driver;
//
//    @FindBy(name = "uid")
//    WebElement userName;
//
//    @FindBy(name = "password")
//    WebElement password;
//
//    @FindBy(name = "btnLogin")
//    WebElement loginBtn;
//
//    @FindBy(className = "barone")
//    WebElement title;
//
//    public loginpage4(WebDriver driver) {
//        this.driver = driver;
//
//        AjaxElementLocatorFactory factory =
//                new AjaxElementLocatorFactory(driver, 10);
//
//        PageFactory.initElements(factory, this);
//    }
//
//    public void setUserName(String u) {
//        userName.sendKeys(u);
//    }
//
//    public void setPassword(String p) {
//        password.sendKeys(p);
//    }
//
//    public void clickLogin() {
//        loginBtn.click();
//    }
//
//    public String getTitle() {
//        return title.getText();
//    }
//}
