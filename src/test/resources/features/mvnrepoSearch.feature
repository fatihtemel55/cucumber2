	@mvnSearch @smokeTest @regression @unique
	Feature: MVNRepository Search
	
	User Story: CTB-4423
	
	Scenario: Mvn Repo Search verification - POSITIVE
	
	Given user goes to mvnrepository application
	When user searches for "cucumber java"
	Then user should get "Cucumber JVM: Java" in first result
	
	
	Scenario: Mvn Repo Search verification - POSITIVE
	
	Given user goes to mvnrepository application
	When user searches for "selenium java"
	Then user should get "Selenium Java" in first result
	
	
	Scenario: Mvn Repo Search verification - POSITIVE
	
	Given user goes to mvnrepository application
	When user searches for "testng"
	Then user should get "TestNG" in first result
	