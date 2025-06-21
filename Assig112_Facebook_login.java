package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig112_Facebook_login 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	
	System.out.println(driver.getTitle());
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("sharma.shwet91@gmail.com");
	
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("Sssep@1990");
	
	
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
	Thread.sleep(3000);

	
	}

}
