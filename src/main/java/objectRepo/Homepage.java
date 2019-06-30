package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends BaseClass {

	private static WebElement element = null;
	public Homepage(WebDriver driver) {
		super(driver);	
	}
	
	public static WebElement timer() {
		
	element = driver.findElement(By.xpath("//input[@name='start_a_timer']"));
	return element;
	}
	
	public static WebElement go() {
		
		element = driver.findElement(By.xpath("//input[@id='timergo']"));
		return element;
		}

}
