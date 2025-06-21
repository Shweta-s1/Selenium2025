package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_PChild {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Laptop"+Keys.ENTER);
		
	    Set<String>ids = 	driver.getWindowHandles();
	    System.out.println(ids);
	     
	   Iterator<String>i1 =  ids.iterator();
	   String PWid = i1.next();
	   String CWid = i1.next();
	   System.out.println(PWid);
	   System.out.println(CWid);
		}

}
