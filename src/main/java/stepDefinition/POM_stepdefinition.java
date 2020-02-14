package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class POM_stepdefinition {
	WebDriver driver;
	@Given ("^i launch the GMOURL$")
	public void launchurl(){
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demo.borland.com/gmopost/");
		driver.manage().window().maximize();

}
	@When ("^i click on Enter GMO onlin button in GMO online page")
	public void gmopage(){
		//enterGMOonline page = new enterGMOonline(driver);
		//page.gmoonline();
		
}

	@Then ("^i enter the quantity as \"(.*)\" in online catalog page")
	public void button(String qty){
		//onlinecatalog pge = new onlinecatalog(driver);
		//pge.onlinecatalog(qty);
		
	}
	}