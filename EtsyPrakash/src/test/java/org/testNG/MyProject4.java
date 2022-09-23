package org.testNG;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.framework.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pojoclass.PojoAddToFavourites;
import org.pojoclass.PojoOrderSearch;
import org.pojoclass.PojoProjectHomepage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyProject4 extends BaseClass {

	@BeforeClass
	private void launch() {
		launchChrome();
		maximum();
	}

	@AfterClass
	private void qts() {
		driver.manage().deleteAllCookies();
		quite();

	}

	@BeforeMethod
	private void url() {
		gett("https://www.etsy.com/");

	}
  
	@Test(enabled=true)
	private void favorites() throws Throwable {
		implicitwaits();
		PojoProjectHomepage a = new PojoProjectHomepage();
		sendkey(a.getSearchbox(),getdataxlsheet(8,0));
		clicks(a.getSearchbtn());
		PojoOrderSearch q = new PojoOrderSearch();
		clicks(q.getProduct());
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		java.util.List<String> li= new ArrayList<>();
		li.addAll(all);
		String child = li.get(1);
		windowshandlingId(child);
		PojoAddToFavourites x = new PojoAddToFavourites();
		Thread.sleep(3000);
		clicks(x.getHeart());
		String text = q.getAddtobasket().getText();
	    SoftAssert sas = new SoftAssert();
	    sas.assertTrue(text.contains("basket"));
		windowshandlingId(parent);
		clicks(a.getHomepage());
		String tes="Nothing here... yet.";
		clicks(a.getFavourties());
		sas.assertAll();
		
	}
	
	
	
	
	
	
	
}
