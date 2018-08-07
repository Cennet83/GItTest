package steps;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import pages.TransactionsPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class SPA1128_steps {
	
	HomePage hp = new HomePage();
	LoginPage lp = new LoginPage();
	TransactionsPage trans = new TransactionsPage();
	
	Random random=new Random();
	int r=random.nextInt(100);
	
	@Then("user click on Transactions Link on blue ribbon in header")
	public void user_click_on_Transactions_Link_on_blue_ribbon_in_header() {
	  trans.categoriesLink.click();
	}

	@Then("user click on + button on {string} header")
	public void user_click_on_button_on_header(String string) {
		BrowserUtils.waitFor(3);
		BrowserUtils.waitForClickablility(trans.tagsCategory, 20);

		trans.tagsCategory.click();
	}

	@Then("user click {string} link")
	public void user_click_link(String string) {
		BrowserUtils.waitFor(3);
		BrowserUtils.waitForClickablility(trans.addTagLink, 20);
		trans.addTagLink.click();
	   
	}

	@Then("user enter text {string} in Tags Name box")
	public void user_enter_text_in_Tags_Name_box(String string) {
		
		trans.TagNameBox.sendKeys(string+r);
	   
	}

	@Then("user click submit button in form")
	public void user_click_submit_button_in_form() {
		
		BrowserUtils.waitForVisibility(trans.tagsCategorySubmitButton, 30);
		trans.tagsCategorySubmitButton.click();
	    
	}

	@Then("user enter text Test Duplicate Tag in Category Name box")
	public void user_enter_text_Test_Duplicate_Tag_in_Category_Name_box() {
		trans.TagNameBox.sendKeys("TestDuplicateTag"+r);
	}

	@Then("user click submit tag button in form")
	public void user_click_submit_tag_button_in_form() {
		BrowserUtils.waitForVisibility(trans.tagsCategorySubmitButton, 30);
		trans.tagsCategorySubmitButton.click();
//		String str =trans.tagsCategoryErrorText.getText();
//		assertEquals(str, "Tag already exists.");
	}

	@Then("user get error alert {string}")
	public void user_get_error_alert(String string) {
		Actions action=new Actions(Driver.getDriver());
		action.sendKeys(Keys.ARROW_UP).perform();
		action.sendKeys(Keys.ARROW_UP).perform();
//		BrowserUtils.waitForClickablility(trans.tagsCategoryErrorText, 12);
		BrowserUtils.waitFor(3);
//		BrowserUtils.waitForVisibility(trans.tagsCategoryErrorText, 30);
		
		String errorActual = trans.tagsCategoryErrorText.getText();
		assertEquals(errorActual, string);
	}
	

}
