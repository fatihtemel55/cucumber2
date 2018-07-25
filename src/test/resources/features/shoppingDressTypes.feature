	@regression
	Feature: Shopping Dress types
	
	Background: Going to homepage and hover over on dresses
	Given user goes to shopping homepage
	And user hovers over on Dresses
	
	@shopping 
	Scenario: Verification of Casual Dresses
	When user clicks on Casual Dresses
	Then page should display "CASUAL DRESSES" header
	
	@uniqueID
	Scenario: Verification of Summer Dresses
	When user clicks on Summer Dresses
	Then page should display "SUMMER DRESSES" header