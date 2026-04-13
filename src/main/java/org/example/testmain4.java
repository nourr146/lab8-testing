//package org.example;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.openqa.selenium.Alert;
//
//import java.time.Duration;
//
//public class testmain4 {
//
//    WebDriver driver = new ChromeDriver();
//
//    @Test
//    public void testFundTransfer() {
//
//        driver.get("http://demo.guru99.com/V4/");
//
//        loginpage4 log =
//                new loginpage4(driver);
//
//        fundtransferpage fund =
//                new fundtransferpage(driver);
//
//        log.setUserName("mngr658738");
//        log.setPassword("yzYnyjA");
//        log.clickLogin();
//
//
//        fund.goToFundTransfer();
//
//        fund.setPayer("999999");
//        fund.setPayee("000000");
//        fund.setAmount("1000");
//        fund.setDescription("test");
//        fund.clickSubmit();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//
//        String msg = alert.getText();
//        alert.accept();
//
//        Assert.assertTrue(msg.contains("does not exist"));
//
//    }
//}
