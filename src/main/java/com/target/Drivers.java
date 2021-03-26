package com.target;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {

    private static WebDriver DRIVER;

    public static WebDriver get() {
        final BrowserName browserName = BrowserName.valueOf(Config.getTestBrowserName().toUpperCase());

        if (DRIVER == null) {
            DRIVER = load(browserName);
        }

        return DRIVER;

    }

    public static void close() {
        if (DRIVER != null) {
            DRIVER.quit();
        }
    }

    private static WebDriver load(BrowserName browserName) {

        switch (browserName) {
        case CHROME:
        default:
            WebDriverManager.chromedriver().setup();
            ChromeOptions opcoesChrome = new ChromeOptions();
            opcoesChrome.addArguments("--start-maximized");
            return new ChromeDriver(opcoesChrome);
        case FIREFOX:
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }

    }

    public enum BrowserName {
        CHROME, FIREFOX
    }

}