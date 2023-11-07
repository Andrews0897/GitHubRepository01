package StepDefinition;

import org.BaseClass.BaseClass;
import org.Locators.LoginLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends BaseClass{
	
	LoginLocator loginPageLocators;
	
	@Given("User has opened the Application URL and Navigated to Login page")
	public void user_has_opened_the_Application_URL_and_Navigated_to_Login_page() {
		
		browserLaunch("chrome");
		url("https://hti-uat.engage2serve.com");
		
	}

	@When("User enter valid email address and Enter valid password")
	public void user_enter_valid_email_address_and_Enter_valid_password() {
		
		LoginLocator loginPageLocators = new LoginLocator();
		
		loginPageLocators.loginPage("htu-e2s@yopmail.com", "welcome@123");
		
		//SIT5$h32H!tin2tg
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
		
		

	}

	@Then("User should be able to successfully login")
	public void user_should_be_able_to_successfully_login() throws InterruptedException {
		
		String homePageTitle = driver.getTitle();
		System.out.println(homePageTitle);
		String expectedTitle = "Engage2Serve | Login";
		
		if(homePageTitle.equals(expectedTitle)) {
			
            System.out.println("Test passed! Page title matches the expected title.");
            
		}
		
		else {
			
            System.out.println("Test failed! Page title does not match the expected title.");
		}
		
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//*[@class='btn btn-primary btn-sm post-btn ng-binding ladda-button']//child::span[1]"));
		
		if (element.isDisplayed()) {
			
			System.out.println("Status Pass! Post Button is displaying");
			
		}
		
		else {
			System.out.println("Status Fail! Post Button is not display");
		}
		
		
		WebElement textDisableorNot = driver.findElement(By.xpath("//*[@class='nine_home_element_to_target']//child::strong"));
		String text = textDisableorNot.getText();
		String expectedText = "My0 Day";
		if (text.equals(expectedText)) {
			
			System.out.println("Status Pass! Text Presended");
			
		}
		
		else {
			System.out.println("Status Fail! Text Not Presended");
		}
		
	    WebElement clickClopseButtons= driver.findElement(By.xpath("//*[@class='menu-icon ng-scope']//child::button"));
	    clickClopseButtons.click();
	    
	 
	  //*[@class='expand-menu-button']//child::i
	    
	    WebElement clickAudienceButton= driver.findElement(By.xpath("(//span[@class='ng-binding'])[2]"));
	    clickAudienceButton.click();
	    clickAudienceButton.click();
	
	    WebElement closeClopseButtons= driver.findElement(By.xpath("//*[@class='expand-menu-button']//child::i"));
	    closeClopseButtons.click();
	    
	    
	    Thread.sleep(3000);
	    WebElement clickProfileIcon= driver.findElement(By.xpath("(//*[@class='audience-contact-box-detail-image'])[1]//child::a[1]"));
        fluentclick(clickProfileIcon);
	    Thread.sleep(5000);
	    WebElement clickBioGraphyEditIcon= driver.findElement(By.xpath("//*[@tooltip='Edit']"));
	    clickBioGraphyEditIcon.click();
	    
	    WebElement clearAffinites = driver.findElement(By.xpath("(//*[@class='ui-select-match-close select2-search-choice-close'])[1]@l"));
	    clearAffinites.click();
	}
	

}
