package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.TestBase;

public class GeneralInfoPage extends TestBase {

	protected WebDriver driver;

	public GeneralInfoPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//p/span[@class = 'color_15']")
	private List<WebElement> generalInfoTitles;
	

	public List<WebElement> generalInfoTitles() {
		List<WebElement> titles = driver.findElements(By.xpath( "//p/span[@class = 'color_15']"));
		return titles;
	}
	
	public List<WebElement> getGeneralInfoTitles() {
		List<WebElement> titles = generalInfoTitles;
		return titles;
	}
	
	public ArrayList<String> getGeneralInfoTitleText() {
		List<WebElement> titles = generalInfoTitles();
		ArrayList<String> listofTitlesLink = new ArrayList<String>();
		for(WebElement title : titles) {
			if(title.isDisplayed()) {
				listofTitlesLink.add(getText(title));	
			}
		}
		return listofTitlesLink;
	}
	
	
//	public boolean addressDisplayed() {
//		return display(isaddress);
//	}
//
//	public boolean addressDisplayed1() {
//		return display(address1);
//	}
//
//	public boolean addressDisplayed2() {
//		return display(address2);
//	}
//
//	public boolean contactDisplayed() {
//		return display(iscontact);
//	}
//
//	public boolean contactDisplayed1() {
//		return display(contact1);
//	}
//
//	public boolean contactDisplayed2() {
//		return display(contact2);
//	}
//
//	public boolean contactAcceptDisplayed2() {
//		return display(accept);
//	}
//
//	public boolean homeDisplayed1() {
//		return display(home);
//	}
//
//	public boolean homeDisplayed2() {
//		return display(home1);
//	}
//
//	public boolean homeDisplayed3() {
//		return display(home2);
//	}

}
