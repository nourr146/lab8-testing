//package org.example;
//import org.openqa.selenium.*;
//
//
//public class newcustpage {
//    WebDriver driver;
//
//    By newCustomerLink = By.linkText("New Customer");
//    By name = By.name("name");
//    By gender = By.xpath("//input[@value='f']"); // female
//    By dob = By.name("dob");
//    By address = By.name("addr");
//    By city = By.name("city");
//    By state = By.name("state");
//    By pin = By.name("pinno");
//    By mobile = By.name("telephoneno");
//    By email = By.name("emailid");
//    By password = By.name("password");
//    By submit = By.name("sub");
//
//    public newcustpage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void newcust() {
//        driver.findElement(newCustomerLink).click();
//    }
//
//    public void fillCustomerForm(String n, String d, String addr,
//                                 String c, String p, String m,
//                                 String e, String pass) {
//        driver.findElement(name).sendKeys(n);
//        driver.findElement(gender).click();
//        driver.findElement(dob).sendKeys(d);
//        driver.findElement(address).sendKeys(addr);
//        driver.findElement(city).sendKeys(c);
//        driver.findElement(state).sendKeys("Pennsylvania");
//        driver.findElement(pin).sendKeys(p);
//        driver.findElement(mobile).sendKeys(m);
//        driver.findElement(email).sendKeys(e);
//        driver.findElement(password).sendKeys(pass);
//    }
//
//    public void clickSubmit() {
//        driver.findElement(submit).click();
//    }
//}