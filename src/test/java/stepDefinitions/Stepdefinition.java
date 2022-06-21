package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
    @Given("User is on landing page")
    public void verifyLandingPage() throws Throwable {
        System.out.println("User is on NetBanking landing page");
    }

    @When("User login into application with username and password")
    public void userLoginIntoApplicationWithUsernameAndPassword() throws Throwable {
        System.out.println("User entered password");
    }

    @Then("Home page is populated")
    public void homePageIsPopulated() throws Throwable {
        System.out.println("Welcome to NetBanking");
    }

    @And("Cards are displayed on the dashboard")
    public void cardsAreDisplayedOnTheDashboard() throws Throwable {
        System.out.println("Your cards are displayed here");
    }
}

