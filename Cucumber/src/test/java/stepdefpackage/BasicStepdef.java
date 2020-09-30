package stepdefpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicStepdef {
	
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

	@When("^User can enter username$")
	public void Enterdetails() throws InterruptedException 
	{
		
		driver.findElement(By.id("email")).sendKeys("9573705757");
		Thread.sleep(2000);
		
	}
	
	@Then("^User can enter Password$")
	public  void EnterPassword() {
		
		driver.findElement(By.id("pass")).sendKeys("azar5757");
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
