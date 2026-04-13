//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//public class exercise2 {
//
//    WebDriver driver;
//
//    // ✅ 1. Browser setup (gets browser from XML)
//    @Parameters("browser")
//    @BeforeMethod
//    public void setup(String browser) {
//
//        if (browser.equalsIgnoreCase("chrome")) {
//            driver = new ChromeDriver();
//        } else {
//            driver = new FirefoxDriver();
//        }
//
//        driver.get("https://demo.guru99.com/test/login.html");
//    }
//
//    // ✅ 2. DataProvider (ONLY email + password)
//    @DataProvider(name = "loginData")
//    public Object[][] getData() {
//        return new Object[][]{
//                {"test@mail.com", "123"},
//                {"test@mail.com", "152"}
//        };
//    }
//
//    // ✅ 3. Test (ONLY 2 parameters — matches DataProvider)
//    @Test(dataProvider = "loginData")
//    public void loginTest(String email, String password) {
//
//        driver.findElement(By.id("email")).sendKeys(email);
//        driver.findElement(By.id("passwd")).sendKeys(password);
//        driver.findElement(By.id("SubmitLogin")).click();
//
//        String currentUrl = driver.getCurrentUrl();
//
//        // ✅ This website ALWAYS goes to success page
//        Assert.assertTrue(currentUrl.contains("success"));
//    }
//
//    // ✅ 4. Cleanup
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
//}
