package definition;

import automationbase.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import page.LoginPage;
import page.SearchPage;

import static org.junit.Assert.assertTrue;

public class SearchStepDefinition extends Base {
    SearchPage searchPage;
    @Given("user enter valid text on the search box")
    public void user_enter_valid_text_on_the_search_box() {
       driver.findElement(searchPage.searchTextField).sendKeys("Shirt");
     //  driver.findElement(By.cssSelector(" DHSWHHHHWHWH"));
       driver.findElement(searchPage.searchButton).click();
    }
    @Then("a search result should appear")
    public void a_search_result_should_appear() {
       boolean searchHomeIsDisplay = driver.findElement(searchPage.searchHomeButton).isDisplayed();
        assertTrue(searchHomeIsDisplay);

        LoginPage page = new LoginPage();
        driver.findElement(page.signButtonOnHomePage).click();
    }
}
