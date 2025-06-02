package Driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
    private DriverManager() {
    }

    private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    public static void setDriver(WebDriver driver) {
        threadLocalDriver.set(driver);
    }

    public static void unloadDriver() {
        threadLocalDriver.remove();
    }
}
