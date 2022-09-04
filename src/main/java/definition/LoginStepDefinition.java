package definition;

import automationbase.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class LoginStepDefinition extends Base {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() throws InterruptedException {
        driver.findElement(loginPage.signButtonOnHomePage).click();
        TimeUnit.SECONDS.sleep(3);
    }
    @When("user enter a valid data")
    public void user_enter_a_valid_data() {

        driver.findElement(loginPage.emailTextField).sendKeys("pomtesting12345@gmail.com");

   driver.findElement(loginPage.passwordTextField).sendKeys("superman");
   driver.findElement(loginPage.SignInButton).click();


    }
    @Then("user should be login")
    public void user_should_be_login() {

        assertTrue(driver.findElement(loginPage.myAccountIcon).isDisplayed());

    }

}
