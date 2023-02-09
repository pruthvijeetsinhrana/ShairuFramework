package com.qa.inwardlistpages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class ConsignmentListPage extends TestBase{
	
	//File path 
		public String Commonpath_pdf = System.getProperty("user.dir")+ prop.getProperty("Commonpath_pdf");
		public String Commonpath_image = System.getProperty("user.dir")+ prop.getProperty("Commonpath_image");
	
	//Document Info section 
	

	
		@FindBy(xpath= "(//span[normalize-space()='Inward List'])[1]")
		WebElement inwardlist_menu;
		
		@FindBy(xpath= "(//a[normalize-space()='Consignment List'])[1]")
		WebElement consignmentlist_menu;
		
		@FindBy(xpath= "(//button[@class='ant-btn ant-btn-default ant-btn-lg btn-orange btn-table-top'])[1]")
		WebElement inward_button;
		

		@FindBy(xpath= "//div[contains(text(),'Consignment')]")
		WebElement InwardType_text;
		
		@FindBy(xpath= "//input[@placeholder = 'Select date']")
		WebElement Inwarddate;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[2]")
		WebElement DocumentDate;
		
		@FindBy(xpath= "(//input[@id='react-select-3-input'])[1]")
		WebElement DocumentType;
		
		@FindBy(xpath= "(//div[@id='react-select-3-option-0'])[1]")
		WebElement DocumentType_select;
		
		
		
		@FindBy(xpath= "(//input[@type='text'])[3]")
		WebElement DocumentNo;
		
		@FindBy(xpath= "(//input[@type='text'])[4]")
		WebElement Duration_field;
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[2]")
		WebElement SenderName;
		
		@FindBy(xpath= "(//div[@id='react-select-4-option-0'])[1]")
		WebElement SenderName_select;
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[3]")
		WebElement ReceivedFrom;
		
		@FindBy(id= "react-select-5-option-1")
		WebElement ReceivedFrom_select;
		
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[4]")
		WebElement TransactionType;
		
		@FindBy(id="react-select-6-option-1")
		WebElement TransactionType_select;
		

		
		
		@FindBy(xpath= "(//input[@type='text'])[8]")
		WebElement TotalPieces;
		
		@FindBy(xpath= "(//input[@type='number'])[1]")
		WebElement TotalCarats;
		
		@FindBy(xpath= "(//input[@type='text'])[9]")
		WebElement InwardPieces;
		
		@FindBy(xpath= "(//input[@type='number'])[2]")
		WebElement InwardCarats;
		
		@FindBy(xpath= "(//input[@type='number'])[3]")
		WebElement TotalPackets;
		
		
		@FindBy(xpath= "(//input[@type='file'])[1]")
		WebElement DocumentFile;
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[5]")
		WebElement ExchangeType;
		
		@FindBy(id="react-select-7-option-0")
		WebElement ExchangeType_select;
		
		
		@FindBy(xpath= "(//input[@type='number'])[4]")
		WebElement ExchangeRate_BOE;
		
		@FindBy(xpath= "(//input[@type='number'])[5]")
		WebElement ExchangeRate_RBI;
		
		// Total Invoice value in $
		
		@FindBy(xpath= "(//input[@type='number'])[6]")
		WebElement GrossValue;
		@FindBy(xpath= "(//input[@type='number'])[7]")
		WebElement Expense;
		
		// Save buttons of page 
		
		@FindBy(xpath= "(//button[@type='submit'])[1]")
		WebElement save_button1;
		
		//KP Certificate Details section 
		
				@FindBy(xpath= "(//input[@type='text'])[11]")
				WebElement CertificateNo;
				
				@FindBy(xpath= "(//div[@class=' css-1d8n9bt'])[7]")
				WebElement Origin;
				
				@FindBy(id= "react-select-8-option-3")
				WebElement Origin_select;
				
				@FindBy(xpath= "(//input[@placeholder='Select date'])[4]")
				WebElement IssueDate;
				
				@FindBy(xpath= "(//input[@placeholder='Select date'])[5]")
				WebElement ExpiryDate;
				
				@FindBy(xpath= "(//input[@type='file'])[2]")
				WebElement Certificate;
				
				//Bill of Entry Details
				
				@FindBy(xpath= "(//input[@placeholder='Select date'])[6]")
				WebElement BOE_Date;
				
				@FindBy(xpath= "(//input[@type='text'])[13]")
				WebElement BOE_No;
				
				@FindBy(xpath= "(//input[@type='text'])[14]")
				WebElement MAWB_No;
				
				@FindBy(xpath= "(//input[@type='text'])[15]")
				WebElement HAWB_No;
				
				@FindBy(xpath= "(//input[@placeholder='Select date'])[7]")
				WebElement Source_InwardDate;
				
				@FindBy(xpath= "(//input[@type='file'])[3]")
				WebElement BillofEntry_upload;
				
				@FindBy(xpath= "(//input[@type='file'])[4]")
				WebElement Airwaybill_upload;
				
				@FindBy(xpath= "(//button[@type='submit'])[2]")
				WebElement Save_button2;
				
				
				@FindBy(xpath= "(//button[@type='button'])[15]")
				WebElement row_button1;

				
				//Document line section
				
				@FindBy(xpath= "(//input[@type='text'])[16]")
				WebElement KapanNo;
				
				
				@FindBy(xpath= "(//input[@type='text'])[17]")
				WebElement Pieces;
				
				@FindBy(xpath= "(//input[@type='number'])[12]")
				WebElement Carats;
				
				@FindBy(xpath= "(//input[@type='number'])[13]")
				WebElement Rate;
				
				@FindBy(xpath= "(//button[@type='submit'])[3]")
				WebElement Save_button3;
				
				//Jangad Expense Details
				
				@FindBy(xpath= "(//button[@type='button'])[17]")
				WebElement row_button_Jangad;
				
				@FindBy(xpath= "(//input[@type='text'])[19]")
				WebElement JangadNo;
				
				@FindBy(xpath="/html/body/div[1]/div/section/section/main/div[4]/form/div/div/div/div/div/div/table/tbody/tr[2]/td[4]/div/div/div/div/div/div/div/div[1]/div[2]")
				WebElement CourierPartyName;
				
				@FindBy(id="react-select-23-option-1")
				WebElement CourierPartyName_select;
				
				@FindBy(xpath= "(//input[@type='text'])[20]")
				WebElement CourierNo;
				
				@FindBy(xpath= "(//input[@type='file'])[5]")
				WebElement CourierDocument;
				
				@FindBy(xpath= "(//div[contains(@class,'css-zq61zj-control')])[3]")
				WebElement Expense1;
				
				@FindBy(id= "react-select-11-option-1")
				WebElement Expense1_select;
				
				@FindBy(xpath= "(//input[@type='number'])[14]")
				WebElement Expense1_value;
				
				@FindBy(xpath= "(//div[@class='ant-select ant-select-sm ant-select-in-form-item ant-select-multiple ant-select-allow-clear ant-select-open ant-select-show-search'])[1]")
				WebElement appliedfield;
				
				
				@FindBy(xpath= "(//div[@class='ant-select-item-option-content'])[1]")
				WebElement appliedfield_select;
				
				
				
				//navigation to Hide_button
				@FindBy(xpath= "(//span[@aria-label='left'])[1]")
				WebElement navigation_hidebutton;
				
				
				
				@FindBy(xpath= "(//div[@class='ant-table ant-table-bordered ant-table-ping-left ant-table-fixed-column ant-table-scroll-horizontal ant-table-has-fix-right'])[1]")
				WebElement horizontal_scroll;
				
				@FindBy(xpath= "(//span[normalize-space()='Save'])[1]")
				WebElement Save_finalbutton;
				
				//Confirmation Record - record added successfully
				@FindBy(xpath= "//td[normalize-space()='+text_record+']")
				WebElement Record_added;
				
				//View button
				@FindBy(xpath= "(//*[name()='svg'])[35]")
				WebElement view_button;
				
				
				//Edit Functionality 
				
				@FindBy(xpath= "(//*[name()='svg'])[36]")
				WebElement edit_button;
				
				
				// Success msg edit page
				
				@FindBy(xpath= "//span[normalize-space()='Record added successfully']")
				WebElement success_edit_msg;
				
				
		
		public ConsignmentListPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void Navigate_consignmentlist_menu() 
		{
			try {
				TestUtil.navigate_to_option1(inwardlist_menu,consignmentlist_menu);
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
			 
			 DocumentNo.sendKeys(prop.getProperty("Common_No"));
			 Duration_field.sendKeys(prop.getProperty("Duration_field"));
			 
			 
				 try {
						TestUtil.navigate_to_option1(SenderName,SenderName_select);
						Thread.sleep(1000);
						TestUtil.navigate_to_option1(ReceivedFrom,ReceivedFrom_select);
						Thread.sleep(1000);
						TestUtil.navigate_to_option1(TransactionType,TransactionType_select);
						Thread.sleep(1000);
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
		
		public void fill_data_KPCertificateDetails()
		{
			
			
			CertificateNo.sendKeys(prop.getProperty("Common_No"));
			
			
			
			
			
			 
			
			try {
				TestUtil.navigate_to_option1(Origin,Origin_select);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			IssueDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			IssueDate.sendKeys(Keys.RETURN);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ExpiryDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			ExpiryDate.sendKeys(Keys.RETURN);
			
			TestUtil.upload_file(Certificate,Commonpath_pdf);
			
		}
		
		
		public void fill_data_BillEntryDetails()
		{
			BOE_Date.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			BOE_Date.sendKeys(Keys.RETURN);
			
			 BOE_No.sendKeys(prop.getProperty("Common_No"));
			
			 MAWB_No.sendKeys(prop.getProperty("Common_No"));
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 HAWB_No.sendKeys(prop.getProperty("Common_No"));
			
			 Source_InwardDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			 Source_InwardDate.sendKeys(Keys.RETURN);
			 
			 TestUtil.upload_file(BillofEntry_upload,Commonpath_pdf);
			 
			 TestUtil.upload_file(Airwaybill_upload,Commonpath_pdf);
			
			 Save_button2.click();
			
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(row_button1));
				

				
				row_button1.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		public void fill_data_DocumentLines()
		{
			KapanNo.sendKeys(prop.getProperty("Common_No"));
			
			Pieces.sendKeys(prop.getProperty("Pieces"));
			
			Carats.sendKeys(prop.getProperty("Carats"));
			
			Rate.sendKeys(prop.getProperty("Rate"));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(Save_button3));
			
			Save_button3.click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			navigation_hidebutton.click();
			
			
			
		}
		
		public void fill_data_JangadExpenseDetails()
		{
			TestUtil.scroll_until();
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(row_button_Jangad));
			
			
			row_button_Jangad.click();
			
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			JangadNo.sendKeys(prop.getProperty("Common_No"));
			
			
			try {
				TestUtil.navigate_to_option1(CourierPartyName,CourierPartyName_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			CourierNo.sendKeys(prop.getProperty("Common_No"));
			
			
			 TestUtil.upload_file(CourierDocument,Commonpath_pdf);
			 
			 

				try {
					TestUtil.navigate_to_option1(Expense1,Expense1_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			 
				Expense1_value.sendKeys(prop.getProperty("Expense1_value"));
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				//Scroll down till the bottom of the page
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

				
				
				appliedfield.click();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					TestUtil.navigate_to_option1(appliedfield,appliedfield_select);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				try {
					Thread.sleep(2000);
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
}
