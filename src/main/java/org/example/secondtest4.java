////package org.example;
////
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.testng.Assert;
////import org.testng.annotations.Test;
////import org.openqa.selenium.Alert;
////
////import java.time.Duration;
////
////
////public class secondtest4 {
////
////    @Test
////    public void testFundTransfer() {
////
////        WebDriver driver = new ChromeDriver();
////
////        try {
////            driver.get("http://demo.guru99.com/V4/");
////
////            loginpage4 log = new loginpage4(driver);
////            fundtransferpage fund = new fundtransferpage(driver);
////
////            log.setUserName("mngr658738");
////            log.setPassword("yzYnyjA");
////            log.clickLogin();
////
////            fund.goToFundTransfer();
////
////            fund.setPayer("181302");
////            fund.setPayee("181303");
////            fund.setAmount("1000");
////            fund.setDescription("test");
////            fund.clickSubmit();
////
////            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
////
////            String msg = alert.getText();
////            alert.accept();
////
////            System.out.println("ALERT TEXT: " + msg);
////
////            Assert.assertTrue(
////                    msg.toLowerCase().contains("success") || msg.toLowerCase().contains("fund")
////            );
////
////        } finally {
////            driver.quit();
////        }
////    }
////}
//
//package org.example;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class secondtest4 {
//
//    @Test
//    public void testFundTransfer() {
//
//        WebDriver driver = new ChromeDriver();
//
//        try {
//            driver.get("http://demo.guru99.com/V4/");
//
//            loginpage4 log = new loginpage4(driver);
//            fundtransferpage fund = new fundtransferpage(driver);
//
//            // LOGIN
//            log.setUserName("mngr658738");
//            log.setPassword("yzYnyjA");
//            log.clickLogin();
//
//            // NAVIGATE TO FUND TRANSFER
//            fund.goToFundTransfer();
//
//            // USE SMALL AMOUNT (IMPORTANT FIX)
//            fund.setPayer("181293");
//            fund.setPayee("181297");
//            fund.setAmount("10");   //
//            fund.setDescription("test transfer");
//            fund.clickSubmit();
//
//            // HANDLE ALERT
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//
//            String msg = alert.getText();
//            alert.accept();
//
//            System.out.println("ALERT TEXT: " + msg);
//
//            // ASSERT SUCCESS (VALID CASE)
//            Assert.assertTrue(
//                    msg.toLowerCase().contains("success"),
//                    "Transfer did not succeed. Actual message: " + msg
//            );
//
//        } finally {
//            driver.quit();
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
