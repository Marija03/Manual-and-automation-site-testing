package page.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ExcelUtils;
import page.objects.HomePage;
import page.objects.Registration;
import page.objects.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestRegistrationOne {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	// registration and sign in of one user
	@Test
	public void registerUser() {
		int i = 25;
		driver.get(Registration.REG);
		Registration.Registration(driver, i);

		driver.navigate().to(Registration.REG);
		SignIn.getSignIn(driver);
		SignIn.getUser(driver);

		double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
		int id1 = (int) id;
		String userid = String.valueOf(id1);

		SignIn.insertUserData(driver, userid);

		String pwd = ExcelUtils.getDataAt(i, 1);
		SignIn.getPwdField(driver);
		SignIn.clearPwdField(driver);
		SignIn.insertPwd(driver, pwd);

		SignIn.findSignButton(driver);
		SignIn.clickLogIn(driver);

		SoftAssert sa = new SoftAssert();

		String cUrl = driver.getCurrentUrl();
		cUrl = cUrl.replaceAll(";jsessionid=[^?]*", "");
		String a = "https://petstore.octoperf.com/actions/Catalog.action";
		sa.assertEquals(a, cUrl);
	}

}
