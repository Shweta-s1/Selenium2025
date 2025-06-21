package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assig134_FlipkartScreenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		
		System.out.println(driver.getTitle());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("D:\\GrotechMinds\\eclipse\\Screenshots\\shweta.png");
	    FileHandler.copy(source, destination);

	}

}
