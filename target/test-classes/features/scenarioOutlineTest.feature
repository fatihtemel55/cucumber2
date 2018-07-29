	Feature: Shopping account creation wiht scenario outlines
	@accountCreation
	Scenario Outline: Shopping account creation with scenario outlines
	Given user goes to shopping homepage
	Then user clicks on sign-in button 
	And user sends "<email>" and clicks create an account button 
	Then user chooses title "<title>" 
	Then user completes first name "<firstName>" 
	Then user completes last name "<lastName>" 
	Then user completes password "<password>" 
	Then user completes address "<address>" 
	Then user completes city "<city>" 
	Then user completes state "<state>"
	Then user completes zip "<zip>" 
	And user completes mobile number "<phoneNumber>" 
	And user clicks register button 
	Then user verifies "Welcome to your account. Here you can manage all of your personal information and orders." 
	
	Examples:
	|title| firstName | lastName | password | address    | city  | state  | zip | phoneNumber| email |
	|Mr	  |James		  | Bond		 | JBond2018| 123 main st|Chicago|Illinois|60623| 31212312323|cbt@cbtmail.com|
	|Mrs	  |Emily 	  | Smith	 | emily2006|608 river st|Chicago|Illinois|60623| 23453      |emcbt@cbtmail.com|
	|Mr	  |John  	  | Doe  	 | JBond2018| 123 main st|Chicago|Illinois|60623| 31212312323|cbt@cbtmail.com|
	|Mrs	  |Alexa 	  | Amazon	 | JBond2018| 123 main st|Chicago|Illinois|60623| 31212312323|cbt@cbtmail.com|