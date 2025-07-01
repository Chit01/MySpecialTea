import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest 
{
	WebDriver driver;
		
	@BeforeSuite
	public void launchGoogle()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@Test
	public void performSearch()
	{
		WebElement search = driver.findElement(By.xpath("//textarea[@title='Search']"));
		search.sendKeys("Selenium");
		search.sendKeys(Keys.ENTER);				
	}

	@AfterSuite
	public void tearDown()
	{	
		driver.quit();
	}

}