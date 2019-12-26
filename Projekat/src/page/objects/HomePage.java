package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	public static final String URL = "https://petstore.octoperf.com/";
	public static final String ENTERTHESTORE = "//a[contains(text(),'Enter the Store')]";
	public static final String MAINPAGE = "https://petstore.octoperf.com/actions/Catalog.action";

	// slow the action
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// open the mail page
	public static void OpenPage(WebDriver driver) {

		driver.get(URL);
		wait2();
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.xpath(ENTERTHESTORE));
		a.click();

	}
}
