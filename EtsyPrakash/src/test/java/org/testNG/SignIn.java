package org.testNG;

import java.io.IOException;

import org.apache.poi.ss.format.CellNumberFormatter;
import org.framework.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojoclass.PojoProjectHomepage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignIn extends BaseClass{
	
	
	@BeforeClass
	private void launch() {
		launchChrome();
		maximum();
		
	}
	
	@AfterClass
	private void cls() {
		driver.manage().deleteAllCookies();
		closee();	
	}
	

	@BeforeMethod
	private void gettss() {
		gett("https://www.etsy.com/");
	}

	@Test(priority=1,enabled=true,dataProvider="invalid")
	private void invldlogins(String a, String b) throws InterruptedException {
		
		implicitwaits();
		PojoProjectHomepage x = new PojoProjectHomepage();
		clicks(x.getSignin());
		sendkey(x.getSigninuser(),a);
		sendkey(x.getSigninpassword(),b);
		clicks(x.getLoginbtn());
		WebElement webElement = x.getAssrtinvalidlogin();
		String text = webElement.getText();
		Assert.assertTrue(text.contains("Email"));
		
	}
	
	@Test(priority=2,enabled=true,dataProvider="validinvalid")
	private void invldlogin(String a, String b) throws InterruptedException {
		
		implicitwaits();
		PojoProjectHomepage x = new PojoProjectHomepage();
		clicks(x.getSignin());
		sendkey(x.getSigninuser(),a);
		sendkey(x.getSigninpassword(),b);
		clicks(x.getLoginbtn());
		WebElement webElement = x.getInvalpassassert();
		String text = webElement.getText();
		Assert.assertTrue(text.contains("Password"));
				
	}
	
	@Test(priority=3,enabled=true,dataProvider="valid")
	private void invldloginn(String a, String b) throws InterruptedException {
		
		implicitwaits();
		PojoProjectHomepage x = new PojoProjectHomepage();
		clicks(x.getSignin());
		sendkey(x.getSigninuser(),a);
		sendkey(x.getSigninpassword(),b);
		clicks(x.getLoginbtn());
		WebElement webElement = x.getValidloginassert();
		String text = webElement.getText();
		Assert.assertTrue(text.contains("prakash"));
				
	}
	
	
	
	
	

	 @DataProvider(name="invalid")
		public Object[][] getlogin() throws IOException{
			
		   return new Object[][] {
			
			
			{getdataxlsheet(1,0),getdataxlsheet(1,1)},
			{getdataxlsheet(2,0),getdataxlsheet(2,1)},
	
		};
			
		}
	 
	 @DataProvider(name="validinvalid")
		public Object[][] getlog() throws IOException{
			
		   return new Object[][] {

			{getdataxlsheet(3,0),getdataxlsheet(3,1)},		
			
		};
		}
	 
	 @DataProvider(name="valid")
		public Object[][] getlogn() throws IOException{
			
		   return new Object[][] {

			{getdataxlsheet(4,0),getdataxlsheet(4,1)},		
			
		};
		}
	 
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
