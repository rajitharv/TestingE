package TestExi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestExigo {
	
	
WebDriver driver = null;
	
	@BeforeMethod
	public void initiatebrowser () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajithaAmol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
}
	
	@Test(priority=1)
	public void gettitle() {
				
		String Actualtitle = driver.getTitle();
		String Expectedtitle = "W3Schools Online Web Tutorials";
		Assert.assertEquals(Actualtitle, Expectedtitle);
		System.out.println(Actualtitle);
		
		}
	
	@AfterMethod
	public void close() {
		driver.close();
	}


}
