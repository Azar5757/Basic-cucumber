package Cucumber.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fb_Step_def {
	
	WebDriver driver=null;
	ChromeOptions co;
	@Given("^User can open the fblogin page$")
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Azar\\SeleniumJava\\Drivers\\chromedriver.exe");
		co =new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	} 
	//Regular Expressions
	//1. \"(.*)\"
	//2. \"([^\"]*)\"

	@When("^User can enter \"(.*)\"$")
	public void Enterdetails(String username) throws InterruptedException 
	{
		
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		
	}
	
	@Then("^User can enter password \"(.*)\"$")
	public  void EnterPassword(String password) {
		
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@Then("User can click login button")
	public void Clickloginbutton() throws InterruptedException {
		driver.findElement(By.id("u_0_b")).click();
		//Thread.sleep(3000);
	}
	
	@Then("^click the logout link$")
	public void Clicklogoutlink() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("userNavigationLabel")).click();
	}
	@Then("^click the logout button$")
	public void Clicklogoutbutton() {
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	}
	@And("^Close the browser$")
	public void closebrowser() {
		driver.quit();;
	}

}
