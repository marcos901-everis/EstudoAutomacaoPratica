package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import maps.Maps;

public class BasePage {
  public WebDriverWait wait;
  public WebDriver driver;
  public Actions action;
  
  public BasePage(WebDriver driver) {
    this.driver = driver;
    this.action = new Actions(driver);
    this.wait = new WebDriverWait(driver, 60);
  }
  
  Maps maps = new Maps();
  
  public void navegar(String url) {
    driver.navigate().to(url);
  }
  
  public void click(By element) {
    wait(element);
    driver.findElement(element).click();
  }
  
  public void wait(By element) {
    this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
  }
  
  public void rightClick(WebElement element) {
    action.contextClick(element).perform();
  }
  
  public void confirmAlert() {
    driver.switchTo().alert().accept();
  }
  
  public void clicarItem(String campo) {
    click(maps.createLinkByText(campo));
  }
  
  public void botao(String campo) {
    click(maps.createSpanByText(campo));
  }
}
