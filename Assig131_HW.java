package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig131_HW {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		Dimension d1 = e1.getSize();
		int ht = d1.getHeight();
		int wt = d1.getWidth();
		System.out.println(ht);
		System.out.println(wt);

	}

}
