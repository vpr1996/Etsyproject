package org.pojoclass;

import org.framework.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAddToFavourites extends BaseClass {
	
	public PojoAddToFavourites() {
		
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="(//div[@class='favorite-listing-button-icon-container should-animate '])[1]")
	private WebElement heart;
	
	@FindBy(xpath="//p[text()='Nothing here... yet.']")
	private WebElement assertcheck;


	public WebElement getHeart() {
		return heart;
	}


	public WebElement getAssertcheck() {
		return assertcheck;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
