//package org.example;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
//import org.openqa.selenium.support.ui.Select;
//
//import java.rmi.server.UID;
//
////public class loginpage {
////
////    WebDriver driver ;
////    //By maillocator = By.id("email");
////   // By passlocator = By.id("pass");
////    //By LoginBtnlocator = By.id("loginBtn");
////   // By banktitlelocator= By.id("banktitle");
////    @FindBy(id="uid")
////    WebElement Uid;
////    @FindBy(id="passwd")
////    WebElement password;d
////    @FindBy(id="SubmitLogin")
////    WebElement LoginBtn;
////    @FindBy(id="bankTitle")
////    WebElement bankTitle;
////
////
////
////    public loginpage (WebDriver d){
////        this.driver=d;
////        PageFactory.initElements(new AjaxElementLocatorFactory(driver,2),this);
////
////    }
////
////
////    public void setMaillocator(String uid){
////        //driver.findElement(maillocator).sendKeys(mail);
////        Uid.sendKeys(uid);
////
////
////    }
////    public void setPasslocator(String pass){
////        //driver.findElement(passlocator).sendKeys(pass);
////        password.sendKeys(pass);
////
////    }
////    public void login(){
////        //driver.findElement(LoginBtnlocator).click();
////        LoginBtn.click();
////
////    }
////
////    public String getBanktitle(){
////        return bankTitle.getText();
////    }
////
////
////    public void setBanktitlelocator(String banktitle){
////      // driver.findElement(banktitlelocator).sendKeys(banktitle);
////    }
//
////}
//
//
//
//public class loginpage {
//
//    WebDriver driver;
//
//    By userName = By.name("uid");
//    By password = By.name("password");
//    By loginButton = By.name("btnLogin");
//    By bankTitle = By.className("barone");
//
//    public loginpage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void setUserName(String s) {
//        driver.findElement(userName).sendKeys(s);
//    }
//
//    public void setPassword(String s) {
//        driver.findElement(password).sendKeys(s);
//    }
//
//    public void clickLogin() {
//        driver.findElement(loginButton).click();
//    }
//
//    public String getBankTitle() {
//        return driver.findElement(bankTitle).getText();
//    }
//}
