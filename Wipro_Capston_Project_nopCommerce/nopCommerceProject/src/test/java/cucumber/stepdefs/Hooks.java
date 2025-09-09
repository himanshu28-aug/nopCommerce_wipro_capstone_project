package cucumber.stepdefs;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.BasePage;

public class Hooks {

    @Before
    public void setUp() {
        BasePage.initializeDriver("https://demo.nopcommerce.com");
    }

    @After
    public void tearDown() {
        BasePage.quitDriver();
    }
}