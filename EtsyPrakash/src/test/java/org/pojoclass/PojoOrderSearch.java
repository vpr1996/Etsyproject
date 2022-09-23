package org.pojoclass;

import org.framework.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoOrderSearch extends BaseClass{
	
	
	public PojoOrderSearch() {
	  PageFactory.initElements(driver,this);
	}
	
	
	
	
	@FindBy(xpath="(//div[@class='placeholder-content'])[3]")
	private WebElement product;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtobasket;
	
	
	@FindBy(xpath="(//h1[@class='wt-text-heading-01'])[1]")
	private WebElement assertcheck;

	@FindBy(xpath="(//div[@class='favorite-listing-button-icon-container should-animate '])[1]")
	private WebElement addfavourite;

	public WebElement getProduct() {
		return product;
	}

	public WebElement getAddtobasket() {
		return addtobasket;
	}

	public WebElement getAssertcheck() {
		return assertcheck;
	}

	public WebElement getAddfavourite() {
		return addfavourite;
	}
	
	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
