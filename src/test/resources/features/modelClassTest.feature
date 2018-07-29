	Feature: Model class test 
	
	
	Scenario: Testing the model class, custom data type
	Given user logs in to application
	Then user creates account for user info:
	| title | first name| last name | phone number |
	| Mr		| John		| Doe		|123123123|
	| Mrs	| Emily		| Smith		|95494838392|
	And user verifies stuff
	
	@pojo_type
	Scenario Outline: Testing the model class, custom data type
	Given user logs in to application
	Then user creates account for user info:
	| title | first name| last name | phone number |
	|<title>| <firstName>| <lastName>|<phoneNumber>|
	And user verifies stuff
	
	 Examples:
	 | title | firstName| lastName | phoneNumber |
	| Mr		| John		| Doe		|123123123|
	| Mrs	| Emily		| Smith		|95494838392|