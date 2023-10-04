package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Loginpage {
	private WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By username_field=By.name("name");
	By email_field=By.xpath("(//input[@placeholder='Email Address'])[2]");
	By signup_button=By.xpath("//button[@data-qa='signup-button']");
	By newuser_page=By.xpath("//h2[text()='New User Signup!']");
	By logging_logo=By.xpath("//h2[text()='Login to your account']");
	By userlogin_page=By.xpath("//div[@class='login-form']//h2");
	By login_email=By.xpath("//input[@data-qa='login-email']");
	By login_password=By.name("password");
	By login_button=By.xpath("//button[@data-qa='login-button']");
	By login_incorrect=By.xpath("//p[contains(text(),'incorrect!')]");
	By user_name=By.xpath("//i[@class='fa fa-user']//following-sibling::b");
	
    public String getTitle() {
    	return driver.getTitle();
    }
	public boolean verify_newuserPage() {
		return driver.findElement(newuser_page).isDisplayed();
	}
	public boolean verify_userloginPage() {
		return driver.findElement(userlogin_page).isDisplayed();
	}
	public String verify_Logingmag() {
		return driver.findElement(logging_logo).getText();
	}
	public String Verify_username() {
		return driver.findElement(user_name).getText();
	}
	/* 
	 public Newuserregisterpage addNewuser() {
		username_button.sendKeys("surya");
		String random_wood=ReuseableCode.randomString();
		email_button.sendKeys(random_wood+"@gmail.com");
		signup_button.click();
		return new Newuserregisterpage();
	} 
	*/
	
	public void enter_Username(String username) {
		driver.findElement(username_field).sendKeys(username);
	}
	public void enter_password(String password) {
		driver.findElement(email_field).sendKeys(password);
	}
	/*public String verify_loginincorrectmsg() {
		return login_incorrect.getText();
	} */
	public void click_Login() {
		 driver.findElement(login_button).click();
		 // return new Homepage();
	}
	public Homepage loginWithGood(String username,String password) {
		driver.findElement(login_email).sendKeys(username);
		driver.findElement(login_password).sendKeys(password);
		driver.findElement(login_button).click();
		return new Homepage(driver);	
	}

}
