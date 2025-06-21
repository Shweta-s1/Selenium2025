package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class RegistrationFormGTM {
     public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement fn = driver.findElement(By.id("First Name"));
		fn.sendKeys("Shweta");
		WebElement ln = driver.findElement(By.id("Last Name"));
		ln.sendKeys("Sharma");
		WebElement ad = driver.findElement(By.id("Address"));
		ad.sendKeys("Noida");
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("abc@gmail.com");
		WebElement ph = driver.findElement(By.id("Phone"));
	    ph.sendKeys("1234567890");
	    WebElement hob = driver.findElement(By.xpath("//input[@name='Movies']")); 
	    hob.click();
	    WebElement lng = driver.findElement(By.name("Languages"));
	    lng.sendKeys("Hindi");
	    WebElement e1 = driver.findElement(By.xpath("//select[@id='Skills']"));
	    Select s1 = new Select(e1);
	    s1.selectByValue("Manual Testing");
	    WebElement e2 = driver.findElement(By.xpath("//select[@id='Country']"));
		Select s2 = new Select(e2);
		s2.selectByValue("USA"); 
		WebElement e3 = driver.findElement(By.xpath("//select[@id='DOB']"));
	    Select s3 = new Select(e3);
	    s3.selectByValue("1990"); 
	    WebElement e4 = driver.findElement(By.xpath("//select[@id='month']"));
	    Select s4 = new Select(e4);
	    s4.selectByValue("Sep"); 
	    WebElement e5 = driver.findElement(By.xpath("//select[@id='day']"));
	    Select s5 = new Select(e5);
	    s5.selectByValue("01"); 
	    WebElement pw = driver.findElement(By.xpath("//input[@name='password']"));
		pw.sendKeys("123@abc");
		WebElement cp = driver.findElement(By.xpath("//input[@name='confirm password']"));
		cp.sendKeys("123@abc");
		WebElement button = driver.findElement(By.name("submit"));
		button.click();
 }
}
