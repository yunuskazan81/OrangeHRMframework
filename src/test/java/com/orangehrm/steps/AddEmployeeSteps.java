package com.orangehrm.steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.orangehrm.pages.AddEmployeePage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;
import com.orangehrm.utils.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddEmployeeSteps extends CommonMethods {

	LoginPage login;
	HomePage home;
	AddEmployeePage emp;

	@Given("I logged in into OrangeHrm")
	public void i_logged_in_into_OrangeHrm() {
		login = new LoginPage();
		home = new HomePage();
		emp = new AddEmployeePage();
		login.Login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@When("I click on PIM link")
	public void i_click_on_PIM_link() {
		click(home.PIM);
	}

	@When("I click on  Add Employee link")
	public void i_click_on_Add_Employee_link() {
		click(home.addEmployee);
	}

	@When("I provide {string}, {string}, {string} and {string}")
	public void i_provide_and(String fName, String mName, String lName, String location) {
		sendText(emp.EmpFirstName, fName);
		sendText(emp.middleName, mName);
		sendText(emp.EmpLastName, lName);
		click(emp.locationDropDown);
		selectList(emp.locationList, location);
	}

	@When("I click on save button")
	public void i_click_on_save_button() {
		click(emp.EmpSaveBtn);
	}

	@Then("I see {string}, {string} is displayed")
	public void i_see_is_displayed(String fName, String lName) {
		waitForElementBeClickable(emp.empCheck, 20);
		String empName = emp.empCheck.getText();
		Assert.assertEquals(fName + " " + lName, empName);
	}

	@Then("I see following labels")
	public void i_see_following_labels(DataTable addEmpLabels) {

		System.out.println("----Printing labels from cucumber dataTable----");

		List<String> ExpectedLabels = new ArrayList<>();

		List<String> Labels = addEmpLabels.asList();

		for (String label : Labels) {

			ExpectedLabels.add(label);

			System.out.println(label);
		}
		
		System.out.println(ExpectedLabels);

		System.out.println("----Printing labels text from the application----");

		List<String> ActualLabels = new ArrayList<>();

		List<WebElement> labelList = emp.addEmpLabels;

		for (WebElement label : labelList) {

			String labeltxt = label.getText().trim();

			if (!labeltxt.isEmpty()) {

				ActualLabels.add(labeltxt.replace("*", ""));
			}
		}

		System.out.println(ActualLabels);
		
		Assert.assertTrue(ExpectedLabels.equals(ActualLabels));
		

	}
	
	@When("I provide employee details from excel {string}")
	public void i_provide_employee_details_from_excel(String sheetName) throws IOException {
		//lets say they come from excel
		/*
		 * fis
		 * workbook
		 * worksheet(sheetName)
		 * number #rows
		 * number# cols
		 * loop (rows){
		 * loop (cols){
		 *
		 * 	sendText(emp.firstName, valueFromeachCell);
			sendText(emp.middleName, valueFromeachCell);
			sendText(emp.lastName, valueFromeachCell);
			click(emp.location);
			selectList(emp.locationList, valueFromeachCell);
		 *  	
		 * 
		 * 	}
		 * }
		 */
		
		FileInputStream fis= new FileInputStream(Constants.XL_FILEPATH);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet= workbook.getSheet("Locations");
		
		int rownum= sheet.getPhysicalNumberOfRows();
		int colnum= sheet.getRow(0).getLastCellNum();
		
		for(int i=1; i<rownum; i++) {
			for(int j=0; j<colnum; j++) {
		
		   String cells= sheet.getRow(i).getCell(j).toString();
		    
		   sendText(emp.EmpFirstName, cells);
			sendText(emp.middleName, cells);
			sendText(emp.EmpLastName, cells);
			click(emp.locationDropDown);
			selectList(emp.locationList, cells);
		
			}
		}
		
		
		
		workbook.close();
		fis.close();
		
		
	}
	
	
}