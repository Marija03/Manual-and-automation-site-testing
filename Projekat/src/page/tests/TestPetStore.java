package page.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestPetStore {

	static WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	// choosing menu options from the left on the main page
	@Test
	public void menuFromTheLeft() {
		SoftAssert sa = new SoftAssert();

		PetStoreMenu.getBirdLeft(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.BIRD);

		PetStoreMenu.getCatLeft(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.CAT);

		PetStoreMenu.getFishLeft(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.FISH);

		PetStoreMenu.getDogLeft(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.DOG);

		PetStoreMenu.getReptileLeft(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.REPTILES);

		sa.assertAll();

	}

	// choosing menu options from the top on the main page
	@Test
	public void menuFromTheTop() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenu.getBirdTop(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.BIRD);

		PetStoreMenu.getCatTop(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.CAT);

		PetStoreMenu.getDogTop(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.DOG);

		PetStoreMenu.getFishTop(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.FISH);

		PetStoreMenu.getReptileTop(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.REPTILES);

		sa.assertAll();
	}

	// clicking on images on the main page
	@Test
	public void images() {
		SoftAssert sa = new SoftAssert();

		PetStoreMenu.getFishImage(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.FISH);

		PetStoreMenu.getDogImage(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.DOG);

		PetStoreMenu.getReptileImage(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.REPTILES);

		PetStoreMenu.getCatImage(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.CAT);

		PetStoreMenu.getBirdImage(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.BIRD);

		PetStoreMenu.getBirdImage1(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.BIRD);

		sa.assertAll();
	}

}
