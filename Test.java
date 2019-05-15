package com.tpb.bot;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")

public class Test {
	/*
	public WebElement locatorSelium(ChromeDriver driver,String typeLocation, String value)
	{
		WebElement uname;
		if(typeLocation.equals("id"))
		{
			 uname = driver.findElement(By.id("Username"));
		}
		
		return uname;
		
		
	}
	*/
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.firefox.marionette","D:\\Working\\BOT\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//		System.setProperty("webdriver.gecko.driver", "D:\\Working\\BOT\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//		System.setProperty("webdriver.gecko.driver","D:\\Working\\BOT\\chromedriver_win32\\chromedriver.exe");
		
		String url = "https://app.accelus.com/";
		String user = "Nganhangtienphong2";
		String password = "Tpbank57@";
		WebDriver driver = null;
		
		try {
			
//			ProfilesIni listProfiles = new ProfilesIni();
//			FirefoxProfile myProfile = listProfiles.getProfile("SonLT1");
//			FirefoxOptions options = new FirefoxOptions();
//			options.setProfile(myProfile);
//			driver = new FirefoxDriver(options);
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
			
//			driver = new RemoteWebDriver(new URL("http://localhost:1111"), DesiredCapabilities.chrome());
//			driver.get("http://www.google.com");
			
//			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			System.setProperty("webdriver.chrome.driver", "D:\\LoiPD\\Projects\\BOT\\BotAML\\chromedriver.exe");

			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  
//			  driver.get("http://www.google.com/xhtml");
//			  Thread.sleep(5000);  // Let the user actually see something!
//			  WebElement searchBox = driver.findElement(By.name("q"));
//			  searchBox.sendKeys("ChromeDriver");
//			  searchBox.submit();
//			  Thread.sleep(5000);  // Let the user actually see something!
//			  driver.quit();
			
			driver.get(url);	
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			//Login
			//Username
			//Password
			//SignIn
			//WebElement uname = driver.findElement(By.xpath("//*[@id=\"Username\"]"));
			WebElement uname = driver.findElement(By.id("Username"));
			uname.sendKeys(user);
			new WebDriverWait(driver, 30);
			WebElement pass = driver.findElement(By.id("Password"));
			pass.sendKeys(password);
			new WebDriverWait(driver, 30);
			driver.findElement(By.id("SignIn")).click();
			
			
			//Select Individual
			WebDriverWait wait2 = new WebDriverWait(driver, 30);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("accelus_components_application_IframeView_0")));
			
			//driver.switchTo().frame(driver.findElement(By.cssSelector("#accelus_components_application_IframeView_0 > iframe")));
			
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"accelus_components_application_IframeView_0\"]/iframe")));
			
			WebDriverWait wait3 = new WebDriverWait(driver, 30);
			wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniqName_2_0")));
			
			//WebElement individual = driver.findElement(By.cssSelector("#uniqName_2_0 > div > span"));
			WebElement individual = driver.findElement(By.xpath("//li[@id='uniqName_2_0']/div/span"));
			individual.click();
			
			new WebDriverWait(driver, 30);
			//WebElement name = driver.findElement(By.id("indium_view_form_ValidationTextBox_0"));
			//WebElement name = driver.findElement(By.xpath("//div[@id='widget_indium_view_form_ValidationTextBox_0']/div[2]/input"));
			WebElement name = driver.findElement(By.xpath("//input[starts-with(@id, 'indium_view_form_ValidationTextBox')]"));
			/*
			if (driver.findElement(By.xpath("//input[starts-with(@id, 'indium_view_form_ValidationTextBox')]"))!=null) {
				WebElement name = driver.findElement(By.xpath("//input[starts-with(@id, 'indium_view_form_ValidationTextBox')]"));
				name.sendKeys("BILL GATES");
				//screen click 	
				name.sendKeys(Keys.ENTER);
			}
			else
			{
				System.out.println(" khong tim thay");
			}
*/
			name.sendKeys("BILL GATES");
			//screen click 
			
			name.sendKeys(Keys.ENTER);
			
			WebDriverWait wait4 = new WebDriverWait(driver, 30);
			wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"uniqName_0_6\"]/a/span")));
			WebElement exportShowButton = driver.findElement(By.xpath("//*[@id=\"uniqName_0_6\"]/a/span"));
			exportShowButton.click();

		
			/*
			WebDriverWait wait4 = new WebDriverWait(driver, 30);
			wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dijit_form_Button_4\"]")));
			WebElement screen = driver.findElement(By.id("dijit_form_Button_4"));
			//wait4.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Screen")));
			//WebElement screen = driver.findElement(By.linkText("Screen"));
			screen.click();
			*/
			//--------------------------------------------------------------------
			WebDriverWait wait5 = new WebDriverWait(driver, 30);
			wait5.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniqName_0_6")));
			WebElement export = driver.findElement(By.cssSelector("#uniqName_0_6 > a"));
			export.click();

			new WebDriverWait(driver, 3000);
			//WebElement pdf = driver.findElement(By.id("dijit_form_RadioButton_5"));
			WebElement pdfCaseReport =  driver.findElement(By.xpath("//*[@id=\"indium_control_SimpleForm_0\"]/div[1]/ul[2]/li[1]/div/input"));
			pdfCaseReport.click();
			new WebDriverWait(driver, 3000);
			
			new WebDriverWait(driver, 30);
			//WebElement export2 = driver.findElement(By.id("dijit_form_Button_7_label"));
			WebElement export2 = driver.findElement(By.xpath("//span[text()=\"Export\"]"));
			export2.click();
//			Thread.sleep(10000);
//			driver.quit();
//			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
