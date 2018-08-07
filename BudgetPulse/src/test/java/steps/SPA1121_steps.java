package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.BudgetPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Config;
import utilities.Driver;

public class SPA1121_steps {

    WebDriver driver = Driver.getDriver();
    LoginPage loginp = new LoginPage();
    HomePage homep = new HomePage();
    BudgetPage budgetp = new BudgetPage();


    @Given("user goes to homepage")
    public void user_goes_to_homepage() {
        driver.get(Config.getProperty("url"));
    }

    @Then("user sign in using credentials")
    public void user_sign_in_using_credentials() {
        loginp.login();
    }

    @Then("user click on Budget Link on blue ribbon")
    public void user_click_on_Budget_Link_on_blue_ribbon() {
        homep.budgetLink.click();
    }

    @Then("user click on green plus sign on {string} field")
    public void user_click_on_green_plus_sign_on_field(String addNewBudgetItem) {
        budgetp.addNewBudgetPlusBtn.click();
    }

    @Then("user select {string} from Budget Type drop down menu")
    public void user_select_from_Budget_Type_drop_down_menu(String income) {
        Select budgetType = new Select(budgetp.budgetTypeSelector);
        budgetType.selectByVisibleText(income);
    }

    @Then("user enter {string} in Category Name box")
    public void user_enter_in_Category_Name_box(String netSalary) {
        budgetp.categoryNameBox.sendKeys(netSalary);
    }

    @Then("user enter {string} into Monthly Budget Amount box")
    public void user_enter_into_Monthly_Budget_Amount_box(String monthlyAmount) {
        budgetp.monthlyBudgetBox.sendKeys(monthlyAmount);
    }

    @Then("user click submit button")
    public void user_click_submit_button() {
        budgetp.submitBtn.click();
    }

    @Then("user click on Dashboard Link on blue ribbon")
    public void user_click_on_Dashboard_Link_on_blue_ribbon() {
        homep.dashboardLink.click();
    }

    @Then("user select {string} in Overview and verify that budgeted price is {string}")
    public void user_select_in_Overview_and_verify_that_budgeted_price_is(String overviewIncome, String sum) {
        Select overview = new Select(homep.overviewSelector);
        overview.selectByVisibleText(overviewIncome);

        BrowserUtils.waitFor(1);

        System.out.println(homep.budgetedMoney.getText());
        System.out.println(sum);
        Assert.assertEquals(homep.budgetedMoney.getText(), sum, "Checking the budgeted money");
    }



}
