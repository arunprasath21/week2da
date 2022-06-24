package week1.Day2.Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead{
	public static void main (String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement userName = Driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		
		WebElement password = Driver.findElement(By.name("PASSWORD"));
		password.sendKeys("crmsfa");
		
		WebElement login = Driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement linkButton = Driver.findElement(By.linkText("CRM/SFA"));
		linkButton.click();
		
		WebElement leadsButton = Driver.findElement(By.linkText("Leads"));
		leadsButton.click();
		
		WebElement createLead = Driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		
		WebElement companyName = Driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Caparo Engineering pvt ltd");
		
		WebElement firstName = Driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Arunprasath");
		
		WebElement lastName = Driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("selvaraj");
		
		WebElement localFirstName = Driver.findElement(By.id("createLeadForm_firstNameLocal"));
		localFirstName.sendKeys("Arun");
		
		WebElement department = Driver.findElement(By.name("departmentName"));
		department.sendKeys("Maintainance");
		
		WebElement description = Driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("This is the complete profile and with experience");
		
		WebElement email = Driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("arun21@gmail.com");
		
		 WebElement state = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		state.sendKeys("Alabama");
		
		Select stateprov = new Select(state);
		//stateprov.selectByIndex(5);
		stateprov.selectByValue("CA");
		//stateprov.selectByVisibleText("Delaware");
		
		 WebElement createLeads = Driver.findElement(By.className("smallSubmit"));
		 createLeads.click();
		 
		 String title = Driver.getTitle();
		 System.out.println(title);
	}

}
