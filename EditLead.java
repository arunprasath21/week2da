package week1.Day2.Classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get( "http://leaftaps.com/opentaps/control/login");
		
		WebElement User = Driver.findElement(By.id("username"));
		User.sendKeys("Demosalesmanager");
		
		WebElement Pass = Driver.findElement(By.id("password"));
		Pass.sendKeys("crmsfa");
		
		WebElement Login = Driver.findElement(By.className("decorativeSubmit"));
		Login.click();
		
		WebElement crmButton = Driver.findElement(By.linkText("CRM/SFA"));
		crmButton.click();
		
		WebElement leadsButton = Driver.findElement(By.linkText("Leads"));
		leadsButton.click();
		
		WebElement createLead = Driver.findElement(By.linkText("Create Lead"));
		createLead.click();
	
		WebElement companyName = Driver.findElement(By.className("inputBox"));
		companyName.sendKeys("Caparo Engineering pvt ltd");
		
		WebElement firstName = Driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Arunprasath");
		
		WebElement lastName = Driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("selvaraj");
		
		WebElement localFirstName = Driver.findElement(By.id("createLeadForm_firstNameLocal"));
		localFirstName.sendKeys("Arun");
		
		WebElement department = Driver.findElement(By.name("departmentName"));
		department.sendKeys("HumanResources");
		
		WebElement description = Driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("This is the complete profile");
		
		WebElement email = Driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("arun212@gmail.com");
		
		 WebElement state = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		state.sendKeys("Alabama");
		
		Select stateprov = new Select(state);
		//stateprov.selectByIndex(16);
		stateprov.selectByValue("AZ");
		//stateprov.selectByVisibleText("Armed Forces Americas");
		
		WebElement createLeads = Driver.findElement(By.className("smallSubmit"));
		createLeads.click();
		
		WebElement editButton = Driver.findElement(By.linkText("Edit"));
		editButton.click();
		
		WebElement clear = Driver.findElement(By.id("updateLeadForm_description"));
		clear.clear();
		WebElement Title = Driver.findElement(By.name("generalProfTitle"));
		Title.sendKeys("Engineer");
		
		WebElement currency = Driver.findElement(By.id("updateLeadForm_currencyUomId"));
		currency.sendKeys("AMD - Armenian Dram");
		
		Select money = new Select (currency);
		money.selectByIndex(25);
		//money.selectByValue("COP");
		//money.selectByVisibleText("MVR - Maldive Rufiyaa");
	
		WebElement imp = Driver.findElement(By.name("importantNote"));
		imp.sendKeys("All Data Entry Completed");
	
		WebElement update = Driver.findElement(By.name("submitButton"));
		update.click();
		
		
	}

}
