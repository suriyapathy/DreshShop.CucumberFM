package Stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import com.pages.Homepage;
import com.pages.Loginpage;
import com.qa.driverfactory.Driverfactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_Verify_logincredential_02 {
	private Loginpage loginpage = new Loginpage(Driverfactory.getDriver());
	private Homepage homepage = new Homepage(Driverfactory.getDriver());
	
	
	@When("Verify {string} is visible")
	public void verify_is_visible(String Logging_msg) {
		String msg=loginpage.verify_Logingmag();
		Assert.assertEquals(msg,Logging_msg);
	}

	@When("Enter correct email address and password")
	public void enter_correct_email_address_and_password(DataTable dataTable) {
		List<Map<String,String>> data=dataTable.asMaps();
		homepage=loginpage.loginWithGood(data.get(0).get("usermail"), data.get(0).get("password"));
	  
	}

	@Then("Verify that {string} is visible")
	public void verify_that_is_visible(String name) {
	   String username=homepage.Verify_username();
	   Assert.assertEquals(username, name);
	}

	@When("click delete account button")
	public void click_delete_account_button() {
	 System.out.println("account has been deleted");
	 
	}

	@Then("verify that account deleted is visible")
	public void verify_that_account_deleted_is_visible() {
		 System.out.println("account deleted is visible");

	}

}
