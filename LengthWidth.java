package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LengthWidth {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement e1 = driver.findElement(By.xpath("//button[@id='u_0_9_Ch']"));
		Dimension d1 = e1.getSize();
		int ht = d1.getHeight();
		int wt = d1.getWidth();
		System.out.println("ht");
		System.out.println("wt");
		
		

	}

}
