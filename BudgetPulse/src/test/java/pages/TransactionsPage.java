package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TransactionsPage {

    private WebDriver driver = Driver.getDriver();

    public TransactionsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "TransactionTransactionType")
    public WebElement transTypeSelector;

    @FindBy (id = "TransactionCategoryName")
    public WebElement transCategoryNameBox;

    @FindBy (id = "TransactionDescription")
    public WebElement transDescriptionBox;

    @FindBy (id = "TransactionAmount")
    public WebElement transAmountBox;

    @FindBy (id = "TransactionAccountId")
    public WebElement transAccountSelector;

    @FindBy (id = "TransactionPayee")
    public WebElement transPayeeBox;

    @FindBy (id = "submitDone")
    public WebElement submitNDoneBtn;
    
//   WebElemnts AddCategory 
    
    @FindBy(xpath="//a[@href='/transactions']")
     public WebElement categoriesLink;
    
    @FindBy(xpath="//*[@id='add_category']")
    public WebElement addCategory;
    
    @FindBy(xpath="(//div[@class='box-header'])[4]")
    public WebElement categoryDrop;
    
    @FindBy(xpath="(//input[@id='TransactionCategoryName'])[2]")
    public WebElement addCategoryBox;
    
    @FindBy(xpath="(//button[@type='submit'])[1]")
    public WebElement addCategoryBoxSubmitButton;
    
    @FindBy(xpath="//div[@class='notify']")
    public WebElement addCategoryErrorText;
    
//    WebElemts TagCategory
  
    @FindBy(xpath="(//div[@class='box-header'])[5]")
    public WebElement tagsCategory;
    
    @FindBy(id="add_tag")
    public WebElement addTagLink;
    
    
    @FindBy(id="TagTagName")
    public WebElement TagNameBox ;
    		
    @FindBy(xpath="(//button[@type='submit'])[2]")
    public WebElement tagsCategorySubmitButton;
    
    @FindBy(xpath="(//div[@class='form_errors'])[4]")
    public WebElement tagsCategoryErrorText;
}








