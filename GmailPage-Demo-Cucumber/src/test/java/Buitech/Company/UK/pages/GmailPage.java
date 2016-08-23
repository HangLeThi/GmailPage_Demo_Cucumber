package Buitech.Company.UK.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebElement;



@DefaultUrl("https://accounts.google.com")
public class GmailPage extends PageObject {
	@FindBy(id="Email")
	WebElement emailField;
	
	@FindBy(id="errormsg_0_Passwd")
	WebElement errMsg;
	
	@FindBy(id="next")
	WebElement nextbtn;
	
	@FindBy(id="Passwd")
	WebElement pwdField;
	
	@FindBy(id="signIn")
	WebElement signInBtn;

	public void enter_email(String arg1) {
		emailField.sendKeys(arg1);
		
	}

	public void click_next() {
		nextbtn.click();
		
	}

	public void enter_password(String arg1) {
		pwdField.sendKeys(arg1);
		
	}

	public void click_signIn() {
		signInBtn.click();
		
	}

	public Object getErrMsg() {
		
		return errMsg.getText();
	}

	public void close_gmail() {
		getDriver().quit();
		
	}

	public void enter_password1(String arg1) {
		emailField.sendKeys(arg1);
		
	}
	
	

}
