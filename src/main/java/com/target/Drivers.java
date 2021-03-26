package com.target;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {

    private static Map<BrowserName, WebDriver> DRIVERS = new HashMap<>();

    static {

        WebDriverManager.chromedriver().setup();
        ChromeOptions opcoesChrome = new ChromeOptions();
        opcoesChrome.addArguments("--start-maximized");
        DRIVERS.put(BrowserName.CHROME, new ChromeDriver(opcoesChrome));

    }

    public static WebDriver get() {
        return DRIVERS.get(BrowserName.CHROME);
    }

    public enum BrowserName {
        CHROME
    }

}