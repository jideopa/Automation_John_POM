package page;

import org.openqa.selenium.By;

public class SearchPage {
   public By searchTextField = By.cssSelector("input#search_query_top");
  public   By searchButton = By.cssSelector("form#searchbox > button[name='submit_search']");
  public By searchHomeButton = By.cssSelector(".navigation_page");
}
