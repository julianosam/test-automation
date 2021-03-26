package com.target.pages;

import com.target.Browser;
import com.target.Config;
import com.target.Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private static WebDriver driver = Drivers.get();

    public void openPage() {
        String url = Config.getBaseUrl() + "/search";
        Browser.goTo(url);
    }

    public void enterSearch(String search) {
        driver.findElement(By.className("gLFyf")).sendKeys(search);
    }

    public void hitEnterOnSearch() {
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.RETURN);
    }

}
