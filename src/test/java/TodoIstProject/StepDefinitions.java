package TodoIstProject;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    public WebDriver driver;

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        LoginPage loginPage=new LoginPage(driver);

        loginPage.driver.get("https://app.todoist.com/auth/login?success_page=%2Fapp%2Ftoday");

    }
    @When("User types {string} and {string}")
    public void user_types_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("User lands on the start page")
    public void user_lands_on_the_start_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
