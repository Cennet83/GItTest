package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class MainPage {

    private WebDriver driver=Driver.getDriver();

    public MainPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[@rel='panel_budget_link']")
    public WebElement budgetDash;

    @FindBy(xpath = "//select[@id='select_budget_type']")
    public WebElement defaultSelection;

    @FindBy(xpath = "(//div[@class='dashboard_panel_content']//div/span)[1]")
    public WebElement budgeted;

    @FindBy(xpath = "(//div[@class='dashboard_panel_content']//div/span)[2]")
    public  WebElement actualExpenses;

    @FindBy(xpath = "(//div[@class='dashboard_panel_content']//div/span)[3]")
    public  WebElement upcomingExpenses;

    @FindBy(xpath = "//a[@accesskey='3']")
    public WebElement logout;

    public String checkDefaultSelection(WebElement selection){
        Select s=new Select(selection);
        return s.getFirstSelectedOption().getText();
    }




}
