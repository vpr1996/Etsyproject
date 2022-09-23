package org.testNG;

import java.util.Date;

import org.framework.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojoclass.PojoProjectFooterpage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyProject5 extends BaseClass {
	
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
	
	
	@Test()
	private void tc1() {
		implicitwaits();
		PojoProjectFooterpage p = new PojoProjectFooterpage();
		javascriptscrolldown(p.getIndiascrool());
		clicks(p.getSitemap());
		clicks(p.getSitemapmovies());
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Movi"));	

	}
	
	@Parameters("helpseach")
	@Test
	private void tc2(String s) throws Throwable {
		implicitwaits();
		PojoProjectFooterpage p = new PojoProjectFooterpage();
		javascriptscrolldown(p.getIndiascrool());
		clicks(p.getHelpcentre());
		sendkey(p.getSearchbox(), s);
		Enter();
	
	}

	
	
	
	

}
