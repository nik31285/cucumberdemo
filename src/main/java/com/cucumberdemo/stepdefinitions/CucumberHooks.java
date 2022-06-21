package com.cucumberdemo.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberHooks {
	@BeforeAll
	public static void m2() {
		System.out.println("@BeforeAll Hook");
		System.out.println("############################");
	}
	//@Before only execute for "@imp1" tagName scenario
	@Before("@imp1")
	public void m1() {
		System.out.println("@Before hook");
		System.out.println("--------------------------------");
	}
	//@BeforeStep only execute for "@imp1" tagName scenario
	@BeforeStep("@imp1")
	public void m3() {
		System.out.println("@BeforeStep hook");
		System.out.println("**********************************");
	}
	@When("we get title of home page")
	public void we_get_title_of_home_page() {
		System.out.println("Scenario 1 step 1");
	}

	@Then("It must be equal to expected")
	public void it_must_be_equal_to_expected() {
	    System.out.println("Scenario 1 step 2");
	}
	
	@When("we get username and password")
	public void we_get_username_and_password() {
		System.out.println("Scenario 2 step 1");
	}

	@Then("click on login button")
	public void click_on_login_button() {
		System.out.println("Scenario 2 step 2");
	}
	//@After only execute for "@imp1" tagName scenario
	@After("@imp1")
	public void m4(Scenario scenario) {
		System.out.println("@After Hook");
	}
}
