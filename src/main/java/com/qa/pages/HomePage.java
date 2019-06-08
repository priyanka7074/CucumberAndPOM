package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//td[contains(text(),'User: Priyank K')]")
	@CacheLookup //instead of looking up for the element from a frame lookup from the cache to improve speed
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactsLink;
	
	//Initializing the page objects
		public HomePage() {
			PageFactory.initElements(driver, this); //this means pointing to the current class object
			}
		
		
		public String verifyHomePageTitle() {
			return driver.getTitle();
			}
		
		public boolean verifyCorrectUserName() {
			return userNameLabel.isDisplayed();
		}
		
		
		public void clickOnNewContactsLink() {
			Actions action = new Actions(driver);
			action.moveToElement(contactsLink).build().perform();
			newContactsLink.click();
		
		}
	
	
	
	

}
