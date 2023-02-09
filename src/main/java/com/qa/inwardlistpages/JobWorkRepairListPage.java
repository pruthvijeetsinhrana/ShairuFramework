package com.qa.inwardlistpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class JobWorkRepairListPage extends TestBase{
	
	//File path 
		public String Commonpath_pdf = System.getProperty("user.dir")+ prop.getProperty("Commonpath_pdf");
		public String Commonpath_image = System.getProperty("user.dir")+ prop.getProperty("Commonpath_image");
	
	//Document Info section 
	

	
		@FindBy(xpath= "(//span[normalize-space()='Inward List'])[1]")
		WebElement inwardlist_menu;
		
		@FindBy(xpath= "(//a[normalize-space()='Job Work Repair List'])[1]")
		WebElement jobworkrepairlist_menu;
		
		@FindBy(xpath= "(//span[@class='btn-text'])[1]")
		WebElement inward_button;
		
		
		public JobWorkRepairListPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void Navigate_jobworkrepair_menu() 
		{
			try {
				TestUtil.navigate_to_option1(inwardlist_menu,jobworkrepairlist_menu);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void Open_inward_button()
		{
			inward_button.isDisplayed();
			inward_button.click();
			System.out.println("Inward module is open - user can enter data in it.");
			
			driver.findElement(By.xpath("(//input[@accept='application/pdf'])[1]")).sendKeys(Commonpath_pdf);
		}
}
