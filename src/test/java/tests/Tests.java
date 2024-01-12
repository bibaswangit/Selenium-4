package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tests {

	@Test
	public void firstTest() {
		System.out.println("Hello firstTest");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test
	public void secondTest() {
		System.out.println("Hello secondTest");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
