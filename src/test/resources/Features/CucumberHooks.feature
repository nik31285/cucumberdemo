#Each feature file contain only one feature
#Feature represent group of test cases

Feature: This is cucumber demo feature
 
@imp1 
Scenario: This represent as test case 1
When we get title of home page
Then It must be equal to expected

@imp2
Scenario: This represent as test case 2
When we get username and password 
Then click on login button