package com.qa.inwardlistpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
