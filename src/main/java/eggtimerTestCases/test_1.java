package eggtimerTestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import objectRepo.*;
import utility.*;

public class test_1 {
	
	public class Test_1 {
		public WebDriver driver;
		public String Expected = null;
		public String Actual = null;
	
@BeforeTest
public void beforetest(){
	try	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fay_b\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver =  new ChromeDriver();
		new BaseClass(driver);
		}
	catch(Exception e) {
			e.printStackTrace();
			System.out.println("test Config failure");
		}   
		
	}

@BeforeMethod
	public void beforemethod() {
	try {
		driver.get("https://e.ggtimer.com");
		Expected = "E.gg Timer - a simple countdown timer";
		Actual = driver.getTitle();
		AssertJUnit.assertEquals(Actual, Expected);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("precondition failed");
	}
} 

@Test (priority= 2, alwaysRun = true)
public void test1_3sec() {
	Homepage.timer().clear();
	Homepage.timer().sendKeys("3"); //Could be parametrized via excel sheet
	Homepage.go().click();
	Util.waits();
	System.out.println(driver.switchTo().alert().getText());
	Expected = "Time Expired!";
	Actual= driver.switchTo().alert().getText();			
	AssertJUnit.assertEquals(Actual, Expected);	
}
@AfterMethod
public void aftermethod(){
	try {
		driver.switchTo().alert().accept();
		driver.navigate().back();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@AfterTest
public void aftertest() {
	driver.close();
	
}





}

}