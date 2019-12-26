package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputBoxes {

	// getting the box for user id and input data
	public static WebElement userID(WebDriver driver) {
		return driver
				.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));

	}

	public static void clickUserId(WebDriver driver) {
		userID(driver).click();
	}

	public static void setUserID(WebDriver driver, String data) {
		userID(driver).sendKeys(data);
	}

	// get and input password
	public static WebElement pwd(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='password']"));

	}

	public static void clickPwd(WebDriver driver) {
		pwd(driver).click();
	}

	public static void setPwd(WebDriver driver, String data) {
		pwd(driver).sendKeys(data);
	}

	// repeat the password
	public static WebElement pwdRepeat(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='repeatedPassword']"));

	}

	public static void clickPwdRepeat(WebDriver driver) {
		pwdRepeat(driver).click();
	}

	public static void setPwdRepeat(WebDriver driver, String data) {
		pwdRepeat(driver).sendKeys(data);
	}

	// get name box and input name
	public static WebElement firstName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.firstName']"));

	}

	public static void clickName(WebDriver driver) {
		firstName(driver).click();
	}

	public static void setName(WebDriver driver, String data) {
		firstName(driver).sendKeys(data);
	}

	// setting last name
	public static WebElement lastName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.lastName']"));

	}

	public static void clickLastName(WebDriver driver) {
		lastName(driver).click();
	}

	public static void setLastName(WebDriver driver, String data) {
		lastName(driver).sendKeys(data);
	}

	// setting email
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.email']"));

	}

	public static void clickEmail(WebDriver driver) {
		email(driver).click();
	}

	public static void setEmail(WebDriver driver, String data) {
		email(driver).sendKeys(data);
	}

	// getting the phone box; input phone number
	public static WebElement phone(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.phone']"));

	}

	public static void clickPhone(WebDriver driver) {
		phone(driver).click();
	}

	public static void setPhone(WebDriver driver, String data) {
		phone(driver).sendKeys(data);
	}

	// getting address box and input address

	public static WebElement address(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.address1']"));

	}

	public static void clickAddress(WebDriver driver) {
		address(driver).click();
	}

	public static void setAddress(WebDriver driver, String data) {
		address(driver).sendKeys(data);
	}

	// getting and setting Address 2
	public static WebElement address2(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.address2']"));

	}

	public static void clickAddress2(WebDriver driver) {
		address2(driver).click();
	}

	public static void setAddress2(WebDriver driver, String data) {
		address2(driver).sendKeys(data);
	}

	// getting city box and input data
	public static WebElement city(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.city']"));

	}

	public static void clickCity(WebDriver driver) {
		city(driver).click();
	}

	public static void setCity(WebDriver driver, String data) {
		city(driver).sendKeys(data);
	}

	// getting state box and input data
	public static WebElement state(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.state']"));

	}

	public static void clickState(WebDriver driver) {
		state(driver).click();
	}

	public static void setState(WebDriver driver, String data) {
		state(driver).sendKeys(data);
	}

	// getting zip box and input data
	public static WebElement zip(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.zip']"));

	}

	public static void clickZip(WebDriver driver) {
		zip(driver).click();
	}

	public static void setZip(WebDriver driver, String data) {
		zip(driver).sendKeys(data);
	}

	// getting country box and input data
	public static WebElement country(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.country']"));

	}

	public static void clickCountry(WebDriver driver) {
		country(driver).click();
	}

	public static void setCountry(WebDriver driver, String data) {
		country(driver).sendKeys(data);
	}

	public static void selectMyList(WebDriver driver) {
		WebElement myList = driver.findElement(By.xpath("//input[@name='account.country']"));
		myList.click();

	}

	public static void selectMyBanner(WebDriver driver) {
		WebElement myBanner = driver.findElement(By.xpath("//input[@name='account.bannerOption']"));
		myBanner.click();
	}

	public static void save(WebDriver driver) {
		WebElement save = driver.findElement(By.xpath("//input[@name='newAccount']"));
		save.click();
	}

}
