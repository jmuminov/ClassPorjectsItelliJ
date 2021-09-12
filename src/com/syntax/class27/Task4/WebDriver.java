package com.syntax.class27.Task4;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriverInterface extends WebDriver, TakesScreenshotInterface {
    void navigate();
}
interface TakesScreenshotInterface{
    void getScreenshot();
}
class ChromeDriverClass implements RemoteWebDriverInterface{

    @Override
    public void navigate() {
        System.out.println("Navigating from Chrome");
    }

    @Override
    public void open() {
        System.out.println("Opening Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot");
    }
}
class FirefoxDriverClass implements RemoteWebDriverInterface{

    @Override
    public void open() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Firefox");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot");
    }
}
class SafariDriverClass implements RemoteWebDriverInterface{

    @Override
    public void open() {
        System.out.println("Opening Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to Safari");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot");
    }
}
