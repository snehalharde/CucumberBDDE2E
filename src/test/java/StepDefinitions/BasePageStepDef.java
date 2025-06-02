package StepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import static Driver.Driver.initDriver;
import static Driver.Driver.quitDriver;

public class BasePageStepDef {

    @BeforeAll
    public static void before_all(){

        initDriver();
    }

    @AfterAll
    public static void after_all(){

        quitDriver();
    }


}
