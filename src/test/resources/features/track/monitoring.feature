# Author: Ricardo 
#Language: en

Feature: Login into fleetguard, see all fleet vehicles position, review information about a specific vehicle, view the location history of a specific vehicle
	As an operator I want to login into fleetguard to track the vehicles of the fleet
	As an operator I want to see the position of all fleet vehicles to watch them 
	As an operator I want to review information about a vehicle to check it
	As an operator I want to view the location history of a vehicle to see it's behavior

	Scenario: Login into fleetguard as a operator
  	Given I am on the Fleetguard login page
  	When I enter my valid operator credentials
  	Then I can access the Fleetguard platform

	Scenario: view all vehicles position
		Given I am logged into fleetguard as an operator
		When I go to the fleet map 
		Then I can see all vehicles position on the map
	
	Scenario: review information about a vehicle
		Given I am logged into fleetguard as an operator
		And I view the fleet map 
		When I select a specific vehicle
		Then I can see it's information
	
	Scenario: see position history of a vehicle
		Given I am logged into fleetguard as an operator
		When I go to the fleet history 
		And I select the history of a vehicle
		Then I can see it's positions history

