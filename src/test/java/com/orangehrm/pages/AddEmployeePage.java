package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

public class AddEmployeePage extends BaseClass {


	@FindBy(xpath="//input[@id='firstName']")
	public WebElement EmpFirstName;
	
	
	@FindBy(id="middleName")
    public WebElement middleName;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement EmpLastName;
	
	@FindBy(xpath="//input[@id='employeeId']")
	public WebElement EmployeeID;
	
	@FindBy(xpath="//div[@id='location_inputfileddiv']//input")  //ul[@id='select-options-22e6de9f-a0eb-234f-8976-a90c3e7069a2']/../input  
	public WebElement locationDropdown;
	
	@FindBy(xpath="//div[@id='location_inputfileddiv']//ul")
    public WebElement locationList;
	
	@FindBy(css="label[for='hasLoginDetails']")
	public WebElement checkCredentials;
	
	@FindBy(css="input#confirmPassword")
    public WebElement confirmPass;
    
    @FindBy(css="input#username")
    public WebElement username;
    
    @FindBy(css="input#password")  
    public WebElement password;
    
    @FindBy(xpath="//div[@id='status_inputfileddiv']//input")
    public WebElement status;
    
    @FindBy(xpath="//div[@id='status_inputfileddiv']//ul")  
    public WebElement statusList;
    
    @FindBy (xpath = "//span[@id='pim.navbar.employeeName']")
    public WebElement empCheck;
    
    @FindBy(xpath="//span[text()='Employee List']")
    public WebElement employeeList;
    
    @FindBy(xpath="//table[@id='employeeListTable']/tbody/tr/td")
    public WebElement CheckName;
    
    @FindBy(xpath="//h4[text()='Add Employee']")
    public WebElement confirmAddEmployeePopup;

    @FindBy(css="select#adminRoleId")
    public WebElement AdminRole;
	
    @FindBy(css="a#systemUserSaveBtn")
    public WebElement EmpSaveBtn;
    
    @FindBy(xpath="//form[@id='pimAddEmployeeForm']//label")
    public List<WebElement> addEmpLabels;
	
	//initialize all of our variables
	public AddEmployeePage() {
		PageFactory.initElements(driver, this);
	}
	
}
