package com.visionit.orangehrm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;

	@FindBy(id = "menu_admin_viewAdminModule")
	@CacheLookup
	WebElement admin;

	@FindBy(id = "menu_admin_UserManagement")
	@CacheLookup
	WebElement usermanagement;

	@FindBy(id = "menu_admin_viewSystemUsers")
	@CacheLookup
	WebElement user;

	public homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public adduserpage navigatetoadduserpage(){
		Actions act=new Actions(driver);
		
		act.moveToElement(admin).moveToElement(usermanagement).moveToElement(user).click().build().perform();
		
		return new adduserpage(driver);
	}
	
}
