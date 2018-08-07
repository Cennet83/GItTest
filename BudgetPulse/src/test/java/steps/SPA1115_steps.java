package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;
import utilities.Config;
import utilities.Driver;

public class SPA1115_steps {

    MainPage mp=new MainPage();
    LoginPage lp=new LoginPage();

    @Given("user click th budget dashboard")
    public void user_click_th_budget_dashboard() {
        Driver.getDriver().get(Config.getProperty("url"));
        lp.login();
        mp.budgetDash.click();
    }

    @When("user should be able to see expenses as a default selection")
    public void user_should_be_able_to_see_expenses_as_a_default_selection() {
       String actual= mp.checkDefaultSelection(mp.defaultSelection);
       String expected="Expenses";
        Assert.assertEquals(actual,expected);
    }

    @Then("user should be able to see {string} and {string} , {string}")
    public void user_should_be_able_to_see_and(String budgeted, String actualExpense, String upcomingExpense) {
        mp.budgeted.isDisplayed();
        mp.actualExpenses.isDisplayed();
        mp.upcomingExpenses.isDisplayed();
//        Assert.assertEquals(mp.budgeted.getText(),budgeted);
//        Assert.assertEquals(mp.actualExpenses.getText(),actualExpense);
//        Assert.assertEquals(mp.upcomingExpenses.getText(),upcomingExpense);

    }

}
