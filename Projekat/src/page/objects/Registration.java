package page.objects;

import org.openqa.selenium.WebDriver;

public class Registration {
	
	public static void wait2() {
		try {
		Thread.sleep(4000);		
				}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	public static final String REG = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	public static final String MYACC = "https://petstore.octoperf.com/actions/Account.action?editAccountForm=";
	public static final String AccountOption = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[3]";
	
	
	//method for the registration of the user
	public static void Registration(WebDriver driver, int i) {
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);
		
		InputBoxes.userID(driver);
		double idnum = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
		int id1 = (int) idnum;
		String userid = String.valueOf(id1);
		InputBoxes.setUserID(driver, userid);
		
		InputBoxes.pwd(driver);
		InputBoxes.setPwd(driver, ExcelUtils.getDataAt(i, 1));
		
		InputBoxes.pwdRepeat(driver);
		InputBoxes.setPwdRepeat(driver, ExcelUtils.getDataAt(i, 1));
		
		InputBoxes.firstName(driver);
		InputBoxes.setName(driver, ExcelUtils.getDataAt(i, 2));
		
		InputBoxes.lastName(driver);
		InputBoxes.setLastName(driver, ExcelUtils.getDataAt(i, 3));
		
		InputBoxes.email(driver);
		InputBoxes.setEmail(driver, ExcelUtils.getDataAt(i, 4));
		
		InputBoxes.phone(driver);
		InputBoxes.setPhone(driver, ExcelUtils.getDataAt(i, 5));
		
		InputBoxes.address(driver);
		InputBoxes.setAddress(driver, ExcelUtils.getDataAt(i, 6));
		
		InputBoxes.address2(driver);
		InputBoxes.setAddress2(driver, ExcelUtils.getDataAt(i, 7));
		
		InputBoxes.city(driver);
		InputBoxes.setCity(driver, ExcelUtils.getDataAt(i, 8));
		
		InputBoxes.state(driver);
		InputBoxes.setState(driver, ExcelUtils.getDataAt(i, 9));
		
		InputBoxes.zip(driver);
		double zip = Double.parseDouble(ExcelUtils.getDataAt(i, 10).toString());
		int zip1 = (int) zip;
		String zip0 = String.valueOf(zip1);
		InputBoxes.setZip(driver, zip0);
		
		InputBoxes.country(driver);
		InputBoxes.setCountry(driver, ExcelUtils.getDataAt(i, 11));
		
		InputBoxes.selectMyList(driver);
		InputBoxes.selectMyBanner(driver);
		
		InputBoxes.save(driver);
		
		
	}
	
	
		
		
	}


