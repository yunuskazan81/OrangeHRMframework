package com.orangehrm.steps;



import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;

import cucumber.api.java.en.*;
import org.junit.Assert;

public class OrangeHrmLoginSteps extends BaseClass{

	
	@Given("User navigates and land to the login page")
	
	public void User_navigates_and_land_to_the_login_page() {
		
		setUp();
		
		driver.get(ConfigsReader.getProperty("url"));
		
		
	}
	
	
	@When("user sees login form is displayed")
	
	public void user_sees_login_form_is_displayed() {
		
		LoginPage login =new LoginPage();
		
		String LoginText= login.loginHead.getText();
		
		Assert.assertEquals(LoginText, "LOGIN Panel");
		
		System.out.println("User is in login page");
		
		
//		if(LoginText.equals("LOGIN Panel")) {
//			
//			System.out.println("User is in login page");
//			
//		}
//		
//		
	}
	
	@Then ("user types valid username and password in the boxes")
	
	
	public void user_types_valid_username_and_password_in_the_boxes() {
		
LoginPage login =new LoginPage();
		
		
		CommonMethods.sendText(login.userName, ConfigsReader.getProperty("username"));
		CommonMethods.sendText(login.password, ConfigsReader.getProperty("password"));
		
		
	}
	
	@And("user clicks onto the login button")
	
	public void user_clicks_onto_the_login_button() {
		
		LoginPage login =new LoginPage();
		CommonMethods.waitForElementBeVisible(login.btnLogin, 10);
		login.btnLogin.click();
		
	}
	
	
	@Then ("user should succesfully login into the application")
	
	public void user_should_succesfully_login_into_the_application() {
		
		
LoginPage login =new LoginPage();
		
		String LoginText= login.Dashboard.getText();
		if(LoginText.equals("Dashboard")) {
			
			System.out.println("User is in application online portal Dashboard page.");
			
		}
		
		
	}
	
	
	@And ("user should see Dashboard statement on the page")
	
	public void user_should_see_Dashboard_statement_on_the_page() {
		
		
		LoginPage login =new LoginPage();
		
		System.out.println(login.Dashboard.getText()+" is displayed");
		
		
	}
	
	
	@Then( "user would log out" )
	
	public void user_would_log_out(){
		
		driver.close();
	}
	
	
	
	@Then("user types invalid username and password in the boxes")
	public void user_types_invalid_username_and_password_in_the_boxes() {
	    
LoginPage login =new LoginPage();
		
		CommonMethods.sendText(login.userName, "username");
		CommonMethods.sendText(login.password, "password");	
		
		
	}

	@Then("user should not login into the application")
	public void user_should_not_login_into_the_application() {
	   System.out.println("you have enter valid credentials to login");
	}

	@Then("user should see error message on the page")
	public void user_should_see_error_message_on_the_page() {
	    
		LoginPage login = new LoginPage();
		
		String error= login.message.getText().trim();
		
		Assert.assertEquals(error, "Invalid Credentials");
		
		
	}
	
	
	
	
	
}
