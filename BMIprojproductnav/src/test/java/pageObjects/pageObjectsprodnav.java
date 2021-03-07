package pageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class pageObjectsprodnav {
	WebDriver ldriver;
	
		public pageObjectsprodnav(WebDriver rdriver)
		{
			 ldriver=rdriver;
			 PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(css="#navigation-tab-0 > span.MuiTab-wrapper")
		WebElement txtproduct;
		@FindBy(css="#gatsby-focus-wrapper > header > div.Header-module__Drawer--3CDW3.Header-module__NavDrawer--3oB3G > nav > div > ul > li:nth-child(2) > div > ul > li:nth-child(2) > h6")
		
		WebElement txtLst;
		
		
		public void clickProduct()
		{ if (txtproduct.isDisplayed()){
			txtproduct.click();}
		else {
			System.out.println("Product not displayed");
		}
		}
		public void txtLst()
		{
			txtLst.getText();
			Assert.assertEquals(txtLst.getText(), "Velg kategori");
		}
		
		
		}
