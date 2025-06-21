package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class searchProduct_amazon {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");

		System.out.println(driver.getTitle());
		
		WebElement product = driver.findElement(By.id("twotabsearchtextbox"));
		product.sendKeys("iPad");
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		
		Thread.sleep(3000);
         driver.close();
	}

}
