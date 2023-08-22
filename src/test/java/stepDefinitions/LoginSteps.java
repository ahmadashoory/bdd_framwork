package stepDefinitions;


import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;

public class LoginSteps extends BaseClass {
	LoginPageObjects Lobject = new LoginPageObjects();



@Given("the user is on the homepage")
public void the_user_is_on_the_homepage() {
    BaseClass.initializeDriver();
    logger.info("user is on the home page");
}

@When("user clicks on MyAccount")
public void user_clicks_on_my_account() {
	Lobject.clickMyAccount();
}

@When("user click on login")
public void user_click_on_login() {
	Lobject.clickLogin();
}

@When("user enters {string}  and {string}")
public void user_enters_and(String email, String password) {
	Lobject.enterEmail(email);
	Lobject.enterPassword(password);
	
}

@When("user clicks login button")
public void user_clicks_login_button() {
	Lobject.clickLoginBttn();
}


@Then("user insert first name")
public void user_insert_first_name(String fname) {
	
}

@Then("user insert last name")
public void user_insert_last_name() {
    
}

@Then("user insert the country")
public void user_insert_the_country() {
    
}

@Then("user insert the address")
public void user_insert_the_address() {
   
}

@Then("user insert city")
public void user_insert_city() {
 
}

@Then("user insert state")
public void user_insert_state() {
  
}

@Then("user insert Zipcode")
public void user_insert_zipcode() {
    
}

@Then("user insert the phone")
public void user_insert_the_phone() {
    
}

@Then("user place the ordrs")
public void user_place_the_ordrs() {
   
}



@Then("user logs out of account")
public void user_logs_out_of_account() {
	Lobject.clickLogoutBttn();
	
	
}

}

