package Driver;

import Utitlity.ConfigPropertyUtils;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static Driver.DriverManager.*;

public final class Driver {
    private Driver() {
    }

    public static void initDriver() {
        if (getDriver() == null) {
            WebDriver driver = DriverFactory.openBrowser();
            setDriver(driver);
            System.out.println(ConfigPropertyUtils.readProperty("url"));
            getDriver().get(ConfigPropertyUtils.readProperty("url"));
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            unloadDriver();
        }
    }
}
