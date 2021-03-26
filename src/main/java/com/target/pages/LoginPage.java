package com.target.pages;

import com.target.Browser;
import com.target.Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static WebDriver driver = Drivers.get();

    public void openPage() {
        Browser.goTo("http://www.google.com");
    }

    public void setUserName(String userName) {
        driver.findElement(By.className("gLFyf")).sendKeys(userName);
    }

    public void setPassword(String userName) {
        // input.setText()
    }

    public void clickLoginButton() {
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.RETURN);
    }

}
