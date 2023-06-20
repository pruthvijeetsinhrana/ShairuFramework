package com.qa.inwardlistpages;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class MemoListPage extends TestBase{
	

	//Random String generated for : Document Number & all 
	String Common_No_random	= TestUtil.RandomStringGenerator();
	
	//File path 
		public String Commonpath_pdf = System.getProperty("user.dir")+ prop.getProperty("Commonpath_pdf");
		public String Commonpath_image = System.getProperty("user.dir")+ prop.getProperty("Commonpath_image");
	
	//Document Info section 
	

	
		@FindBy(xpath= "(//span[normalize-space()='Inward List'])[1]")
		WebElement inwardlist_menu;
		
		@FindBy(xpath= "(//a[normalize-space()='Memo List'])[1]")
		WebElement memolist_menu;
		
		@FindBy(xpath= "(//button[@class='ant-btn ant-btn-default ant-btn-lg btn-orange btn-table-top'])[1]")
		WebElement inward_button;
		

		@FindBy(xpath= "//div[contains(text(),'Memo')]")
		WebElement InwardType_text;
		
		@FindBy(xpath= "//input[@placeholder = 'Select date']")
		WebElement Inwarddate;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[2]")
		WebElement DocumentDate;
		
		@FindBy(xpath= "(//input[@id='react-select-3-input'])[1]")
		WebElement DocumentType;
		
		@FindBy(xpath= "(//div[@id='react-select-3-option-0'])[1]")
		WebElement DocumentType_select;
		
		
		
		@FindBy(xpath= "//input[@name='document_no']")
		WebElement DocumentNo;
		
		@FindBy(xpath= "//input[@name='duration']")
		WebElement Duration_field;
		
		@FindBy(xpath= "(//div[contains(@class,'css-gbulqg-control')])[2]")
		WebElement SenderName;
		
		@FindBy(xpath= "(//div[@id='react-select-4-option-0'])[1]")
		WebElement SenderName_select;
		
		
		@FindBy(xpath= "(//div[@class=' css-gbulqg-control'])[3]")
		WebElement TransactionType;
		
		@FindBy(id= "react-select-5-option-1")
		WebElement TransactionType_select;
		

		@FindBy(xpath= "//input[@name='total_packets']")
		WebElement TotalPackets;
		
		@FindBy(xpath= "//input[@name='total_pieces']")
		WebElement TotalPieces;
		
		@FindBy(xpath= "//input[@name='total_carats']")
		WebElement TotalCarats;
		
		@FindBy(xpath= "//input[@name='inward_pieces']")
		WebElement InwardPieces;
		
		@FindBy(xpath= "//input[@name='inward_carats']")
		WebElement InwardCarats;
		
		
		@FindBy(xpath= "(//input[@type='file'])[1]")
		WebElement DocumentFile;
		
		@FindBy(xpath= "(//div[contains(@class,' css-gbulqg-control')])[4]")
		WebElement ExchangeType;
		
		@FindBy(id= "react-select-6-option-1")
		WebElement ExchangeType_select;
		
		
		@FindBy(xpath= "//input[@name='exchange_rate_boe']")
		WebElement ExchangeRate_BOE;
		
		@FindBy(xpath= "//input[@name='exchange_rate_rbi']")
		WebElement ExchangeRate_RBI;
		
		// Total Invoice value in $
		
		@FindBy(xpath= "//input[@name='gross_value_forex']")
		WebElement GrossValue;
		@FindBy(xpath= "//input[@name='expense_forex']")
		WebElement Expense;
		
		// Save buttons of page 
		
		@FindBy(xpath= "(//button[@type='submit'])[1]")
		WebElement save_button1;
		
		//Success message 
		@FindBy(xpath= "//span[normalize-space()='Inward Document created successfully.']")
		WebElement success_msg;
		
		//Edit from Listing page
		@FindBy(xpath = "(//div[@class='ant-space-item'])[6]")
		WebElement edit_Record;
		
		@FindBy(xpath= "(//button[@type='button'])[3]")
		WebElement row_button1;
		
		
		@FindBy(xpath="(//div[@class='right-side-btn border-none btn-spacing text-right'])[1]/button[1]")
		WebElement reset_kapan;
		
		@FindBy(xpath = "(//input[@type='number'])[12]")
		WebElement Fetch_Rate;

		
		//Document line section
		
		@FindBy(xpath= "(//input[@type='text'])[11]")
		WebElement KapanNo;
		
		
		@FindBy(css= ".ant-table-cell:nth-child(3) .ant-input")
		WebElement Pieces;
		
		@FindBy(xpath= "(//input[@type='number'])[11]")
		WebElement Carats;
		
		@FindBy(xpath= "(//input[@type='number'])[12]")
		WebElement Rate;
		
		@FindBy(xpath= "(//button[@type='submit'])[2]")
		WebElement Save_button3; 
		
		//Jangad Expense Details
		
		@FindBy(xpath= "(//button[@type='button'])[5]")
		WebElement row_button_Jangad;
		
		@FindBy(xpath= "(//div[@class='ant-table-content'])[2]")
		WebElement Jangad_table;
		
		@FindBy(xpath= "(//input[@type='text'])[14]")
		WebElement JangadNo;
		
		@FindBy(xpath= "(//div[contains(@class,' css-gbulqg-control')])[2]")
		WebElement CourierPartyName;
		
		@FindBy(id= "react-select-13-option-1")
		WebElement CourierPartyName_select;
		
		
		@FindBy(xpath= "(//input[@type='text'])[16]")
		WebElement CourierNo;
		
		@FindBy(xpath= "(//input[@type='file'])[2]")
		WebElement CourierDocument; 
		
		//1
		@FindBy(xpath= "(//div[contains(@class,' css-gbulqg-control')])[3]")
		WebElement Expense1;
		
		@FindBy(id= "react-select-14-option-0")
		WebElement Expense1_select;
		
		@FindBy(xpath= "(//input[@type='number'])[13]")
		WebElement Expense1_value;
		
		//2
				@FindBy(xpath= "(//div[contains(@class,' css-gbulqg-control')])[4]")
				WebElement Expense2;
				
				@FindBy(id= "react-select-15-option-0")
				WebElement Expense2_select;
				
				@FindBy(xpath= "(//input[@type='number'])[14]")
				WebElement Expense2_value;
				
				//3
				@FindBy(xpath= "(//div[contains(@class,' css-gbulqg-control')])[5]")
				WebElement Expense3;
				
				@FindBy(id= "react-select-16-option-0")
				WebElement Expense3_select;
				
				@FindBy(xpath= "(//input[@type='number'])[15]")
				WebElement Expense3_value;
				
				//4
				@FindBy(xpath= "(//div[contains(@class,' css-gbulqg-control')])[6]")
				WebElement Expense4;
				
				@FindBy(id= "react-select-17-option-0")
				WebElement Expense4_select;
				
				@FindBy(xpath= "(//input[@type='number'])[16]")
				WebElement Expense4_value;
				
		@FindBy (xpath = "(//td[@class='ant-table-cell ant-table-cell-fix-right ant-table-cell-fix-right-first'])[2]")
		WebElement delete_jangad;
				
		@FindBy(xpath= "(//div[@class='ant-select-selector'])[2]")
		WebElement appliedfield;
		
		@FindBy(xpath= "(//div[@class='ant-select-selector'])[2]/div/div/div/input")
		WebElement appliedfield_textfield;
		
		@FindBy(xpath= "(//div[@class='ant-select-item-option-content'])[1]")
		WebElement appliedfield_select;
		
		
		
		//navigation to Hide_button
		@FindBy(xpath= "(//span[@aria-label='left'])[1]")
		WebElement navigation_hidebutton;
		
		
		
		@FindBy(xpath= "//button[@type='button']//span[@aria-label='save']")
		WebElement Save_finalbutton;
		
		
		//Confirmation Record - record added successfully
		@FindBy(xpath= "//td[normalize-space()='+text_record+']")
		WebElement Record_added;
		
		//View button
		@FindBy(xpath= "(//*[name()='svg'])[35]")
		WebElement view_button;
		
		//Edit Functionality 
		
		@FindBy(xpath= "(//span[@aria-label='edit'])[1]")
		WebElement edit_button;
		
		//Completed Icon - green tick 
		
				@FindBy(xpath= "(//*[name()='svg'])[34]")
				WebElement green_icon;
				
				
				// Search Functionality 
				
				@FindBy(xpath= "(//input[@placeholder='Search...'])[1]")
				WebElement search_field;
				
				@FindBy(xpath= "//div[contains(text(),'No search data')]")
				WebElement No_search_data;
				
				//pagination Elements
				@FindBy(xpath= "(//button[@type='button'])[2]")
				WebElement previous_pagination_button;
				
				@FindBy(xpath= "(//button[@type='button'])[3]")
				WebElement next_pagination_button;
				
		
		
		//Success message after edit
		@FindBy(xpath= "(//span[normalize-space()='Record added successfully'])[1]")
		WebElement success_msg_edit;
		
		public MemoListPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void Navigate_memolist_menu() 
		{
			try {
				TestUtil.navigate_to_option1(inwardlist_menu,memolist_menu);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void Open_inward_button()
		{
			((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			inward_button.isDisplayed();
			inward_button.click();
			System.out.println("Inward module is open - user can enter data in it.");
			
			
		}
		
		public void fill_data_DocumentDetails() 
		{
			InwardType_text.isDisplayed();
			
			Inwarddate.getText();
			
		
	   
			 DocumentDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 DocumentDate.sendKeys(Keys.RETURN);
			
			 try {
				TestUtil.navigate_to_option1(DocumentType,DocumentType_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 DocumentNo.sendKeys(Common_No_random);
			 Duration_field.sendKeys(prop.getProperty("Duration_field"));
			 
			 try {
				TestUtil.navigate_to_option1(SenderName,SenderName_select);
				Thread.sleep(1000);
				TestUtil.navigate_to_option1(TransactionType,TransactionType_select);
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 TotalPackets.sendKeys(prop.getProperty("TotalPackets"));
			 
			TotalPieces.sendKeys(prop.getProperty("TotalPieces"));
				
			TotalCarats.sendKeys(prop.getProperty("TotalCarats"));
				
			InwardPieces.sendKeys(prop.getProperty("InwardPieces"));
				
			InwardCarats.sendKeys(prop.getProperty("InwardCarats"));
				
				
			
			TestUtil.upload_file(DocumentFile,Commonpath_pdf);
			try {
				TestUtil.navigate_to_option1(ExchangeType,ExchangeType_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			ExchangeRate_BOE.sendKeys(prop.getProperty("ExchangeRate_BOE"));
			ExchangeRate_RBI.sendKeys(prop.getProperty("ExchangeRate_RBI"));
			
			
			
			GrossValue.sendKeys(prop.getProperty("GrossValue"));
			Expense.sendKeys(prop.getProperty("Expense"));
			
			
			
			save_button1.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void edit_Record() throws Exception
		{
			Thread.sleep(2000);
			memolist_menu.click();
			Thread.sleep(2000);
			
			edit_Record.click();
			Thread.sleep(3000);
			
		}
		
		public void fill_data_DocumentLines() throws InterruptedException
		{
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",save_button1 );
			//row_button1.isDisplayed();
			Thread.sleep(3000);
			
			/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(row_button1));
			*/
			row_button1.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String fetch_rate_value = Fetch_Rate.getText().toString();
			System.out.println("Fetching auto correct value from Rate field := "+fetch_rate_value);
			
			
			KapanNo.sendKeys(Common_No_random);
			
			//Pieces.sendKeys(prop.getProperty("Pieces"));
			
			//Carats.sendKeys(prop.getProperty("Carats"));
			
			//Rate.sendKeys(prop.getProperty("Rate"));
			
			WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait1.until(ExpectedConditions.elementToBeClickable(Save_button3));
			
			Save_button3.click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			navigation_hidebutton.click();
			
			
			
		}
		
		public void fill_data_JangadExpenseDetails() throws Exception
		{
			Thread.sleep(5000);
			
			TestUtil.scroll_until();
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(row_button_Jangad));
			
			Thread.sleep(2000);
			
			row_button_Jangad.click();
			
			//Thread.sleep(5000);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			JangadNo.sendKeys(Common_No_random);
			Thread.sleep(5000);
			
			try {
				TestUtil.navigate_to_option1(CourierPartyName,CourierPartyName_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Thread.sleep(5000);
			CourierNo.sendKeys(Common_No_random);
			
			
			 TestUtil.upload_file(CourierDocument,Commonpath_pdf);
			 
			 Thread.sleep(2000);
			 
			 try {
				 Thread.sleep(2000);
					TestUtil.navigate_to_option1(Expense1,Expense1_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
				Expense1_value.sendKeys(prop.getProperty("Expense"));
				Thread.sleep(2000);
				
				try {
					Thread.sleep(2000);
					TestUtil.navigate_to_option1(Expense2,Expense2_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Expense2_value.sendKeys(prop.getProperty("Expense"));
				
				Thread.sleep(3000);
				/*Robot rb =new Robot();
				rb.keyPress(KeyEvent.VK_RIGHT);
				rb.keyRelease(KeyEvent.VK_RIGHT);
				rb.keyPress(KeyEvent.VK_RIGHT);
				rb.keyRelease(KeyEvent.VK_RIGHT);
				rb.keyPress(KeyEvent.VK_RIGHT);
				rb.keyRelease(KeyEvent.VK_RIGHT);*/
				//Actions action = new Actions(driver);
			
				
				Expense2_value.sendKeys(Keys.TAB);
				Expense3_value.click();
				Expense3_value.sendKeys(Keys.TAB);
				
				
			//	JavascriptExecutor js = (JavascriptExecutor) driver;
			//	js.executeScript("document.querySelector(scroll).scrollRight=1000");

				
				try {
					Thread.sleep(2000);
					TestUtil.navigate_to_option1(Expense3,Expense3_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Thread.sleep(2000);
				
				Expense3_value.sendKeys(prop.getProperty("Expense"));
				Expense3_value.sendKeys(Keys.TAB);
				
				try {
					Thread.sleep(5000);
					TestUtil.navigate_to_option1(Expense4,Expense4_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Thread.sleep(2000);
			 
				Expense4_value.sendKeys(prop.getProperty("Expense"));
				Expense4_value.sendKeys(Keys.TAB);
				
				Thread.sleep(3000);
				//appliedfield.click();
				
				try {
					TestUtil.navigate_to_option1(appliedfield,appliedfield_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
				//Scroll down till the bottom of the page
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Save_finalbutton.click();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				

		}
		
		//After record added 
		
		public void ValidateConfirmationRecord() throws InterruptedException 
		{
			String text_record = Common_No_random;
			
			
			WebElement Record_added = driver.findElement(By.xpath("//*[contains(text(),'"+text_record+"')]"));
			Assert.assertEquals(Record_added.getText(),text_record);
			
			Thread.sleep(1000);
			Assert.assertTrue(green_icon.isDisplayed());
		}
		
		public void ValidateDisableFields()
		{
			view_button.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<WebElement> disable_fields = driver.findElements(By.xpath("//input[@disabled]"));
		      System.out.println("Total number of disable elements on page: " + disable_fields.size());
			
		}
		
		public void ValidateEditFunctionality()
		{
			driver.navigate().back();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			edit_button.click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			save_button1.click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 
			
			 
			Save_button3.click();
			 
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 Save_finalbutton.click();
			 
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 
			 Assert.assertTrue(success_msg_edit.isDisplayed());
			 
			 
		}
		
		public void search_functionality_test()
		{
			search_field.isDisplayed();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			search_field.sendKeys(prop.getProperty("Random_text"));
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Assert.assertEquals(No_search_data.getText(),"No search data");    
			
		}
		
		public void pagination_functionality() throws InterruptedException
		{
			driver.navigate().refresh();
			
			if(previous_pagination_button.isEnabled()== false)
			{
				
				Thread.sleep(1000);
				next_pagination_button.click();
				Thread.sleep(2000);
				next_pagination_button.click();
				Thread.sleep(2000);
				previous_pagination_button.click();
			}
			else
			{
				System.out.println("Pagination functionality is not working..");
			}
			
			
			
		}
		
		
}
