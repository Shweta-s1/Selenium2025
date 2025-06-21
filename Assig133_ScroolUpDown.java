package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

public class Assig133_ScroolUpDown {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.linkText("See more from Amazon Live"));
		Point p1 = e1.getLocation();
		int x = p1.getX();
		int y = p1.getY();

		System.out.println(x);
		System.out.println(y);
		
 JavascriptExecutor js =  (JavascriptExecutor)  driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-3100)");
		
	}

}
