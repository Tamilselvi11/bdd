package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	WebDriver driver;
	@Given ("^i launch the URL$")
	public void urllaunch(){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.borland.com/gmopost/");
		driver.manage().window().maximize();
	}
	@When ("^i verify the title of the page$")
	public void pagetitle(){
		driver.findElement(By.xpath("//input[@value='Enter GMO OnLine']")).click();
		
	}
	@Then ("^i click on enter gmo online button$")
	public void gmobutton(){
	driver.findElements(By.xpath("//td[@align='center']//div//table//tbody//tr//td[1]"));
		
	}
	@Then ("^i enter the \"(.*)\" quanity as \"(.*)\"$")
	public void enterquantity(String product,String quantity){
		driver.findElement(By.xpath("//td[text()='"+product+"']//following-sibling::td/h1/input[@type='text']")).sendKeys(quantity);
	}
	@When ("^i verify the page title as online catalog$")
	public void pagetitleverification(String title){
		
		
		Assert.assertEquals(title,driver.getTitle());
		//String heading = "Welcome to Green Mountain Outpost's OnLine Catalog!";
		
	}
	}
	


