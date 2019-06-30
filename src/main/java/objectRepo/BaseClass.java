package objectRepo;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static boolean res;
	
	public BaseClass(WebDriver driver) {
	BaseClass.driver=driver;
	BaseClass.res=true;
		
	}

}
