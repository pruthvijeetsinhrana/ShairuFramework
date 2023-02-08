package com.qa.testcases.inwardlist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.inwardlistpages.JobWorkRepairListPage;
import com.qa.inwardlistpages.JobWorkRoughListPage;
import com.qa.utils.TestUtil;

public class JobWorkRepairListPageTest extends TestBase {
	
	JobWorkRepairListPage jobworkrepairlistpage;
	
	
	
	
	public JobWorkRepairListPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		jobworkrepairlistpage = new JobWorkRepairListPage();
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
		
		jobworkrepairlistpage.Navigate_jobworkrepair_menu();
	}
	
	@Test(priority=2)
	public void Verify_inwardbutton_click()
	{
		jobworkrepairlistpage.Open_inward_button();
	}
	
}
