package com.cucumberdemo.stepdefinitions;



import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ParametrizationSummation {
	
	int num1,num2,sum;
	@Given("I have {int} and {int}")
	public void i_have_and(int int1, int int2) {
	   this.num1=int1;
	   this.num2=int2;
	}

	@When("I add them")
	public void i_add_them() {
	    this.sum=num1+num2;
	}

	@Then("Result must be even")
	public void result_must_be_even() {
		System.out.println("Summation is:"+sum);
	   Assert.assertTrue((sum%2==0),"Summation is false");
	}

}
