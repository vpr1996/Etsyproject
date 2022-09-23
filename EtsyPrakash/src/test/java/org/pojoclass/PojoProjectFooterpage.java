package org.pojoclass;


import org.framework.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoProjectFooterpage extends BaseClass {

	
	public PojoProjectFooterpage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//span[@class='wt-display-inline-block wt-vertical-align-middle']")
	private WebElement indiascrool;
	

	@FindBy(xpath="//span[text()='Help Centre']")
	private WebElement helpcentre;
	
	@FindBy(xpath="//span[text()='Sitemap']")
	private WebElement sitemap;
	
	@FindBy(xpath="(//input[@class='wt-input-btn-group__input search-input'])[2]")
	private WebElement searchbox;
	
	@FindBy(xpath="(//button[text()='Sign in'])[2]")
	private WebElement assertchecksignin;
	
	@FindBy(xpath="//a[text()='Movies']")
	private WebElement sitemapmovies;

	public WebElement getIndiascrool() {
		return indiascrool;
	}

	public WebElement getHelpcentre() {
		return helpcentre;
	}

	public WebElement getSitemap() {
		return sitemap;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getAssertchecksignin() {
		return assertchecksignin;
	}

	public WebElement getSitemapmovies() {
		return sitemapmovies;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
