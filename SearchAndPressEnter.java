package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndPressEnter {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//div//input[1]"));
		search.sendKeys("TV"+Keys.ENTER);
		driver.close();
	}

}
