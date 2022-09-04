package page;

import automationbase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base{
// Store our Locator
   public By signButtonOnHomePage = By.cssSelector("a[title='Log in to your customer account']");
  public   By emailTextField = By.cssSelector("input#email");
  public   By passwordTextField = By.cssSelector("input#passwd");
  public   By SignInButton = By.cssSelector("button#SubmitLogin > span");

  public By myAccountIcon = By.cssSelector(".navigation_page");
}
