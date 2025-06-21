package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assign136_ScreenshotCN {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		
		System.out.println(driver.getTitle());
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("sharma.shwet91@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Sssep@1990");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\GrotechMinds\\eclipse\\Screenshots\\shweta"+new Assign136_ScreenshotCN().getClass()+".png");
		FileHandler.copy(source, destination);
	}

}
