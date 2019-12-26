package page.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ExcelUtils;
import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestCart {

	WebDriver driver;

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void AddToCart() {
		driver.get(HomePage.MAINPAGE);

		SignIn.getSignIn(driver);
		wait2();

		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);

		double uid = Double.parseDouble(ExcelUtils.getDataAt(3, 0).toString());
		int id = (int) uid;
		String userid = String.valueOf(id);

		SignIn.insertUserData(driver, userid);
		SignIn.clearPwdField(driver);
		SignIn.insertPwd(driver, ExcelUtils.getDataAt(3, 1));
		SignIn.findSignButton(driver);
		SignIn.clickLogIn(driver);

		wait2();

		PetStoreMenu.getFishLeft(driver);

		WebElement koi = driver
				.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/a[1]"));
		koi.click();

		WebElement add = driver
				.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/a[1]"));
		add.click();

		SoftAssert sa = new SoftAssert();
		boolean cart1 = driver.findElement(By.xpath("//a[contains(text(),'Remove')]")).isDisplayed();
		sa.assertTrue(cart1);

	}
}
