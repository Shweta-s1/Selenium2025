package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig139_alert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/alert/");
		driver.manage().window().maximize();
		
		WebElement recieved1 = driver.findElement(By.xpath("//button[.='Received1']"));
				recieved1.click();
		
		
        driver.switchTo().alert().accept();			
		
		
		
	}

}
