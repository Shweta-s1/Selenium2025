package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig129_PrintLinkText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for (int i =0; i<link.size();i++) 
		{
			WebElement link1 = link.get(i);
            String url = link1.getDomAttribute("href");
			String text = link1.getText();
			System.out.println(url);
			System.out.println(text);
		}
	}

}

