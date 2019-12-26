package page.tests;

import org.testng.annotations.Test;

import page.objects.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestHome {
	WebDriver driver;

	@BeforeClass
	public void enter() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void otvoriStranicu() {
		HomePage.OpenPage(driver);
		Assert.assertEquals(driver.getCurrentUrl(), HomePage.MAINPAGE);
	}

}
