package Buitech.Company.UK.steps.serenity;

import Buitech.Company.UK.pages.GmailPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.steps.ScenarioSteps;

public class UserSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GmailPage gmailPage;

	public void open_gmail_page() {
		gmailPage.open();
	}
	public void maximize_browser() {
		getDriver().manage().window().maximize();
		
	}
	public void enter_email_dress(String arg1) {
		gmailPage.enter_email(arg1);
	}

	public void click_on_next_button() {
		gmailPage.click_next();
	}

	public void enter_password(String arg1) {
		gmailPage.enter_password(arg1);
	}

	public void click_signIn_button() {
		gmailPage.click_signIn();
	}

	public Object getAlertMsg() {

		return gmailPage.getErrMsg();
	}

	public void close_browser() {
		gmailPage.close_gmail();
	}

	public void enter_password1(String arg1) {
		gmailPage.enter_password(arg1);
		
	}

	

}
