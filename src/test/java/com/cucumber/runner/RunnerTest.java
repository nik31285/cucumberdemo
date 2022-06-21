package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//in @CucumberOption provide path of feature file and step definition file
@CucumberOptions(features ={"src/test/resources/Features"},glue = {"com/cucumberdemo/stepdefinitions"})
public class RunnerTest extends AbstractTestNGCucumberTests{
}
