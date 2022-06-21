Feature: Parameterization cases

#Scenario: Add two numbers
#Given I have 10 and 22 
#When I add them
#Then Result must be even
#
#Scenario: Identify color of fruit
#Given I have orange fruit
#Then Display it's color
#
#Scenario: Pass String 
#Given I have a "string which contains" space
#Then Display it

#Scenario: Parameterizing single value in table
#Given I have capital city names
#|Mumbai|
#|Delhi|
#|Bhopal|
#|Jaipur|
#|Haidrabad|
#|Kolkatta|

#Datadriven test
Scenario: to print rto_code and city_name
Given I have "<rto_code>" and "<city_name>"
Examples:
|rto_code|city_name|
|MH|Maharashtra|
|GJ|Gujarat|
|MP|Madhyapradesh|
|GA|Goa|
|AP|Aandhrapradesh|
|UP|Uttar Pradesh|
