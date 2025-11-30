# Author: Ricardo 
#Language: en

Feature: Login into fleetguard, add vehicles to the fleet, modify vehicles information, remove vehicles from the fleet and watch the fleet vehicles
	As a administrator I want to login into fleetguard to manage the fleet vehicles
	As a administrator I want to watch all fleet vehicles to review all vehicles registered
	As a administrator I want to add a vehicle to the fleet to register new vehicles
	As a administrator I want to modify a vehicle information to update the vehicles information
	As a administrator I want to remove a vehicle from the fleet to remove vehicles that are not use

	Scenario: Login into Fleetguard as administrator
  	Given I am on the Fleetguard login page
  	When I enter my valid administrator credentials
  	Then I can access the Fleetguard platform
	
	Scenario: View vehicles
  	Given I am logged into Fleetguard as an administrator
		When I view the fleet
		Then I can see all the vehicles from the fleet

	Scenario: Add a vehicle to the fleet
  	Given I am logged into Fleetguard as an administrator
		When I correctly register a new vehicle
  	Then I see that the vehicle was successfully added to the fleet

	Scenario: Modify a vehicle information
  	Given I am logged into Fleetguard as an administrator
		When I correctly edit a fiel of an existing vehicle
  	Then I see that the vehicle information was successfully updated
	
	Scenario: Remove a vehicle from the fleet
  	Given I am logged into Fleetguard as an administrator
		When I remove a vehicle from the fleet
		Then I see that the vehicle was successfully removed
