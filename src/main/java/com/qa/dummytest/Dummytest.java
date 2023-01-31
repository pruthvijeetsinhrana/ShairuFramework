package com.qa.dummytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class Dummytest extends TestBase {
	
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		
		
	}
	
	
	@Test
	public void TestRun() throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//span[normalize-space()='Inward List'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[normalize-space()='Job Work Rough List'])[1]")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("D:\\ShairuFramework\\src\\main\\java\\com\\qa\\dummytest\\dummy.pdf");
		
	}

}
		

