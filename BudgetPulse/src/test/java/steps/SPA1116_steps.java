package steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.MainPage;
import utilities.BrowserUtils;

public class SPA1116_steps {

    MainPage mp=new MainPage();

    @When("user select {string} option from Overview of this month")
    public void user_select_option_from_Overview_of_this_month(String income) {
        BrowserUtils.waitFor(1);
        Select s=new Select(mp.defaultSelection);
        s.selectByIndex(1);
    }
}
