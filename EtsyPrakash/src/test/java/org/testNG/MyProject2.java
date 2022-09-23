package org.testNG;

import java.io.IOException;
import java.util.Date;

import org.framework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclass.PojoProjectHomepage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

public class MyProject2 extends BaseClass {




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
	
	@Test(priority=1,enabled=true)
	private void tc1jewellery() throws InterruptedException {
		implicitwaits();
		PojoProjectHomepage a = new PojoProjectHomepage();
		movetoelements(a.getJewellandaccess());
		clicks(a.getSunhats());
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Sun"));
	
	
	
	}
	
	@Test(priority=2,enabled=true)
	private void tc2clothing() throws InterruptedException {
		implicitwaits();
		PojoProjectHomepage a = new PojoProjectHomepage();
		movetoelements(a.getClothandshoes());
		ExplicitwaitsVisibilityOfallElementss(a.getMens());
		movetoelements(a.getMens());
		ExplicitwaitsVisibilityOfallElementss(a.getShirts());
		clicks(a.getShirts());
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Men's Shirts"));

	}
	
	
	@Test(priority=3,enabled=true)
	private void tc3home() {
		implicitwaits();
		PojoProjectHomepage a = new PojoProjectHomepage();
		movetoelements(a.getHomeandliv());
		javascriptclick(a.getClocks());
		String title = driver.getTitle();
	
	}
	
	@Test(priority=4,enabled=true)
	private void tc4wedding() {
		implicitwaits();
		PojoProjectHomepage a = new PojoProjectHomepage();
		movetoelements(a.getWeddingandparty());
		clicks(a.getPartydecor());
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Decor"));
	}
	
	@Test(priority=5,enabled=true)
	private void tc5toysandent() {
		implicitwaits();
		PojoProjectHomepage a = new PojoProjectHomepage();
        movetoelements(a.getToys());
        clicks(a.getCraft());
        String title = driver.getTitle();
		Assert.assertTrue(title.contains("Tools"));	
	}
	
	
	@Test(priority=6,enabled=true)
	private void tc6art() {
	   implicitwaits();
	   PojoProjectHomepage a = new PojoProjectHomepage();
	   movetoelements(a.getArt());
	   clicks(a.getGlassart());
	   String title = driver.getTitle();
	   Assert.assertTrue(title.contains("Glass"));

	}
	
	@Test(priority=7,enabled=true)
	private void tc7gifts() {
		implicitwaits();
		   PojoProjectHomepage a = new PojoProjectHomepage();
		   clicks(a.getGifts());
		   String title = driver.getTitle();
		   Assert.assertTrue(title.contains("Gift"));
	}
	
	
	
	
	
	
	
	}
