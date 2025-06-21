package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assig132_CoordinatesOfComponent {

	public static void main(String[] args) {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement e1 = driver.findElement(By.linkText("About Us"));
		Point p1 = e1.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println(x);
		System.out.println(y);
	}

}
