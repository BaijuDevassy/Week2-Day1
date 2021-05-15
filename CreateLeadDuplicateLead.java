package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadDuplicateLead {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();  
		driver.findElementById("username").sendKeys("DemoSalesManager"); 
		driver.findElementById("password").sendKeys("crmsfa"); 
		driver.findElementByClassName("decorativeSubmit").click(); 
		
		if(driver.getTitle().contains("Automation Platform"))
		    System.out.println("Page title contains the expected text ");
		else
		    System.out.println("Page title doesn't contains the expected text ");
		
		driver.findElementByLinkText("CRM/SFA").click(); 
		driver.findElementByLinkText("Leads").click(); 
		driver.findElementByLinkText("Create Lead").click(); 
		driver.findElementById("createLeadForm_companyName").sendKeys("Company1"); 
		driver.findElementById("createLeadForm_firstName").sendKeys("Mighty"); 
		driver.findElementById("createLeadForm_lastName").sendKeys("Thor"); 
		
		WebElement SourceFiled = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown1 = new Select(SourceFiled);
		dropdown1.selectByValue("LEAD_TRADESHOW"); 
		
		WebElement MarketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown2 = new Select(MarketingCampaign);
		dropdown2.selectByValue("DEMO_MKTG_CAMP"); 
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Tom"); 
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Jerry"); 
		driver.findElementById("createLeadForm_personalTitle").sendKeys("New to selenium"); 
		driver.findElementById("createLeadForm_birthDate").sendKeys("12/12/91"); 
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Fresher");
		driver.findElementById("createLeadForm_departmentName").sendKeys("IT"); 
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("5LPA"); 
		
		WebElement Curreny = driver.findElementById("createLeadForm_currencyUomId");
		Select dropdown3 = new Select(Curreny);
		dropdown3.selectByValue("INR");
				
		WebElement Industry  = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown4 = new Select(Industry);
		dropdown4.selectByVisibleText("Health Care");

		driver.findElementById("createLeadForm_numberEmployees").sendKeys("61"); 
		
		WebElement Ownership  = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown5 = new Select(Ownership);
		dropdown5.selectByVisibleText("Public Corporation"); 
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("007"); 
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Yes"); 
		driver.findElementById("createLeadForm_description").sendKeys("Week 2 Assignment 1"); 
		driver.findElementById("createLeadForm_importantNote").sendKeys("Note 1"); 
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear(); 
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91"); 
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044"); 
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9941453278"); 
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("123"); 
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Ant Man"); 
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("tomandjerry@gmail.com"); 
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.tomandjerry.com"); 
		driver.findElementById("createLeadForm_generalToName").sendKeys("Iron Man"); 
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Captain America"); 
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("123"); 
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Marvel Road"); 
		driver.findElementById("createLeadForm_generalCity").sendKeys("Wakanda"); 
		
		WebElement Province  = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropdown6 = new Select(Province);
		dropdown6.selectByVisibleText("Pennsylvania"); 
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("98765"); 
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("54321"); 
		driver.findElementByName("submitButton").click();
		driver.findElementByClassName("subMenuButton").click(); 
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("Company2");
		driver.findElementByName("submitButton").click();
		driver.findElementByLinkText("Edit").click();
		System.out.println(driver.findElementById("updateLeadForm_companyName").getAttribute("value"));
		driver.close();
		
		
	}

}
