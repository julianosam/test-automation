package com.target.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {
    private static WebDriver chromeDriver;

    static {

        WebDriverManager.chromedriver().setup();
        ChromeOptions opcoesChrome = new ChromeOptions();
        opcoesChrome.addArguments("--start-maximized");
        chromeDriver = new ChromeDriver(opcoesChrome);

    }

    public static WebDriver getChromeDriver() {
        return chromeDriver;
    }


}