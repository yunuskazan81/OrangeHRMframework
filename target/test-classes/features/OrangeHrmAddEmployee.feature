#Author: syntax team     //john.smith@wellfargo.com
Feature: Add Employee 

Background: 
	Given I logged in into OrangeHrm 
	And I click on PIM link 
	And I click on  Add Employee link 
	
@smoke @addEmployee 
Scenario Outline: Add Employee 
	When I provide "<FirstName>", "<MiddleName>", "<LastName>" and "<Location>" 
	And I click on save button 
	Then I see "<FirstName>", "<LastName>" is displayed 
	
	Examples: 
		| FirstName | MiddleName | LastName | Location     |
		| Jane      | J          | Smith    | Smart Office |
		| James     | S          | West     | West Office  |
		| Jackie    | N          | Eats     | HQ           |
		
		
		@empDetails 
		Scenario: Add Employee and Create Login Details 
			When I provide FirstName, MiddleName, LastName and Location 
			
				| FirstName  | MiddleName    | LastName | Location     |
				| Johni      | Jira          | Smith    | Smart Office |
				| Jamise     | Sorry         | West     | West Office  |
				| Jacktei    | Nope          | Eats     | HQ           |
				
			And I click on create login details 
			And I provide Username, Password and Confirmpassword 
				| Username  	  | Password   	     | Confirmpassword       | 
				| Janesmithh12    | Smith3298_?      | Smith3298_?           |
				| Jameswestt12    | West3432_#       | West3432_#            |
				| Jackieeatss2    | Eats9486_!       | Eats9486_!            |
				
			And I click on save button 
			
			Then I see employee name is added successfully 
				| EmployeeName   |
				| Johni Smith    |
				| Jamise West    |
				| Jacktei Eats   |
		
		
		@compare
		Scenario: Add Employee Labels Verification 
			Then I see following labels 
				| First Name  |
				| Middle Name |
				| Last Name   |
				| Employee Id |
				| Location    |
				| Create Login Details    |