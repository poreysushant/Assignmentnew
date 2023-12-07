package steps;

import org.openqa.selenium.WebDriver;

import QA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class SearchSteps
{
	
  public WebDriver driver;
	HomePage hm;
@Given("user should be on the website homepage")
public void user_should_be_on_the_website_homepage() 
{
	
	driver=DriverFactory.getDriver();
	driver.get("https://www.amazon.in");
    
}

@When("user search for {string}")
public void user_search_for(String string) {
    hm=new HomePage(DriverFactory.getDriver());
	hm.searchTab("iphone");
	hm.clickOnsearchbutton();
}

@When("user select the iPhone from the list of results")
public void user_select_the_i_phone_from_the_list_of_results() {
	hm.clickOnIphone();
}

@When("user navigate to the product details page")
public void user_navigate_to_the_product_details_page() {
}

@Then("user should be able to store the price of the iPhone in a variable")
public void user_should_be_able_to_store_the_price_of_the_i_phone_in_a_variable() {
    
}

@Then("user add the iPhone to the cart")
public void user_add_the_i_phone_to_the_cart() {
}




@When("user register as a new user")
public void user_register_as_a_new_user() {
}

@When("user apply filters for specific criteria")
public void user_apply_filters_for_specific_criteria() {
}

@Then("user should see a filtered list of phones")
public void user_should_see_a_filtered_list_of_phones() {
}

@Then("the filtered list should match the applied criteria")
public void the_filtered_list_should_match_the_applied_criteria() {
}



}
