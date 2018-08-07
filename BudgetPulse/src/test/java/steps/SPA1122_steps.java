package steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.TransactionsPage;
import utilities.BrowserUtils;
import utilities.Config;
import utilities.Driver;

public class SPA1122_steps {

    HomePage hp = new HomePage();
    TransactionsPage trans = new TransactionsPage();
    LoginPage lp=new LoginPage();

    @Then("user click on Dashboard Link on the blue ribbon")
    public void user_click_on_Dashboard_Link_on_the_blue_ribbon() {
        Driver.getDriver().get(Config.getProperty("url"));
        lp.login();

        BrowserUtils.waitFor(1);
        hp.dashboardLink.click();
    }

    @Then("user click on grey Add New link in Recent Transactions field")
    public void user_click_on_grey_Add_New_link_in_Recent_Transactions_field() {
        hp.addNewLinkRecentTrans.click();
    }

    @Then("user select {string} option from Transaction Type drop down menu")
    public void user_select_option_from_Transaction_Type_drop_down_menu(String income) {
        Select transType = new Select(trans.transTypeSelector);
        transType.selectByVisibleText(income);
    }

    @Then("user enter {string} in Category box")
    public void user_enter_in_Category_box(String netSalary) {
        trans.transCategoryNameBox.sendKeys(netSalary);
    }

    @Then("user enter {string} into Description box")
    public void user_enter_into_Description_box(String firstSalaryMsg) {
        trans.transDescriptionBox.sendKeys(firstSalaryMsg);
    }

    @Then("user enter {string} into Amount box")
    public void user_enter_into_Amount_box(String amount) {
        trans.transAmountBox.sendKeys(amount);
    }

    @Then("user choose {string} in Account drop down menu")
    public void user_choose_in_Account_drop_down_menu(String chase) {
        Select account = new Select(trans.transAccountSelector);
        account.selectByVisibleText(chase);
    }

    @Then("user enter {string} into Payee box")
    public void user_enter_into_Payee_box(String chase) {
        trans.transPayeeBox.sendKeys(chase);
    }

    @Then("click Submit & Done button")
    public void click_Submit_Done_button() {
        trans.submitNDoneBtn.click();
    }
}
