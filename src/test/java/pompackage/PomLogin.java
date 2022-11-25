package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseHRMClass;

public class PomLogin extends BaseHRMClass {
	
	//object repository
	@FindBy(css="#divUsername > span:nth-child(2)")
	WebElement Username;
	
	@FindBy(id="textPassword") WebElement Password;
	@FindBy(id="btnLogin")WebElement Loginbtn;
	
	//initiate page elements
	public PomLogin() {
		PageFactory.initElements(driver, this);
		
	}
		public void typeusername(String name) {
			Username.sendKeys(name);
			}
		public void typepassword(String pass) {
			Password.sendKeys(pass);
		}
		public void clickbtn() {
			Loginbtn.click();
		}
		
		public String verify() {
			return driver.getTitle();
			
		}
	}
	


