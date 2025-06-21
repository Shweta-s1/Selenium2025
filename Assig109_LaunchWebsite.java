package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assig109_LaunchWebsite {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.close();
	}

}
