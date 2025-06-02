package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

public class ChallengingDomPage extends BasePage {

    private static final By BUTTON_LINK = By.xpath("//div[@class='large-2 columns']/a");
    private static final By BUTTON = By.xpath("//a[@class='button']");
    private static final By BUTTON_ALERT = By.xpath("//a[@class='button alert']");
    private static final By BUTTON_SUCCESS = By.xpath("//a[@class='button success']");
    private static final By ANSWER_VALUE = By.cssSelector("div#content > script");


    public static String onPage(){
       return getPageTitle();
    }

    public static boolean isButtonLinksDisplayed(){
       return getWebElement(BUTTON_LINK).isDisplayed();
    }

    public static Color getButtonColor(){
        System.out.println(getWebElement(BUTTON).getCssValue("background-color"));
        return Color.fromString(getWebElement(BUTTON).getCssValue("background-color"));

    }

    public static String getRedButtonColor(){
        System.out.println(getWebElement(BUTTON_ALERT).getCssValue("background-color"));
        return getWebElement(BUTTON_ALERT).getCssValue("background-color");
    }
    public static String getSuccessButtonColor(){
        System.out.println(getWebElement(BUTTON_SUCCESS).getCssValue("background-color"));
        return getWebElement(BUTTON_SUCCESS).getCssValue("background-color");
    }

    public static void clickTheColoredButton(String color) {
        switch (color) {
            case "Blue":
                clickElement(BUTTON);
                break;
            case "Red":
                clickElement(BUTTON_ALERT);
                break;
            case "Green":
                clickElement(BUTTON_SUCCESS);
                break;

            default:
                System.out.println("clickElement(BUTTON)");
        }
    }

    public static String getAnswerValue(){
        String value=  getWebElement(ANSWER_VALUE).getDomProperty("text");
        System.out.println(value.substring(140,152));
        return value.substring(140,152);

    }
}
