package Buitech.Company.UK.steps.serenity;

import net.thucydides.core.annotations.Steps;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginScenariosStep {
	@Steps
	UserSteps userSteps;
	
	@Given("^I am on https://accounts.google.com$")
	public void i_am_on_https_accounts_google_com() throws Throwable {
	   userSteps.open_gmail_page();
	  
	}
	@Given("^I maximize gmail page$")
	public void i_maximize_gmail_page() throws Throwable {
	   userSteps.maximize_browser();
	}
	
	@When("^I enter my email ([^\"]*)$")
	public void i_enter_my_email_hang_buitech_gmail_com(String arg1) throws Throwable {
	    userSteps.enter_email_dress(arg1);
	    
	}

	@When("^I click the next button$")
	public void i_click_the_next_button() throws Throwable {
	    userSteps.click_on_next_button();
	    
	}

	@When("^I enter my password ([^\"]*)$")
	public void i_enter_my_password(String arg1) throws Throwable {
	    userSteps.enter_password(arg1);
	    
	}
	
	@When("^I click the signIn button$")
	public void i_click_the_signIn_button() throws Throwable {
		userSteps.click_signIn_button();
	}

	@Then("^I see an alert message is ([^\"]*)$")
	public void i_see_an_alert_message_is_Please_enter_your_password(String Msg) throws Throwable {
		Assert.assertEquals(userSteps.getAlertMsg(), Msg);
	   
	}

	@Then("^I close my browser$")
	public void i_close_my_browser() throws Throwable {
		userSteps.close_browser();
	    
	}

	
	/*

	@When("^I enter my email ([^\"]*)$")
	public void i_enter_my_email(String arg2) throws Throwable {
	   userSteps.enter_email_dress(arg2);
	   
	}
	
	@When("^I click the next button$")
	public void i_click_the_next_button() throws Throwable {
	    userSteps.click_on_next_button();
	    
	}
	@Then("^I see an alert message is ([^\"]*)$")
	public void i_see_an_alert_message_is_Please_enter_your_email(String[] Msg) throws Throwable {
		Assert.assertEquals(userSteps.getAlertMsg(), Msg);
	    
	}
	@Then("^I close my browser$")
	public void i_close_my_browser() throws Throwable {
		userSteps.close_browser();
	    
	}
	/*
	@When("^I enter my email dsfdf$")
	public void i_enter_my_email_dsfdf(String arg3) throws Throwable {
		userSteps.enter_email_dress(arg3);
	    
	}

	@Then("^I see an alert message is Please enter a valid email address\\.$")
	public void i_see_an_alert_message_is_Please_enter_a_valid_email_address(String Msg) throws Throwable {
		Assert.assertEquals(userSteps.getAlertMsg(), Msg);
	   
	}

	@When("^I enter my password buitech(\\d+)$")
	public void i_enter_my_password_buitech(String arg2) throws Throwable {
		userSteps.enter_password(arg2);
	    
	}

	@Then("^I see an alert message is $")
	public void i_see_an_alert_message_is(String[] Msg) throws Throwable {
		Assert.assertEquals(userSteps.getAlertMsg(), Msg);
	   
	}

	@When("^I enter my password afff$")
	public void i_enter_my_password_afff(String arg4) throws Throwable {
		userSteps.enter_password(arg4);
	   
	}

	@Then("^I see an alert message is The email and password you entered don't match\\.$")
	public void i_see_an_alert_message_is_The_email_and_password_you_entered_don_t_match(String[] Msg) throws Throwable {
		Assert.assertEquals(userSteps.getAlertMsg(), Msg);
	    
	}*/
}
