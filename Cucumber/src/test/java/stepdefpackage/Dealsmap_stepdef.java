package stepdefpackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dealsmap_stepdef {
	
	WebDriver driver;
	@Given("^user is already on login page$")
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Azar\\SeleniumJava\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		
	} 
	@When("^user enters username and password$")
	public void login(DataTable credentials) {
		
		for(Map<String,String> data:credentials.asMaps(String.class, String.class)) {
		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data.get("username"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get("password"));
	}
		
	}
	
	@Then("^user click the login button$")
	public void clickonlogin() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}
	
	
	@Then("^user enters deal details$")
	public void enterdealdetails(DataTable Dealdata) {
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		
		for(Map<String, String> dd:Dealdata.asMaps(String.class, String.class)) {
			
	   
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(dd.get("title"));
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(dd.get("amount"));
		driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(dd.get("probability"));
		driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(dd.get("commission"));
		
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		
		
	}
		
	}	
	
	@Then("^close the browser$")
	public void closingbrowser() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	

}
