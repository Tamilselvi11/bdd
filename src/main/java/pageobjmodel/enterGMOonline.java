package pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class enterGMOonline {
	
	WebDriver driver;
	
@FindBy(xpath="//input[@value='Enter GMO OnLine']")

	 WebElement btnGMOOnline;
@FindBy(xpath="//td[@align='center']//div//table//tbody//tr//td[1]")
WebElement txttable;

public enterGMOonline(WebDriver driver){
	this.driver= driver;
	PageFactory.initElements(driver, this);
	
}
public void gmoonline(){
	btnGMOOnline.click();

	
	
	
	
}
}





