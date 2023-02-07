package com.qa.inwardlistpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class JobWorkRoughListPage extends TestBase{
	
	//Document Info section 
	
		@FindBy(xpath= "(//span[normalize-space()='Inward List'])[1]")
		WebElement inwardlist_menu;
		
		@FindBy(xpath= "(//a[normalize-space()='Job Work Rough List'])[1]")
		WebElement jobworkroughlist_menu;
		
		@FindBy(xpath= "(//span[@class='btn-text'])[1]")
		WebElement inward_button;
		
		@FindBy(xpath= "//div[contains(text(),'Job Work Rough')]")
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
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[2]")
		WebElement SenderName;
		
		@FindBy(xpath= "(//div[@id='react-select-4-option-0'])[1]")
		WebElement SenderName_select;
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[3]")
		WebElement ReceivedFrom;
		
		@FindBy(xpath= "(//div[@id='react-select-5-option-1'])[1]")
		WebElement ReceivedFrom_select;

		@FindBy(xpath= "(//div[@class=' css-13z0ixq'])[4]")
		WebElement TransactionType;
		
		@FindBy(xpath= "(//div[@id='react-select-6-option-1'])[1]")
		WebElement TransactionType_select;
		
		@FindBy(xpath= "(//input[@type='text'])[7]")
		WebElement TotalPieces;
		
		@FindBy(xpath= "(//input[@type='number'])[1]")
		WebElement TotalCarats;
		
		@FindBy(xpath= "(//input[@type='text'])[8]")
		WebElement InwardPieces;
		
		@FindBy(xpath= "(//input[@type='number'])[2]")
		WebElement InwardCarats;
		
		
		
		
		
		
		
		@FindBy(xpath= "(//input[@type='number'])[3]")
		WebElement TotalPackets;
		
		@FindBy(xpath= "(//input[@type='file'])[1]")
		WebElement DocumentFile;
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[5]")
		WebElement ExchangeType;
		
		@FindBy(xpath= "(//div[@id='react-select-7-option-1'])[1]")
		WebElement ExchangeType_select;
		
		
		@FindBy(xpath= "(//input[@type='number'])[4]")
		WebElement ExchangeRate_BOE;
		
		@FindBy(xpath= "(//input[@type='number'])[5]")
		WebElement ExchangeRate_RBI;
		
		@FindBy(xpath= "(//input[@accept='image/jpg, image/jpeg, image/png'])[1]")
		WebElement RoughImages;
		
		// Total Invoice value in $
		
		@FindBy(xpath= "(//input[@type='number'])[6]")
		WebElement GrossValue;
		@FindBy(xpath= "(//input[@type='number'])[7]")
		WebElement Expense;
		
		// Save buttons of page 
		
		@FindBy(xpath= "(//button[@type='submit'])[1]")
		WebElement save_button1;
		
		//Success message 
		@FindBy(xpath= "//span[normalize-space()='Inward Document updated successfully.']")
		WebElement success_msg;
		
		
		//KP Certificate Details section 
		
		@FindBy(xpath= "(//input[@type='text'])[10]")
		WebElement CertificateNo;
		
		@FindBy(xpath= "(//div[@id='react-select-8-placeholder'])[1]")
		WebElement Origin;
		
		@FindBy(xpath= "(//div[@id='react-select-8-option-4'])[1]")
		WebElement Origin_select;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[3]")
		WebElement IssueDate;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[4]")
		WebElement ExpiryDate;
		
		@FindBy(xpath= "(//input[@type='file'])[3]")
		WebElement Certificate;
		
		//Bill of Entry Details
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[5]")
		WebElement BOE_Date;
		
		@FindBy(xpath= "(//input[@type='text'])[12]")
		WebElement BOE_No;
		
		@FindBy(xpath= "(//input[@type='text'])[13]")
		WebElement MAWB_No;
		
		@FindBy(xpath= "(//input[@type='text'])[14]")
		WebElement HAWB_No;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[6]")
		WebElement Source_InwardDate;
		
		@FindBy(xpath= "(//input[@type='file'])[4]")
		WebElement BillofEntry_upload;
		
		@FindBy(xpath= "(//input[@type='file'])[5]")
		WebElement Airwaybill_upload;
		
		@FindBy(xpath= "(//button[@type='submit'])[2]")
		WebElement Save_button2;
		
		
		// Corresponding Invoice & KP Information
		
		@FindBy(xpath= "(//input[@type='text'])[15]")
		WebElement Invoice_No;
		
		@FindBy(xpath= "(//input[@type='number'])[12]")
		WebElement Invoice_Weight;
		
		@FindBy(xpath= "(//input[@type='file'])[6]")
		WebElement Invoice;
		
		@FindBy(xpath= "(//input[@accept='application/pdf, application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, text/csv'])[1]")
		WebElement Packing_List;
		
		@FindBy(xpath= "(//input[@type='text'])[16]")
		WebElement KP_Certificate_No;
		
		@FindBy(xpath= "(//div[@class=' css-13z0ixq'])[7]")
		WebElement Origin_invoicesection;
		
		@FindBy(xpath= "(//div[@id='react-select-9-option-3'])[1]")
		WebElement Origin_invoicesection_select;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[7]")
		WebElement IssueDate_invoicesection;
		
		@FindBy(xpath= "(//input[@placeholder='Select date'])[8]")
		WebElement ExpiryDate_invoicesection;
		
		@FindBy(xpath= "(//input[@type='file'])[8]")
		WebElement Certificate__invoicesection;
		
		//Mining Information Elements
		
		@FindBy(css= ".mining_name .css-1d8n9bt")
		WebElement MiningName;
		
		@FindBy(id= "react-select-10-option-1")
		WebElement MiningName_select;
		
		@FindBy(xpath= "(//button[@type='button'])[28]")
		WebElement row_button1;

		
		//Document line section
		
		@FindBy(xpath= "(//input[@type='text'])[21]")
		WebElement KapanNo;
		
		
		@FindBy(xpath= "(//input[@type='text'])[22]")
		WebElement Pieces;
		
		@FindBy(xpath= "(//input[@type='number'])[13]")
		WebElement Carats;
		
		@FindBy(xpath= "(//input[@type='number'])[14]")
		WebElement Rate;
		
		@FindBy(xpath= "(//button[@type='submit'])[3]")
		WebElement Save_button3;
		
		//Jangad Expense Details
		
		@FindBy(xpath= "/html/body/div[1]/div/section/section/main/div[4]/div[1]/div/div[2]/button")
		WebElement row_button_Jangad;
		
		@FindBy(xpath= "(//input[@type='text'])[24]")
		WebElement JangadNo;
		
		@FindBy(xpath= "(//div[contains(@class,'css-1d8n9bt')])[11]")
		WebElement CourierPartyName;
		
		@FindBy(xpath= "(//div[@id='react-select-15-option-2'])[1]")
		WebElement CourierPartyName_select;
		
		@FindBy(xpath= "(//input[@type='text'])[26]")
		WebElement CourierNo;
		
		@FindBy(xpath= "(//input[@type='file'])[9]")
		WebElement CourierDocument;
		
		@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[11]")
		WebElement Expense1;
		
		@FindBy(xpath= "(//div[@id='react-select-16-option-1'])[1]")
		WebElement Expense1_select;
		
		@FindBy(xpath= "(//input[@type='number'])[15]")
		WebElement Expense1_value;
		
		@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
		WebElement appliedfield;
		
		
		@FindBy(xpath= "(//div[@class='ant-select-item-option-content'])[1]")
		WebElement appliedfield_select;
		
		
		
		//navigation to Hide_button
		@FindBy(xpath= "(//span[@aria-label='left'])[1]")
		WebElement navigation_hidebutton;
		
		
		
		@FindBy(xpath= "(//div[@class='ant-table ant-table-bordered ant-table-ping-left ant-table-fixed-column ant-table-scroll-horizontal ant-table-has-fix-right'])[1]")
		WebElement horizontal_scroll;
		
		
		
		public JobWorkRoughListPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void Navigate_jobworkrough_menu() 
		{
			try {
				TestUtil.navigate_to_option1(inwardlist_menu,jobworkroughlist_menu);
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
			 
			 try {
				TestUtil.navigate_to_option1(SenderName,SenderName_select);
				TestUtil.navigate_to_option1(ReceivedFrom,ReceivedFrom_select);
				TestUtil.navigate_to_option1(TransactionType,TransactionType_select);
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			
			 
			TotalPieces.sendKeys(prop.getProperty("TotalPieces"));
				
			TotalCarats.sendKeys(prop.getProperty("TotalCarats"));
				
			InwardPieces.sendKeys(prop.getProperty("InwardPieces"));
				
			InwardCarats.sendKeys(prop.getProperty("InwardCarats"));
				
				
			TotalPackets.sendKeys(prop.getProperty("TotalPackets"));
			TestUtil.upload_file(DocumentFile,prop.getProperty("DocumentFile_path"));
			try {
				TestUtil.navigate_to_option1(ExchangeType,ExchangeType_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			ExchangeRate_BOE.sendKeys(prop.getProperty("ExchangeRate_BOE"));
			ExchangeRate_RBI.sendKeys(prop.getProperty("ExchangeRate_RBI"));
			TestUtil.upload_file(RoughImages,prop.getProperty("RoughImages_path"));
			
			
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
			
			TestUtil.upload_file(Certificate,prop.getProperty("Certificate_path"));
			
		}
		
		
		public void fill_data_BillEntryDetails()
		{
			BOE_Date.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			BOE_Date.sendKeys(Keys.RETURN);
			
			 BOE_No.sendKeys(prop.getProperty("Common_No"));
			
			 MAWB_No.sendKeys(prop.getProperty("Common_No"));
			
			 HAWB_No.sendKeys(prop.getProperty("Common_No"));
			
			 Source_InwardDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			 Source_InwardDate.sendKeys(Keys.RETURN);
			 
			 TestUtil.upload_file(BillofEntry_upload,prop.getProperty("BillofEntry_path"));
			 
			 TestUtil.upload_file(Airwaybill_upload,prop.getProperty("Airwaybill_path"));
			
			 Save_button2.click();
			
		}
		
		
		public void fill_data_CorrespondingInvoice()
		{
			Invoice_No.sendKeys(prop.getProperty("Common_No"));
			
			Invoice_Weight.sendKeys(prop.getProperty("Invoice_Weight"));
			
			TestUtil.upload_file(Invoice,prop.getProperty("Invoice_path"));
			
			TestUtil.upload_file(Packing_List,prop.getProperty("Packing_List_path"));
			
			
			KP_Certificate_No.sendKeys(prop.getProperty("Common_No"));
			
			try {
				TestUtil.navigate_to_option1(Origin_invoicesection,Origin_invoicesection_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
			IssueDate_invoicesection.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			IssueDate_invoicesection.sendKeys(Keys.RETURN);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			ExpiryDate_invoicesection.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
			ExpiryDate_invoicesection.sendKeys(Keys.RETURN);
			
			 TestUtil.upload_file(Certificate__invoicesection,prop.getProperty("Certificate__invoicesection_path"));
			
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public void fill_data_MiningInformation()
		{
			
			try {
				TestUtil.navigate_to_option1(MiningName,MiningName_select);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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
			
			
			 TestUtil.upload_file(CourierDocument,prop.getProperty("CourierDocument_path"));
			 
			 Actions action = new Actions(driver);
				action.moveToElement(Expense1).click().perform();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				action.moveToElement(Expense1_select).click().perform();
				try {
					Thread.sleep(2000);
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
				Actions action1 = new Actions(driver);
				action1.moveToElement(appliedfield).click().perform();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				action1.moveToElement( appliedfield_select).click().perform();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				

				    
				    


				
			
		}
	
}
