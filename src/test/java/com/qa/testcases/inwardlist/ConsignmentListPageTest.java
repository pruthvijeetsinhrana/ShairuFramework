package com.qa.testcases.inwardlist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.inwardlistpages.ConsignmentListPage;
import com.qa.utils.TestUtil;

public class ConsignmentListPageTest extends TestBase {
	
	ConsignmentListPage consignmentlistpage;
	
	
	
	
	public ConsignmentListPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		consignmentlistpage = new ConsignmentListPage();
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
		
		consignmentlistpage.Navigate_consignmentlist_menu();
	}
	
	@Test(priority=2)
	public void Verify_inwardbutton_click()
	{
		consignmentlistpage.Open_inward_button();
	}
	
	@Test(priority=3)
	public void Verify_filldata_DocumentDeatils()
	{
		consignmentlistpage.fill_data_DocumentDetails();
		
		
	}
}
