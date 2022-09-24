package org.testNG;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.framework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pojoclass.PojoOrderSearch;
import org.pojoclass.PojoProjectHomepage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductAddToBasket extends BaseClass {
	
	
	@BeforeClass
	private void launch() {
		launchChrome();
		maximum();
	}

	@AfterClass
	private void qts() {
		driver.manage().deleteAllCookies();
		//quite();

	}
	@BeforeMethod
   private void url() {
	gett("https://www.etsy.com/");

	
}
	
	@Parameters("product")
	@Test(enabled=true)
	private void order(String s) throws Throwable {
		implicitwaits();
		PojoProjectHomepage a = new PojoProjectHomepage();
		sendkey(a.getSearchbox(),s);
		clicks(a.getSearchbtn());
		PojoOrderSearch q = new PojoOrderSearch();
		javascriptclick(q.getProduct());
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		List<String> li= new ArrayList<>();
		li.addAll(all);
		String child = li.get(1);
		windowshandlingId(child);
		javascriptscrolltop(q.getAddtobasket());
		clicks(q.getAddtobasket());
		windowshandlingId(parent);
		clicks(a.getBasket());
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



