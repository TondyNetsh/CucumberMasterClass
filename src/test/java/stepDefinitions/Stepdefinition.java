package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class Stepdefinition {
    @Given("User is on landing page")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("NetBank landing page loaded");
    }

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {

    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {

    }

    @Then("^Check if the browser is started$")
    public void check_if_the_browser_is_started() throws Throwable {

    }

    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
        System.out.println("Username: " + username + " and password: " + password);
    }

    @Then("Home page is populated")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Home Page Populated");
    }

    @And("^Cards displayed are (.+)$")
    public void cards_displayed_are_something(String cards) throws Throwable {
        System.out.println("Cards: " + cards);
        System.out.println();
    }

    @When("^User login into application with following details$")
    public void user_login_into_application_with_following_details(DataTable data) throws Throwable {
        //System.out.println(data);
        List<List<String>> obj = data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }
}

