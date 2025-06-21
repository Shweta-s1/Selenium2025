package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Assig127_CountOfLinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement>link= driver.findElements(By.tagName("a"));
		int count = link.size();
		System.out.println(count);
		

	}

}
