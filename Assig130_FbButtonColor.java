package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig130_FbButtonColor {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement e1 = driver.findElement(By.linkText("Create new account"));
		
		String colour = e1.getCssValue("background-color");
		System.out.println(colour);
	}

}
