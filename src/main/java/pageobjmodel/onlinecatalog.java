package pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class onlinecatalog {
	WebDriver driver;
	@FindBy(xpath="//td[@align='center']//div//table//tbody//tr//td[1]")
	
	WebElement txttable;
	@FindBy(xpath="//input[@value='Place An Order']")
	WebElement btnsubmit;
	public onlinecatalog(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public void onlinecatalog(String qty){
		txttable.sendKeys(qty);
		btnsubmit.click();
	}

}

