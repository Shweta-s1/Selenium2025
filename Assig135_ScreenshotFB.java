package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assig135_ScreenshotFB {

	public static void main(String[] args) throws IOException {
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("sharma.shwet91@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Sssep@1990");

		    TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File ("D:\\GrotechMinds\\eclipse\\Screenshots\\shweta"+Math.random()+".png");
		    FileHandler.copy(source, destination);
	}

}
