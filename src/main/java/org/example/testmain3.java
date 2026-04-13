//package org.example;
//import org.example.custconfirmpage;
//import org.example.loginpage;
//import org.example.newcustpage;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//;
//
//public class testmain3 {
//
//    WebDriver driver = new ChromeDriver() ;
//
//    @Test
//    public void testNewCustomer() {
//        driver.get("http://demo.guru99.com/V4/");
//
//        loginpage log = new loginpage(driver);
//        newcustpage ncust = new newcustpage(driver);
//        custconfirmpage confirm = new custconfirmpage(driver);
//
//        log.setUserName("mngr658738");
//        log.setPassword("yzYnyjA");
//        log.clickLogin();
//
//        ncust.newcust();
//
//        ncust.fillCustomerForm(
//                "Taylor Swift",
//                "13121989",
//                "Wall Street",
//                "Cairo",
//                "123456",
//                "01234567890",
//                "Tay" + System.currentTimeMillis() + "@mail.com",
//                "123456"
//        );
//
//        ncust.clickSubmit();
//
//        Assert.assertTrue(confirm.getSuccessMessage()
//                .contains("Customer Registered Successfully"));
//    }
//}