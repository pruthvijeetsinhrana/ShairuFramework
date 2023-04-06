package com.qa.testcases.masterpages.subpages_4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.masterpages.subpages_4.RolePage;
import com.qa.utils.TestUtil;

public class RolePageTest extends TestBase {

	RolePage rolepage;
	
	
	
	
	public RolePageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		rolepage = new RolePage();
		TestUtil.ValidateUserLogin();
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
	
	@Test(priority=1)
	public void Verify_Navigation_to_menupage()   // To check navigation to sub menu
	{	
		rolepage.Navigate_sub_menu();
	}
	
	@Test(priority=2)
	public void Verify_Clicking_on_record_btn()   // To check click on Record button
	{	 
		rolepage.Click_on_Record();
	}
	
	@Test(priority=3)
	public void Verify_Record_Add()   // To check by adding record & verifying it is created or not.
	{	
		rolepage.add_data_record();
	}
	
	@Test(priority=4)
	public void Verify_Record_Already_exists()
	{	
		rolepage.Record_already_exists();  //To check record is already exists.
	}
	
	@Test(priority=5)
	public void Verify_Validation_with_no_data()
	{	
		rolepage.validation_msg();  //To check by validation msg on add record without data
	}
	
	@Test(priority=6)
	public void Verify_Record_Edited()
	{	
		rolepage.edit_functionality(); //To check edit record 
	}
	
	@Test(priority=7)
	public void Verify_Record_ToggleStatus()
	{	
		rolepage.toggle_status();  //To check toggle status
	}
	
	@Test(priority=8)
	public void Verify_No_Record_found()
	{	
		rolepage.random_search();  //To check by entering random text & verify no result found.
	}
	
	@Test(priority=9)
	public void Verify_Pagination()
	{	
		rolepage.pagination();  //To check pagination.
	}
	
	
	
}
