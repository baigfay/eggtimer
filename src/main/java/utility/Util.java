package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objectRepo.*;

public class Util extends BaseClass {
	
	

	public Util(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	
	public static WebDriverWait waits() {
		WebDriverWait waits = new WebDriverWait(driver, 3);
		waits.until(ExpectedConditions.alertIsPresent());
		return waits;	
	}
	
	
	
}