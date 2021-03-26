package com.target.pages;

import com.target.drivers.Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static WebDriver driver = Drivers.getChromeDriver();

    public void navigateTo() {
        driver.get("http://www.google.com");
    }

    public void clickLoginButton(){
        
    }

    public void setUserName(String userName) {
        driver.findElement(By.className("gLFyf")).sendKeys(userName);
    }

    public void setPassword(String userName) {
        // input.setText()
    }
    
}
