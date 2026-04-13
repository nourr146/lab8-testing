package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    WebDriver driver ;
    By locator = By.xpath("username");
    @FindBy (xpath="user")
    WebElement user ;
    public Homepage( WebDriver d){
        this.driver=d;
        PageFactory.initElements(driver,this);
    }
    public String getHomePageDashUsername(){
        return user.getText();
    }



}
