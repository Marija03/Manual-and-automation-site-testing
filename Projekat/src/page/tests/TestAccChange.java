package page.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ExcelUtils;
import page.objects.HomePage;
import page.objects.Registration;
import page.objects.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestAccChange {
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

	// test fails as site doesn't let you change the password (see bug report)
	@Test
	public void checkDataChange() {
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

		driver.navigate().to(Registration.MYACC);

		WebElement pwd = driver
				.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		pwd.clear();
		pwd.sendKeys(ExcelUtils.getDataAt(4, 1));

		WebElement pwd1 = driver
				.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
		pwd1.clear();
		pwd1.sendKeys(ExcelUtils.getDataAt(4, 1));

		WebElement name = driver.findElement(By.xpath("//input[@name='account.firstName']"));
		name.clear();
		name.sendKeys(ExcelUtils.getDataAt(4, 2));

		WebElement surname = driver.findElement(By.xpath("//input[@name='account.lastName']"));
		surname.clear();
		surname.sendKeys(ExcelUtils.getDataAt(4, 3));

		WebElement email = driver.findElement(By.xpath("//input[@name='account.email']"));
		email.clear();
		email.sendKeys(ExcelUtils.getDataAt(4, 4));

		WebElement save = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]"));
		save.click();

		WebElement signOut = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
		signOut.click();

		driver.navigate().to(SignIn.SIGNINPAGE);

		SignIn.insertUserData(driver, userid);
		SignIn.clearPwdField(driver);
		SignIn.insertPwd(driver, ExcelUtils.getDataAt(4, 1));
		SignIn.clickLogIn(driver);

		SoftAssert sa = new SoftAssert();
		boolean account = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/a[3]")).isDisplayed();
		sa.assertTrue(account);

	}

}
