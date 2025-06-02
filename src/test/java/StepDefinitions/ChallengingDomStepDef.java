package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Pages.ChallengingDomPage.*;

public class ChallengingDomStepDef {

    @Given("User navigate to dynamic dom page")
    public void user_navigate_to_dynamic_dom_page() {

        Assert.assertEquals(onPage(), "The Internet");
    }


    @Then("User should see three buttons of color Blue, Red and Green in vertical order")
    public void user_should_see_three_buttons_of_color_blue_red_and_green_in_vertical_order() {
        Assert.assertTrue(isButtonLinksDisplayed());

    }

    @When("^User clicks on the (.*?) button$")
    public void user_clicks_on_the_blue_button(DataTable color) {
        List<String> list = color.asList();
        list.forEach(l-> clickTheColoredButton(l));
        Pattern pattern = Pattern.compile("^Answer:\\s*(\\d+)$");
        Matcher matcher = pattern.matcher(getAnswerValue());
        Assert.assertTrue(matcher.matches());
    }

    @When("^User clicks on the (.*?) button$")
    public void user_clicks_on_the_blue_button(String color) {
       clickTheColoredButton(color);

    }



    @Then("The answer should change")
    public void the_answer_should_change() {
        Pattern pattern = Pattern.compile("^Answer:\\s*(\\d+)$");
        Matcher matcher = pattern.matcher(getAnswerValue());
        Assert.assertTrue(matcher.matches());

    }
}
