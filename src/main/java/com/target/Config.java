package com.target;

public class Config {

    private final static String DEFAULT_BASE_URL = "http://www.google.com";
    private final static String DEAFAULT_BROWSER = "chrome";

    public static String getBaseUrl() {
        String baseUrl = System.getProperty("com.target.baseUrl");
        return baseUrl != null && !"".equals(baseUrl) ? baseUrl : DEFAULT_BASE_URL;
    }

    public static String getTestBrowserName() {
        String testBrowser = System.getProperty("com.target.browser");
        return testBrowser != null && !"".equals(testBrowser) ? testBrowser : DEAFAULT_BROWSER;
    }
}
