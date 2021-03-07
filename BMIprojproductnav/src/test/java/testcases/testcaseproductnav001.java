package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.pageObjectsprodnav;


public class testcaseproductnav001 extends BasePrdouctnavi {

	@Test
	public void BMITest() throws InterruptedException
	{

		driver.get(baseURL);
		pageObjectsprodnav Pd=new pageObjectsprodnav(driver);
		 Pd.clickProduct();
		 Pd.txtLst();
		Thread.sleep(3000);
	
	}
}
