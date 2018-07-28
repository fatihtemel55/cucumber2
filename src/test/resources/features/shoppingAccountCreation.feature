Feature: Shopping of Creation an Account 

# Mac => cmd+shift+F, Windows => ctl + shift + F ==> Formatting the file

Scenario: Creating an Account 

	Given user goes to shopping homepage 
	Then user clicks on sign-in button 
	And user sends "cbt@cbtmail.com" and clicks create an account button 
	Then user chooses title "Mr" 
	Then user completes first name "James" 
	Then user completes last name "Bond" 
	Then user completes password "JBond2018" 
	Then user completes address "123 main st" 
	Then user completes city "Chicago" 
	Then user completes state "Illinois" 
	Then user completes zip "60565" 
	And user completes mobile number "1112223344" 
	And user clicks register button 
	Then user verifies "Welcome to your account. Here you can manage all of your personal information and orders." 
	
	
@createAccount 
Scenario: Creating an Account 

	Given user goes to shopping homepage
	Then user clicks on sign-in button 
	And user sends "cbt@cbtmail.com" and clicks create an account button 
	Then user completes all user info:
		|title	  |Mr|
		|firstName|James|
		|lastName |Bond|
		|password |JBond2018|
		|address  |123 main st|
		|city     |Chicago|
		|state    |Illinois|
		|zip		  |60656|
		|mNumber  | 112223344|
	When user sends info:
	|likes|comments   |date        |
	|123  |hello world|july-28-2-18|
	|423  |comment    |may-28-2-18|
	|333  |hello world|july-28-2-18|
	And user clicks register button 
	Then user verifies "Welcome to your account. Here you can manage all of your personal information and orders." 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	