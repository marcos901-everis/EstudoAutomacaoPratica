package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import maps.maps;

public class HomePage extends maps{
  protected void iniciarAcesso(WebDriver driver, String url) {
    driver.get(url);
  }
  protected void clicarItem(WebDriver driver,String nome) {
    WebElement item = campoItem(driver,nome);
    WebDriverWait espera = new WebDriverWait(driver, 60);
    espera.until(ExpectedConditions.elementToBeClickable(item));
    item.click();
  }
  protected void clicarAddCar(WebDriver driver) {
    WebElement item = botaoAddCar(driver,"Add to cart");
    WebDriverWait espera = new WebDriverWait(driver, 60);
    espera.until(ExpectedConditions.elementToBeClickable(item));
    item.click();
  }
  protected void verificarItemAdd(WebDriver driver,String nome) {
    WebElement item = campoItemAdd(driver, nome);
    WebDriverWait espera = new WebDriverWait(driver, 60);
    espera.until(ExpectedConditions.elementToBeClickable(item));
    item.click();
  }
}
