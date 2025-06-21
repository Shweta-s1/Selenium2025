package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_link {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		gmail.click();
		
		Thread.sleep(1000);
		driver.close();
		}

}
