package com.qa.testcases.inwardlist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.inwardlistpages.MemoListPage;
import com.qa.utils.TestUtil;

public class MemoListPageTest extends TestBase {
	
	MemoListPage memolistlistpage;
	
	
	
	
	public MemoListPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		memolistlistpage = new MemoListPage();
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
		
		memolistlistpage.Navigate_memolist_menu();
	}
	
	@Test(priority=2)
	public void Verify_inwardbutton_click()
	{
		memolistlistpage.Open_inward_button();
	}
	
	@Test(priority=3)
	public void Verify_filldata_DocumentDeatils()
	{
		memolistlistpage.fill_data_DocumentDetails();
		
		
	}

	@Test(priority=4)
	public void  Verify_fill_data_DocumentLines()
	{
		memolistlistpage.fill_data_DocumentLines();
		
	}

	@Test(priority=5)
	public void  Verify_fill_data_JangadExpenseDetails()
	{
		memolistlistpage.fill_data_JangadExpenseDetails();
		
	}

	@Test(priority=6)
	public void  Verify_ValidateConfirmationRecord()
	{
		memolistlistpage.ValidateConfirmationRecord();
		
	}

	@Test(priority=7)
	public void  Verify_ValidateDisableFields()
	{
		memolistlistpage.ValidateDisableFields();
		
	}
	
	@Test(priority=8)
	public void  Verify_ValidateEditFunctionality()
	{
		memolistlistpage.ValidateEditFunctionality();
		
	}
	
}
