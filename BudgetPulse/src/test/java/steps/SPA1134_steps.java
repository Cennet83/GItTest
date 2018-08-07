package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import utilities.BrowserUtils;
import utilities.Config;
import utilities.Driver;

public class SPA1134_steps {

    @Given("user launching the web browser")
    public void user_launching_the_web_browser() {
        BrowserUtils.waitFor(1);
        Driver.getDriver().get(Config.getProperty("dashboardUrl"));
    }

    @Then("user verify the title {string}")
    public void user_verify_the_title(String exptectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, exptectedTitle, "Verify the Title");
    }
}
