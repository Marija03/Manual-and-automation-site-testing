package page.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ExcelUtils;
import page.objects.HomePage;
import page.objects.Registration;
import page.objects.SignIn;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestRegistration {

	public static void wait2() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	// test registration and sign in for the people from the file
	@Test
	public void testReg50() {
		driver.get(Registration.REG);
		wait2();
		for (int i = 1; i < 51; i++) {
			Registration.Registration(driver, i);
			driver.navigate().to(HomePage.MAINPAGE);
			driver.findElement(By.xpath(SignIn.SIGNIN)).click();
			SignIn.insertData(driver, i);
			boolean account = driver.findElement(By.xpath(Registration.AccountOption)).isDisplayed();
			SoftAssert sa = new SoftAssert();
			sa.assertTrue(account);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]")).click();

			driver.navigate().to(Registration.REG);
		}

	}
}
