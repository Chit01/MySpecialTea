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
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
	}

	@Test
	public void performSearch() throws InterruptedException
	{
		WebElement dwn = driver.findElement(By.xpath("//span[text()='Downloads']"));
		Thread.sleep(1000);
		dwn.click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='e9Wekf oD6fhb']/div[1]/div/div")).click();
		//Thread.sleep(2000);
	}

	@AfterSuite
	public void tearDown()
	{	
		driver.quit();
	}

}