package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BudgetPage {

    private WebDriver driver = Driver.getDriver();

    public BudgetPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class='widget dialog collapsible clear'] a[class='box-header-action budget-item-toggler button-expand']")
    public WebElement addNewBudgetPlusBtn;

    @FindBy (id = "TransactionCategoryBudgetType")
    public WebElement budgetTypeSelector;

    @FindBy (id = "TransactionCategoryName")
    public WebElement categoryNameBox;

    @FindBy (id = "TransactionCategoryMonthlyBudget")
    public WebElement monthlyBudgetBox;

    @FindBy (css = "#budget_form_add_transaction_category .form-options .submit")
    public WebElement submitBtn;
}
