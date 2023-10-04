package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	private WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	private By logo = By.xpath("//div[@class='logo pull-left']//img");
	private By login_button = By.xpath("//*[text()=' Signup / Login']");
	private By user_name = By.xpath("//a//i//following-sibling::b");
	private By delete_ac = By.xpath("//a[text()=' Delete Account']");
	private By logout_button = By.xpath("//a[text()=' Logout']");
	private By contactus_button = By.xpath("//a[text()=' Contact us']");
	private By Products_button = By.xpath("//a[text()=' Products']");
	private By Afuser_name =By.xpath("//i[@class='fa fa-user']//following-sibling::b");

	public String getTitle() {
		return driver.getTitle();
	}

	public boolean verifyhomeLogo() {
		return driver.findElement(logo).isDisplayed();
	}

	public Loginpage click_Login() {
		driver.findElement(login_button).click();
		return new Loginpage(driver);
	}

	public boolean verify_signupbutton() {
		return driver.findElement(login_button).isDisplayed();
	}

	public String Verify_username() {
		return driver.findElement(Afuser_name).getText();
	}

	/*
	 * public String verifyUser() { return user_name.getText(); } public void
	 * accountdelete() { delete_ac.click(); } public boolean veriflogoutbutton() {
	 * return logout_button.isDisplayed(); } public Loginpage logout() {
	 * logout_button.click(); return new Loginpage(); } public Contactpage contact()
	 * { contactus_button.click(); return new Contactpage(); } public Productspage
	 * goProductPage() { Products_button.click(); return new Productspage();
	 */

}