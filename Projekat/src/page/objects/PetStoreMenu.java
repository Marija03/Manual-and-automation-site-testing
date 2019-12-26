package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetStoreMenu {

	public static final String FISH = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String DOG = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String CAT = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String REPTILES = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String BIRD = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";

	public static final String FISHLEFT = "//div[@id='Content']//a[1]//img[1]";
	public static final String DOGLEFT = "//div[@id='Content']//a[2]//img[1]";
	public static final String CATLEFT = "//div[@id='Content']//a[3]//img[1]";
	public static final String REPTILELEFT = "//div[@id='Content']//a[4]//img[1]";
	public static final String BIRDLEFT = "//div[@id='Content']//a[5]//img[1]";

	public static final String FISHTOP = "//div[@id='QuickLinks']//a[1]//img[1]";
	public static final String DOGTOP = "//div[@id='Header']//a[2]//img[1]";
	public static final String CATTOP = "//div[@id='Header']//a[4]//img[1]";
	public static final String REPTILETOP = "//div[@id='Header']//a[3]//img[1]";
	public static final String BIRDTOP = "//div[@id='Header']//a[5]//img[1]";

	public static final String FISHIMAGE = "//body//area[2]";
	public static final String DOGIMAGE = "//body//area[3]";
	public static final String REPTILEIMAGE = "//body//area[4]";
	public static final String CATIMAGE = "//body//area[5]";
	public static final String BIRDIMAGE = "//body//area[6]";
	public static final String BIG_BIRD_IMAGE = "//body//area[1]";

	// choosing the fish option from menu on the left
	public static void getFishLeft(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(FISHLEFT)).click();

	}

	// choosing the dog option from menu on the left
	public static void getDogLeft(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(DOGLEFT)).click();

	}

	// choosing the cat option from menu on the left
	public static void getCatLeft(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(CATLEFT)).click();

	}

	// choosing the reptiles option from menu on the left

	public static void getReptileLeft(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(REPTILELEFT)).click();

	}

	// choosing the birds option from menu on the left

	public static void getBirdLeft(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(BIRDLEFT)).click();

	}

	// choosing the fish option from menu on the top
	public static void getFishTop(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(FISHTOP)).click();

	}

	// choosing the dog option from menu on the top
	public static void getDogTop(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(DOGTOP)).click();

	}

	// choosing the cat option from menu on the top
	public static void getCatTop(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(CATTOP)).click();

	}

	// choosing the reptile option from menu on the top
	public static void getReptileTop(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(REPTILETOP)).click();

	}

	// choosing the bird option from menu on the top
	public static void getBirdTop(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(BIRDTOP)).click();

	}

	// choosing the fish option from image menu
	public static void getFishImage(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(FISHIMAGE)).click();

	}

	// choosing the dog option from image menu
	public static void getDogImage(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(DOGIMAGE)).click();

	}

	// choosing the reptile option from image menu
	public static void getReptileImage(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(REPTILEIMAGE)).click();

	}

	// choosing the cat option from image menu
	public static void getCatImage(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(CATIMAGE)).click();

	}

	// choosing the bird option from image menu
	public static void getBirdImage(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(BIRDIMAGE)).click();

	}

	// choosing the big bird image
	public static void getBirdImage1(WebDriver driver) {
		driver.get(HomePage.MAINPAGE);
		driver.findElement(By.xpath(BIG_BIRD_IMAGE)).click();

	}

}
