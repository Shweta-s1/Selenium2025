package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("google-register"));
		e1.click();
		
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		Iterator<String>i1 = ids.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		
	    driver.switchTo().window(childid);
	    Thread.sleep(3000);
	    driver.close();
	
	}
	

}

