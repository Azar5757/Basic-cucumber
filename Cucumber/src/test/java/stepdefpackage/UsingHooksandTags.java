package stepdefpackage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsingHooksandTags {
	
	@Given("^User can test1$")
	public void user_can_test1() {
		
		System.out.println("test1");
	}

	@When("^User can enter test2$")
	public void user_can_enter_test2()  {
		System.out.println("test2");
	}

	@Then("^User can enter test3$")
	public void user_can_enter_test3() {
		System.out.println("test3");
	}

	@Before(order=0)
	@Given("^User can test4$")
	public void user_can_test4() {
		
		System.out.println("test4");
	}

	@Before(order=1)
	@When("^User can enter test5$")
	public void user_can_enter_test5()  {
		System.out.println("test5");
	}

	@Before(order=2)
	@Then("^User can enter test6$")
	public void user_can_enter_test6() {
		System.out.println("test6");
	}

	@Given("^User can test7$")
	public void user_can_test7() {
		
		System.out.println("test7");
	}

	@When("^User can enter test8$")
	public void user_can_enter_test8()  {
		System.out.println("test8");
	}

	@Then("^User can enter test9$")
	public void user_can_enter_test9() {
		System.out.println("test9");
	}


}
