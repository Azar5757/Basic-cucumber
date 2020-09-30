package stepdefpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Usingdatatablesstepdef {
	
	WebDriver driver=null;
	ChromeOptions co;
	@Given("^User can open the fblogin page2$")
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Azar\\SeleniumJava\\Drivers\\chromedriver.exe");
		co =new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	} 
	
	@When("^User can enter username2$")
	public void Enterdetails(DataTable Details ) throws InterruptedException 
	{
		List<List<String>> fbuser =Details.raw();
		
		driver.findElement(By.id("email")).sendKeys(fbuser.get(0).get(0));
		Thread.sleep(2000);
		
	}
	
	@Then("^User can enter Password2$")
	public  void EnterPassword(DataTable Details2) {
		List<List<String>> fbpass=Details2.raw();
		
		driver.findElement(By.id("pass")).sendKeys(fbpass.get(0).get(0));
	}
	
	@Then("^User click login button2$")
	public void Clickloginbutton2() throws InterruptedException {
		driver.findElement(By.id("u_0_b")).click();
		//Thread.sleep(3000);
	}
	
	@Then("^click the logout link2$")
	public void Clicklogoutlink2() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("userNavigationLabel")).click();
	}
	@Then("^click the logout button2$")
	public void Clicklogoutbutton() {
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	}
	@And("^Close the browser2$")
	public void closebrowser2() {
		driver.quit();;
	}


}
