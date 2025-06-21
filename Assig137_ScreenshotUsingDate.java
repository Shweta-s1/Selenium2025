package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assig137_ScreenshotUsingDate 
{

	public static void main(String[] args) throws IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		
		System.out.println(driver.getTitle());
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("sharma.shwet91@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Sssep@1990");
		
		Date d1 =new Date();
		System.out.println(d1.getTime());

		Date d2 =new Date(d1.getTime());
		System.out.println(d2);
		String f1 = d2.toString();
		String year = f1.substring(f1.length()-4);
		System.out.println(year);
		String month = f1.substring(4,7);
		String date = f1.substring(8,10);
		
		String f2 = date.concat(month.concat(year));
		System.out.println(f2);
		
		String f3 = date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(f3);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\GrotechMinds\\eclipse\\Screenshots\\shweta"+new Assign136_ScreenshotCN().getClass()+f3+".png");
		FileHandler.copy(source, destination);
	}
}