package pages;

import utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver = Driver.getDriver();

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//a[@href='#'])[3]")
    public WebElement startLoginBtn;

    @FindBy (linkText = "Budget")
    public WebElement budgetLink;


    @FindBy (linkText = "Dashboard")
    public WebElement dashboardLink;

    @FindBy (linkText = "Transactions")
    public WebElement transactionsLink;
    
    @FindBy (id = "select_budget_type")
    public WebElement overviewSelector;

    @FindBy (xpath = "//div[@id='panel_budget']//div[@class='capsule capsule-neutral capsule-first']")
    public WebElement budgetedMoney;

    @FindBy (linkText = "Add New")
    public WebElement addNewLinkRecentTrans;




}
