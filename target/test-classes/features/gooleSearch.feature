	@regression
	Feature: Google Search
	
	Scenario: Search result verification on Google - POSITIVE
	
	Given user goes to google.com
	When user searches for apple
	Then user should see apple related result
	Given user goes to google.com
	When user searches for apple
	
	
	Scenario: Search result verification on Google - NEGATIVE
	
	Given user goes to google.com
	When user searches for apple
