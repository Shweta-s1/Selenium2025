package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assig138_MaxMinWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
	
	}

}
