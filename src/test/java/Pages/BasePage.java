package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Driver.DriverManager.getDriver;

public class BasePage {


    private static JavascriptExecutor jse = (JavascriptExecutor) getDriver();


    protected static void clickElement(By by) {
        getDriver().findElement(by).click();

    }

    static String getPageTitle() {
        return getDriver().getTitle();
    }

    static void scrollDownJS() {
        jse.executeScript("window.scrollBy(0, document.body.scrollHeight);");
    }

    protected static WebElement getWebElement(By by) {
        return getDriver().findElement(by);
    }
}
