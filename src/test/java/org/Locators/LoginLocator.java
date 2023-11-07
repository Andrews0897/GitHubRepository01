package org.Locators;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocator extends BaseClass{
		
		public LoginLocator() {
			
			PageFactory.initElements(driver, this);
		}
		 
		@FindBy(xpath = "//*[@placeholder='Enter your user name']")
		private WebElement enteremail;
		
		@FindBy(xpath = "//*[@type='password']")
		private WebElement enterPassword;
		
		@FindBy(xpath = "//*[@type='submit']")
		private WebElement clickLoginButton;
		
		
		public WebElement getEnteremail() {
			return enteremail;
		}

		public WebElement getEnterPassword() {
			return enterPassword;
		}

		
		public WebElement getClickLoginButton() {
			return clickLoginButton;
		}
		
		public void loginPage(String userName , String userPassword) {

			fluWaitToFillTextBox(getEnteremail(), userName);
			fluWaitToFillTextBox(getEnterPassword(), userPassword);
			click(getClickLoginButton());
			
			
		}	

}
