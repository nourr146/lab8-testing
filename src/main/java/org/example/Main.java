package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) throws InterruptedException{
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("htpps://demo.guru99.com/test/login.html");
//        WebElement mail = driver.findElement(By.id("email"));
//        WebElement pass = driver.findElement(By.id("passwd"));
//
//        Thread.sleep(1000);
//        mail.sendKeys("");
//        pass.sendKeys("");
//        Thread.sleep(1000);
//        mail.clear();
//        pass.clear();
//        Thread.sleep(1000);
//        mail.submit();
//        pass.submit();
//
//
//
//        WebElement Button = driver.findElement(By.id("Submitlogin"));
//        Button.click();
//
//        WebElement radio = driver.findElement(By.id(""));
//        if (!radio.isSelected()) {
//            radio.click();
//
//            System.out.println(radio.isSelected());
//        }
//   k     WebElement el = driver.findElement(By.name(""));
//  k      Select select = new Select(el);
// k       select.selectByIndex(0);
//k        List<WebElement>els = select.getOptions();
//
//
//        WebElement checkbx = driver.findElement(By.id(""));
//        for (int i = 0; i<=2; i++){
//            checkbx.click();
//            Thread.sleep(1000);
//        }
//
//        WebElement lst=driver.findElement(By.id("30"));
//        Select v1 = new Select(lst);
//        v1.selectByVisibleText("Banana");
//        WebElement st=driver.findElement(By.id("40"));
//        Select v2 = new Select(lst);
//        v1.selectByVisibleText("Egypt");
//
//
//
//
//        String tbl=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
//        System.out.print(tbl);
//
//
//k  hands on 2
//k        for ( int i=0;i<all.size();i++){
//k            String str=all.get(1).getText();
//k            System.out.print(str);
//k        }
//
//        WebElement fruit = driver.findElement(By.id("fruits"));
//        Select select2=new Select(fruit);
//        System.out.println(select2.isMultiple()
//        );
//        driver.get("");
//        WebElement tablecell=driver.findElement(By.xpath(""));
//        System.out.println(tablecell.getText());
//
//
//        driver.get("");
//        driver.findElement(By.id("")).sendKeys("your name");
//        driver.findElement(By.id("Try_it")).click();;
//
//        Alert alert =driver.switchTo().alert();
//        Thread.sleep(2000);
//        alert.accept();
//
//
//
//        driver.get("");
//
//
//
//        //
//
//        driver.get("htpps://demo.guru99.com/test/login.html");
//
//        driver.findElement(By.id("")).click();
//        Thread.sleep(2000);
//        Alert alert2 =driver.switchTo().alert();
//alert2.sendKeys("iyguy");
//        Thread.sleep(1000);
//        alert2.accept();
//
//
//        driver.findElement(By.id("")).sendKeys("12345");
//        Thread.sleep(2000);
//        driver.findElement(By.id("Submit")).click();
//        Alert alert3 =driver.switchTo().alert();
//        Thread.sleep(1000);
//        alert.dismiss();
//
//
//        driver.get("");
//        String parentwindow= driver.getWindowHandle();
//
//        driver.findElement(By.xpath("")).click();
//
//
//
//
//        for(String handle : driver.getWindowHandles()){
//            if (!handle.equals(parentwindow)){
//                driver.switchTo().window(handle);
//                System.out.println(driver.getTitle());
//                driver.close();
//            }
//
//        }
//        driver2.switchTo().window(parentwindow);
//        System.out.println(driver2.getTitle());


//        hands on 3
//       k WebDriverManager.chromedriver().setup();
//       k WebDriver driver = new ChromeDriver();
//       k driver.get("htpps://demo.guru99.com/test/login.html");
//
//
//       k loginpage login = new loginpage(driver);
//       // System.out.println(login.getBanktitlelocator());
//       k login.setMaillocator("mail@gmail.com");
//       k login.setPasslocator("123");
//       k String parentWindow = driver.getWindowHandle();
//       k login.login(); // click-login
//       k System.out.println(login.getBanktitle());







//        for (String handle: driver.getWindowHandles()){
//            if (!handle.equals(parentWindow)){
//                driver.switchTo().window(handle);
//            }
//        }
//       k Homepage homepage = new Homepage(driver);
//       k System.out.println(homepage.getHomePageDashUsername());









    }
}
