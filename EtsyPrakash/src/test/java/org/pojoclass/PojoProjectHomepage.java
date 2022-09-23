package org.pojoclass;

import javax.management.loading.PrivateClassLoader;

import org.framework.BaseClass;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoProjectHomepage extends BaseClass {
	
	public PojoProjectHomepage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement signinuser;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement signinpassword;
	
	@FindBy(name="submit_attempt")
	private WebElement loginbtn;
	
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement searchbox;
	
	@FindBy(xpath="//span[@id='logo']")
	private WebElement homepage;
	
	@FindBy(xpath="//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//button[contains(@class,'wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin')]")
    private WebElement signin;
	
	@FindBy(xpath="(//span[@class='etsy-icon'])[1]")
	private WebElement favourties;
	
	@FindBy(xpath="(//span[@class='wt-icon'])[2]")
	private WebElement basket;
	
	
	@FindBy(xpath="//span[@id='catnav-primary-link-10855']")
	private WebElement jewellandaccess;
	
	@FindBy(id="catnav-primary-link-10923")
	private WebElement clothandshoes;
	
	@FindBy(id="catnav-primary-link-891")
	private WebElement homeandliv;
	
	@FindBy(id="catnav-primary-link-10983")
	private WebElement weddingandparty;
	
	@FindBy(id="catnav-primary-link-11049")
	private WebElement toys;
	
	@FindBy(id="catnav-primary-link-66")
	private WebElement art;
	
	@FindBy(id="catnav-primary-link-562")
	private WebElement craft;
	
	@FindBy(xpath="//span[text()='Vintage']")
	private WebElement vintage;
	
	@FindBy (xpath="//span[text()='Gifts']")
	private WebElement gift;
	
	
	@FindBy(xpath="(//div[@class='wt-horizontal-center query-image-container'])[1]")
	private WebElement wallart;
	
	@FindBy(xpath="(//div[@class='wt-horizontal-center query-image-container'])[2]")
	private WebElement homeandliving;
	
	@FindBy(xpath="(//div[@class='wt-horizontal-center query-image-container'])[3]")
	private WebElement clothing;
	
	@FindBy(xpath="(//div[@class='wt-horizontal-center query-image-container'])[4]")
	private WebElement jewellery;
	
	@FindBy(xpath="(//div[@class='wt-horizontal-center query-image-container'])[5]")
	private WebElement wedding;
	
	@FindBy(xpath="(//div[@class='wt-horizontal-center query-image-container'])[6]")
	private WebElement onsale;
	
	@FindBy(id="side-nav-category-link-10856")
	private WebElement jewellaccesories;
	
	@FindBy(xpath="//a[@id='catnav-l4-11250']")
	private WebElement sunhats;
	
	@FindBy(id="side-nav-category-link-10936")
	private WebElement mens;
	
	@FindBy(id="catnav-l4-10938")
	private WebElement shirts;
	
	
	@FindBy(id="catnav-l4-10966")
	private WebElement clocks;
	
	@FindBy(id="catnav-l3-10985")
	private WebElement partydecor;
	
	@FindBy(id="catnav-l4-11067")
	private WebElement bookaccesories;
	
	@FindBy(id="catnav-l3-104")
	private WebElement glassart;
	
	@FindBy(id="catnav-l3-9319")
	private WebElement framing;
	
	@FindBy(xpath="(//a[@class='wt-display-table wt-width-full wt-text-link-no-underline'])[1]")
	private WebElement vintagee;
	
	@FindBy(xpath="(//a[@class='wt-display-table wt-width-full wt-text-link-no-underline'])[2]")
	private WebElement gifts;
	
	@FindBy(xpath="//div[text()='Email address is invalid.']")
	private WebElement assrtinvalidlogin;
	
	
	@FindBy(xpath="//div[text()='Password was incorrect']")
	private WebElement invalpassassert;
	
	
	@FindBy(xpath="(//a[text()='prakash'])[1]")
	private WebElement validloginassert;
	
	

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getHomepage() {
		return homepage;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getFavourties() {
		return favourties;
	}

	public WebElement getBasket() {
		return basket;
	}

	public WebElement getJewellandaccess() {
		return jewellandaccess;
	}

	public WebElement getClothandshoes() {
		return clothandshoes;
	}

	public WebElement getHomeandliv() {
		return homeandliv;
	}

	public WebElement getWeddingandparty() {
		return weddingandparty;
	}

	public WebElement getToys() {
		return toys;
	}

	public WebElement getArt() {
		return art;
	}

	public WebElement getCraft() {
		return craft;
	}

	public WebElement getVintage() {
		return vintage;
	}

	public WebElement getGift() {
		return gift;
	}

	public WebElement getWallart() {
		return wallart;
	}

	public WebElement getHomeandliving() {
		return homeandliving;
	}

	public WebElement getClothing() {
		return clothing;
	}

	public WebElement getJewellery() {
		return jewellery;
	}

	public WebElement getWedding() {
		return wedding;
	}

	public WebElement getOnsale() {
		return onsale;
	}

	public WebElement getJewellaccesories() {
		return jewellaccesories;
	}

	public WebElement getSunhats() {
		return sunhats;
	}

	public WebElement getMens() {
		return mens;
	}

	public WebElement getShirts() {
		return shirts;
	}

	public WebElement getSigninuser() {
		return signinuser;
	}

	public WebElement getSigninpassword() {
		return signinpassword;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getClocks() {
		return clocks;
	}

	public WebElement getPartydecor() {
		return partydecor;
	}

	public WebElement getBookaccesories() {
		return bookaccesories;
	}

	public WebElement getGlassart() {
		return glassart;
	}

	public WebElement getFraming() {
		return framing;
	}

	public WebElement getVintagee() {
		return vintagee;
	}

	public WebElement getGifts() {
		return gifts;
	}

	public WebElement getAssrtinvalidlogin() {
		return assrtinvalidlogin;
	}

	public WebElement getInvalpassassert() {
		return invalpassassert;
	}

	public WebElement getValidloginassert() {
		return validloginassert;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

		
	

}
