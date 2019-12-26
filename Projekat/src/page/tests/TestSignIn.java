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

public class TestSignIn {
	WebDriver driver;

	public static void wait2() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeClass
	public void before() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testsignPage() {
		driver.get(Registration.REG);
		SignIn.findSignIn(driver);
		SignIn.getSignIn(driver);
		SoftAssert sa = new SoftAssert();
		String cUrl = driver.getCurrentUrl();
		cUrl = cUrl.replaceAll(";jsessionid=[^?]*", "");
		String a = "https://petstore.octoperf.com/actions/Catalog.action";
		sa.assertEquals(a, cUrl);
	}

	@Test
	public void signInUser() {
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);
		driver.get(HomePage.MAINPAGE);
		SignIn.getSignIn(driver);
		wait2();
		SignIn.insertData(driver, 5);
		wait2();

		SoftAssert sa = new SoftAssert();
		String cUrl = driver.getCurrentUrl();
		cUrl = cUrl.replaceAll(";jsessionid=[^?]*", "");
		String a = "https://petstore.octoperf.com/actions/Catalog.action";
		sa.assertEquals(a, cUrl);

	}
}
