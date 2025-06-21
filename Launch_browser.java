package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser
{
	public static void main(String[]args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("GroTechMinds");
		Thread.sleep(3000);
		driver.close();
    }
	
	
	
}

