package Stepdefinition;

import org.junit.Assert;

import com.pages.Homepage;
import com.pages.Loginpage;
import com.qa.driverfactory.Driverfactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_Loginpage_001 {

	private Loginpage loginpage = new Loginpage(Driverfactory.getDriver());
	private Homepage homepage = new Homepage(Driverfactory.getDriver());
	private static String title;

	@Given("user is on home page")
	public void user_is_on_home_page() {
		boolean logo = homepage.verifyhomeLogo();
		Assert.assertTrue(logo);
		
	}
	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = homepage.getTitle();
		System.out.println("HomePagr title is:  " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String pagetitle) {
		Assert.assertTrue(title.contains(pagetitle));
	}

	@Then("Signuplogin page password link should be displayed")
	public void Signuplogin_page_password_link_should_be_displayed() {
		Boolean signup = homepage.verify_signupbutton();
		Assert.assertTrue(signup);
	}

	@Then("user land into login page")
	public void user_land_into_login_page() {
		homepage.click_Login();
		String loginpage_title = loginpage.getTitle();
		System.out.println("loinpage title is:  " + loginpage_title);
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginpage.enter_Username(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginpage.enter_password(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginpage.click_Login();
	}

	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
		title = homepage.getTitle();
		System.out.println("HomePage title is:  " + title);
	}

}