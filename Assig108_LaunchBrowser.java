package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assig108_LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

}
