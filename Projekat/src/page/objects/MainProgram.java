package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainProgram {

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// open the page

		HomePage.OpenPage(driver);

		// open registration page

		driver.navigate().to(Registration.REG);
		wait2();

		// register the user

		Registration.Registration(driver, 5);

		// go to sign in page

		driver.navigate().to(SignIn.SIGNINPAGE);

		// Sign in

		SignIn.getUser(driver);
		double id = Double.parseDouble(ExcelUtils.getDataAt(5, 0).toString());
		int id1 = (int) id;
		String userid = String.valueOf(id1);
		SignIn.insertUserData(driver, userid);

		SignIn.getPwdField(driver);
		SignIn.clearPwdField(driver);
		SignIn.insertPwd(driver, ExcelUtils.getDataAt(5, 1));
		SignIn.clickLogIn(driver);

	}

}
