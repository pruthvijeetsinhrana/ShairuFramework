package com.qa.testcases.masterpages.subpages_1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.masterpages.subpages_1.OccupationPage;
import com.qa.utils.TestUtil;

public class OccupationPageTest extends TestBase {

	OccupationPage occupationpage;
	
	
	
	
	public OccupationPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		occupationpage = new OccupationPage();
		TestUtil.ValidateUserLogin();
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
	
	@Test(priority=1)
	public void Verify_Navigation()
	{	
		
		occupationpage.Navigate_occupation_menu();
	}
	
	@Test(priority=2)
	public void Verify_Clicking_on_record_btn()
	{	
		
		occupationpage.Click_on_Record();
	}
	
	@Test(priority=3)
	public void Verify_Record_Add()
	{	
		
		occupationpage.add_data_record();
	}
	
	@Test(priority=4)
	public void Verify_Record_Edited()
	{	
		occupationpage.edit_functionality();
	}
	
	@Test(priority=5)
	public void Verify_Record_ToggleStatus()
	{	
		occupationpage.toggle_status();
	}
	
	@Test(priority=6)
	public void Verify_No_Record_found()
	{	
		
		occupationpage.random_search();  //To check by entering random text & verify no result found.
	}
}
