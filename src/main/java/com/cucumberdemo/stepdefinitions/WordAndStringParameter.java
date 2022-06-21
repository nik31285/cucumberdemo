package com.cucumberdemo.stepdefinitions;

import java.util.Iterator;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WordAndStringParameter {
	String color;
	String demostring;
	@Given("I have {word} fruit")
	public void i_have_orange_fruit(String color) {
	    this.color=color;
	}

	@Then("Display it's color")
	public void display_it_s_color() {
	   System.out.println("fruit color is:"+color);
	}
	
	@Given("I have a {string} space")
	public void this_step_contain_string(String dstring) {
		this.demostring=dstring;
	}

	@Then("Display it")
	public void display_it() {
		System.out.println("String is:"+demostring);
	}
	@Given("I have capital city names")
	public void i_have_capital_city_names(List<String> cityNames) {
		for (String name : cityNames) {
			System.out.println(name);
		}
	}
	@Given("I have {string} and {string}")
	public void i_have_and(String code, String city) {
	    System.out.println(code+"::"+city);
	}

}
