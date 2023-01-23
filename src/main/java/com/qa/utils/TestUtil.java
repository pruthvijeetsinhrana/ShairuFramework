package com.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static final long PAGE_LOAD_TIMEOUT = 30;
	public static final long IMPLICIT_WAIT = 30;
	
	public TestUtil()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void ValidateUserLogin() {
		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
// It is used for 2nd level menu navigation
	
	public static void navigate_to_menu2(WebElement menu,WebElement submenu,WebElement submenu2) throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		Thread.sleep(2000);
		action.moveToElement(submenu).perform();
		Thread.sleep(2000);
		action.moveToElement(submenu2).click().perform();
		Thread.sleep(3000);
	}
	
	// It is used for 1st level menu navigation
	
		public static void navigate_to_menu1(WebElement menu,WebElement submenu) throws InterruptedException
		{
			Actions action = new Actions(driver);
			action.moveToElement(menu).perform();
			Thread.sleep(2000);
			action.moveToElement(submenu).perform();
			Thread.sleep(2000);
		}
		
		// It is used for dropdown selection
		
		public static void Dropdown_select(WebElement dropdown_element,String dropdown_text)
		{
			Select dropdown_option = new Select(dropdown_element);
			dropdown_option.selectByVisibleText(dropdown_text);
		}
		
		
		// It is used for click on element
		public static void ElementOnClick(WebElement click_element)
		{
			click_element.click();
		}
		
		
		// It is used for checking is element present
		public static boolean IsElementPresent(WebElement present_element)
		{
			return present_element.isDisplayed();
		}
		
		
}
