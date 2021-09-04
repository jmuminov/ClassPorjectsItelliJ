package com.syntax.class24.castingdemo.polymorphismdemo;

public class Tester {
    public static void main(String[] args) {
        //WebDriver webDriver = new GoogleChrome();
        WebDriver[] webDrivers = {new GoogleChrome(), new FireFox(), new IE(), new Safari()};
        for(WebDriver drive: webDrivers) {
            testOnAllBrowsers(drive);
        }
    }
    static void testOnAllBrowsers(WebDriver webDriver) {
        webDriver.openBrowser();
        webDriver.loadWebsite("www.google.com");
        webDriver.Test1();
        webDriver.Test2();
        webDriver.TestFileDownload();
        webDriver.closeBrowser();
    }
}
