package org.framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// 1 launch chrome

	public static void launchChrome() {

		WebDriverManager.firefoxdriver().setup();
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
	}

	// 2 maximize

	public static void maximum() {

		driver.manage().window().maximize();
	}

	// 3

	public static void gett(String url) {
		driver.get(url);
	}

	// 4

	public static void gettextt() {
		System.out.println(driver.getTitle());
	}

	// 5
	public static void getcurrenturll() {

		System.out.println(driver.getCurrentUrl());
	}

	// 6
	public static void sendkey(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	// 7

	public static void clicks(WebElement ele) {

		ele.click();

	}

	// 8
	public static void gettextt(WebElement ele) {

		String text = ele.getText();
		System.out.println(text);
	}

	// 9

	public static void getAttributevalue(WebElement ele) {

		String attribute = ele.getAttribute("value");
		System.err.println(attribute);

	}

	// 10
	public static void movetoelements(WebElement ref) {

		Actions a = new Actions(driver);

		a.moveToElement(ref).perform();

	}

	// 11

	public static void draganddrops(WebElement ref1, WebElement ref2) {

		Actions a = new Actions(driver);

		a.dragAndDrop(ref1, ref2).perform();
	}

	// 12

	public static void doubleclicks(WebElement ref) {
		Actions a = new Actions(driver);

		a.doubleClick(ref).perform();

	}
	// 13

	public static void contextclicks(WebElement ref) {
		Actions a = new Actions(driver);

		a.contextClick(ref).perform();

	}

	// 14
	public static void sendkeyy(WebElement ref, String value) {
		Actions a = new Actions(driver);

		a.sendKeys(ref, value).perform();
	}

	// 15
	public static void actionclick(WebElement ref) {

		Actions a = new Actions(driver);
		a.click(ref).perform();
	}

	// 16
	public static void Enter() throws Throwable {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// 17
	public static void Tab() throws Throwable {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	// 18
	public static void down() throws Throwable {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// 19
	public static void UP() throws Throwable {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	// 20
	public static void copy() throws Throwable {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	// 20
	public static void paste() throws Throwable {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	// 21
	public static void acceptt() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	// 22
	public static void dismisss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();

	}

	// 23
	public static void gettextalert() {

		Alert a = driver.switchTo().alert();
		a.getText();

	}

	// 24
	public static void sendkeysalert(String ref) {

		Alert a = driver.switchTo().alert();
		a.sendKeys(ref);
	}

	// 25
	public static void screenshots(String name) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File f = new File(System.getProperty("user.dir")+"\\Screenshot\\"+name+".jpg");
		FileUtils.copyFile(src, f);
	}
	// 26

	public static void javascriptscrolltop(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", ref);

	}
	// 27

	public static void javascriptscrolldown(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false)", ref);

	}
	// 28

	public static void javascriptclick(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", ref);

	}
	// 29

	public static void javascriptsendkeys(WebElement ref, String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value','"+text+"')", ref);

	}
	// 30

	public static void frameswitchid(String id) {

		driver.switchTo().frame(id);

	}
	// 31

	public static void frameswitchname(String name) {

		driver.switchTo().frame(name);

	}
	// 32

	public static void frameswitch(WebElement ref) {

		driver.switchTo().frame(ref);

	}

	// 33

	public static void frameswitchindex(int index) {
		driver.switchTo().frame(index);

	}

	//34
	public static void windowshandlingUrl(String url) {
		driver.switchTo().window(url);
	}
	
	//35
		public static void windowshandlingTitle(String Title) {
			driver.switchTo().window(Title);
		}
		
	//36
    	public static void windowshandlingId(String windowId) {
			driver.switchTo().window(windowId);
		}
    //37
    	public static void windowhandlingcodeid() {
    		String windowHandle = driver.getWindowHandle();
    		System.out.println(windowHandle);
    		
    	}
    
    //38
    	
    	public static void windowhandlingallId() {
    	
    		Set<String> windowHandles = driver.getWindowHandles();
    	    
    		for (String x : windowHandles) {
				System.out.println(x);
			}
  
    	}
    		
    //40
    	public static void dropdownselectbyvalue(WebElement ref,String value) {
    		
    		Select s = new Select(ref);
    		
    		s.selectByValue(value);
  	
    	}
    //41
    	public static void dropdownselectbyvisibletext(WebElement ref,String value) {
    		
    		Select s = new Select(ref);
    		
    		s.selectByValue(value);
  	
    	}		
    //42
    	public static void dropdownselectbyindex(WebElement ref,int index) {
    		
    		Select s = new Select(ref);
    		
    		s.selectByIndex(index);
  	
    	}		
    //43
    	public static void dropdownismultiple(WebElement ref) {
    		
    		Select s = new Select(ref);
    		
    		boolean multiple = s.isMultiple();
    		System.out.println(multiple);
  	
    	} 
    //44
         public static void dropdowngetoptions(WebElement ref) {
    		
    		Select s = new Select(ref);
    		
    		List<WebElement> options = s.getOptions();
    		for (int i = 0; i <options.size(); i++) {
    			
    			WebElement c = options.get(i);
				String text = c.getText();
				System.out.println(text);
			}
    	
         }
    //45
    	
         public static void dropdowngetallselectedoptions(WebElement ref) {
    	
        	 Select s = new Select(ref);
        	 
        	 List<WebElement> all = s.getAllSelectedOptions();
        	 
        	 for (int i = 0; i <all.size(); i++) {
				WebElement web = all.get(i);
				String text = web.getText();
				System.out.println(text);
        		 
			}}
    //46	
        
        public static void dropdowngetfirstselectedoptions(WebElement ref) {
        	    	
           	 Select s = new Select(ref);
           	 WebElement first = s.getFirstSelectedOption();
            String text = first.getText();
            System.out.println(text);
           	 
         }
     //47
        
        public static void dropdowndeselectbyindex(WebElement ref,int index) {
	    	
          	 Select s = new Select(ref);
          	 
          	 
          	 s.deselectByIndex(index);
        }
    	
      //48  
    	
        public static void dropdowndeselectbyvalue(WebElement ref,String value) {
	    	
          	 Select s = new Select(ref);
          	 s.deselectByValue(value);
        }
    
      //49	
        
        public static void dropdowndeselectbyvisibletext(WebElement ref,String value) {
	    	
         	 Select s = new Select(ref);
         	 s.deselectByVisibleText(value);
         	 
       }
    	
      //50	
        public static void dropdownDeselectAll(WebElement ref) {
	    	
         	 Select s = new Select(ref);
         	 s.deselectAll();
       }
    	
       
      //51
        public static void staticwait(long value) throws InterruptedException {
        	Thread.sleep(value);
        	
        }
    	
       //52
    	
        public static void implicitwaits() {
        	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        }
        
       //53
        
        public static void ExplicitwaitsAlertAccept() {
        	
        	
        	WebDriverWait w = new WebDriverWait(driver,10);
        	w.until(ExpectedConditions.alertIsPresent());
        	Alert a = driver.switchTo().alert();
        	a.accept();
       
        	
        }
        
        //54
        public static void  javascriptgetAttribute(WebElement ref) {
        	
        	JavascriptExecutor js = (JavascriptExecutor)driver;
        	Object o = js.executeScript("returnarguments[0].getAttribute('value')",ref);
        	//String s =(String)o;
        	
        	String string = String.valueOf(o);
        	System.out.println(string);	
        }
       
        
        //55
        public static void javascrpithighlight(WebElement ref) {
        	
        	JavascriptExecutor js = (JavascriptExecutor)driver;
        	
        	js.executeScript("arguments[0].setAttribute('style',font-size:30px;text-align:left;background:red;border:10px solid green')",ref);
  	
        }
        
        //56
        public static void closee() {
        	driver.close();	
        }
        
        //57
        public static void quite() {
        	
        	driver.quit();
        }
        
        
        //58
        
        public static String getdataxlsheet(int rownumber,int cellnumber) throws IOException {
        	
        	File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\test data\\newxl.xlsx");
        	FileInputStream fin = new FileInputStream(f);
        	Workbook w = new  XSSFWorkbook(fin);
        	Sheet sheet = w.getSheetAt(0);
        	
        	Row row = sheet.getRow(rownumber);
        	Cell cell = row.getCell(cellnumber);
        	
        	int cellType = cell.getCellType(); 
        	String value="";
        	if (cellType==1) {
				value=cell.getStringCellValue();
				
        		
			}
        	else if (DateUtil.isCellDateFormatted(cell)) {
				Date dat = cell.getDateCellValue(); 
				SimpleDateFormat sim = new SimpleDateFormat("dd mmm yyyy");
				value = sim.format(dat);
			}
        	
        	else {
				double num = cell.getNumericCellValue();
				long l =(long)num;
				value= String.valueOf(l);
			}
        	return value;
        }
        
        
        //59
        
        public static void ExplicitwaitsAlertDismiss() {
        	
        	
        	WebDriverWait w = new WebDriverWait(driver,10);
        	w.until(ExpectedConditions.alertIsPresent());
        	Alert a = driver.switchTo().alert();
        	a.dismiss();
       
        	
        }
        //60
        public static void ExplicitwaitsAlertgettext() {
        	
        	
        	WebDriverWait w = new WebDriverWait(driver,10);
        	w.until(ExpectedConditions.alertIsPresent());
        	Alert a = driver.switchTo().alert();
        	String text = a.getText();
        	System.out.println(text);
        	a.accept();
       
        	
        }
        
        //61
        public static void ExplicitwaitsAlertsendkeys(String value) {
        	
        	
        	WebDriverWait w = new WebDriverWait(driver,10);
        	w.until(ExpectedConditions.alertIsPresent());
        	Alert a = driver.switchTo().alert();
        	a.sendKeys(value);
        	a.accept();
        	
        }
        
        //62
        public static void ExplicitwaitsVisibilityOfallElementss(WebElement ref) {
        	
        	
        	WebDriverWait w = new WebDriverWait(driver,10);
        	w.until(ExpectedConditions.visibilityOf(ref));
    
        }
        //63
        public static void createnewxlsheet(String name,int rownum,int cellno,String write) throws IOException {
        	
        	File f = new File("C:\\\\Users\\\\prakash\\\\eclipse-workspace\\\\LearnAutomationFrameWork\\\\src\\\\test\\\\resources\\\\Test Data\\\\"+name+".xlsx");     
        	boolean a = f.createNewFile();
        	System.out.println(a);
        	Workbook w = new XSSFWorkbook();
        	Sheet sheet = w.createSheet();
        	Row row = sheet.createRow(rownum);
        	Cell cell = row.createCell(cellno);
        	cell.setCellValue(write);
        	FileOutputStream fis = new FileOutputStream(f);
        	w.write(fis);
        }
        //64
        
        public static void editxlsheet(String content,String setcontent) throws IOException {
        	
        	File f = new File("C:\\\\Users\\\\prakash\\\\eclipse-workspace\\\\LearnAutomationFrameWork\\\\src\\\\test\\\\resources\\\\Test Data\\\\usertextmaven.xlsx");
        	FileInputStream fin = new FileInputStream(f);
        	Workbook w = new XSSFWorkbook(fin);
        	Sheet sheet = w.getSheetAt(0);
        	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
				
        		Row row = sheet.getRow(i);
        		for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(j);
					int cellType = cell.getCellType();
					if (cellType==1) {
						String value = cell.getStringCellValue();
						if (value.equals(content)) {
							cell.setCellValue(setcontent);
							FileOutputStream fil = new FileOutputStream(f);
							w.write(fil);
							System.out.println();
			}
		}		
        		}}
			}
        	
        	
        	
        	
        	//65
        	 public static void ActionsEnter() {
        	Actions a = new Actions(driver);
        	a.keyDown(Keys.ENTER).perform();
        	a.keyUp(Keys.ENTER).perform();
        		 	
        }  	
        	
        //66 
        	 public static void ActionsTab() {
        	Actions a = new Actions(driver);
           	a.keyDown(Keys.TAB).perform();
           	a.keyUp(Keys.TAB).perform();
             		 	 
        	 }
        	 
        	 //67
        	 public static void ActionsDown() {
        		 Actions a = new Actions(driver);
             	a.keyDown(Keys.DOWN).perform();
             	a.keyUp(Keys.DOWN).perform(); 
        	 }
        	 
        	 //68
        	 public static void ActionsUP() {
        		 
        		 Actions a = new Actions(driver);
             	a.keyDown(Keys.UP).perform();
             	a.keyUp(Keys.UP).perform();
             		 	
        	 }
        	 
        	 //69
        	 public static void Fluentwaitelementclickable(WebElement element) {
        		 
   FluentWait<WebDriver>f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
        		 
        		f.until(ExpectedConditions.elementToBeClickable(element));
        	
        	 }
        	 
        	 
        	 
        	 //70
        	 public static void Fluentwaitalertispresent() {
   FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
        		 f.until(ExpectedConditions.alertIsPresent());
        		
        	 }
        	 
        	
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        }      	


