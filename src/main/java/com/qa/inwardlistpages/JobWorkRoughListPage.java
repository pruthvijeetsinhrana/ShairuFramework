package com.qa.inwardlistpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class JobWorkRoughListPage extends TestBase{
	
	@FindBy(xpath= "(//span[normalize-space()='Inward List'])[1]")
	WebElement inwardlist_menu;
	
	@FindBy(xpath= "(//a[normalize-space()='Job Work Rough List'])[1]")
	WebElement jobworkroughlist_menu;
	
	@FindBy(xpath= "(//span[@class='btn-text'])[1]")
	WebElement inward_button;

	
	public JobWorkRoughListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Navigate_jobworkrough_menu() 
	{
		try {
			TestUtil.navigate_to_menu1(inwardlist_menu,jobworkroughlist_menu);
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
	}
}
