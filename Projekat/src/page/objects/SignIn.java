package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	public static final String SIGNINPAGE = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	public static final String SIGNIN = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";
	public static final String USER = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	public static final String PWD = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]";
	public static final String SBUTTON = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";

	// sign in page
	public static WebElement findSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN));

	}

	public static void getSignIn(WebDriver driver) {
		findSignIn(driver).click();
	}

	// user
	public static WebElement getUser(WebDriver driver) {
		return driver.findElement(By.xpath(USER));
	}

	public static void clickUserField(WebDriver driver) {
		getUser(driver).click();
	}

	public static void insertUserData(WebDriver driver, String a) {
		getUser(driver).sendKeys(a);
	}

	// password
	public static WebElement getPwdField(WebDriver driver) {
		return driver.findElement(By.xpath(PWD));
	}

	public static void clearPwdField(WebDriver driver) {
		getPwdField(driver).clear();
	}

	public static void insertPwd(WebDriver driver, String b) {
		getPwdField(driver).sendKeys(b);
	}

	// sign in

	public static WebElement findSignButton(WebDriver driver) {
		return driver.findElement(By.xpath(SBUTTON));
	}

	public static void clickLogIn(WebDriver driver) {
		findSignButton(driver).click();
	}

	public static void insertData(WebDriver driver, int i) {
		double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
		int id1 = (int) id;
		String userid = String.valueOf(id1);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]")).sendKeys(userid);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]"))
				.sendKeys(ExcelUtils.getDataAt(i, 1));
		driver.findElement(By.xpath(SBUTTON)).click();

	}

}
