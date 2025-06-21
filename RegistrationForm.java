package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SHWETANGIT/Downloads/learningHTML1.html");
		

		WebElement un = driver.findElement(By.xpath("//body//input[1]"));
		un.sendKeys("SS1"); 

		WebElement hint = driver.findElement(By.xpath("//body//input[2]"));
		hint.sendKeys("name");
		
		WebElement pw = driver.findElement(By.xpath("//body//input[3]"));
		pw.sendKeys("Qwerty");
		
		WebElement fn = driver.findElement(By.xpath("//form//input[1]"));
		fn.sendKeys("Shweta");
		
		WebElement cb = driver.findElement(By.id("321"));
		cb.click();
		
		
	}

}
