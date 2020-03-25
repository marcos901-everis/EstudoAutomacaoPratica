package page;

import java.io.IOError;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import maps.maps;

public class HomePage extends maps {
  protected void iniciarAcesso(WebDriver driver, String url) {
    driver.get(url);
  }
  
  protected void clicarItem(WebDriver driver, String nome) {
    WebElement item = createLinkByText(driver, nome);
    WebDriverWait espera = new WebDriverWait(driver, 60);
    espera.until(ExpectedConditions.elementToBeClickable(item));
    item.click();
  }
  
  protected void clicarAddCar(WebDriver driver) {
    WebElement item = createSpanByText(driver, "Add to cart");
    WebDriverWait espera = new WebDriverWait(driver, 60);
    espera.until(ExpectedConditions.elementToBeClickable(item));
    item.click();
  }
  
  protected void verificarItemAdd(WebDriver driver, String nome) {
    WebElement item = createTittleByText(driver, nome);
    WebDriverWait espera = new WebDriverWait(driver, 60);
    espera.until(ExpectedConditions.elementToBeClickable(item));
    if (!item.isDisplayed()) {
      System.out.println("Compra não esta no carrinho");
    }
  }
  
  protected void botao(WebDriver driver, String nome) {
    WebElement item = createSpanByText(driver, nome);
    WebDriverWait espera = new WebDriverWait(driver, 60);
    espera.until(ExpectedConditions.elementToBeClickable(item));
    item.click();
  }
  
  protected void verificarDadosEndereco(WebDriver driver, String nome) {
    WebElement item = createLiByText(driver, nome);
    WebDriverWait espera = new WebDriverWait(driver, 60);
    espera.until(ExpectedConditions.elementToBeClickable(item));
    if (!item.isDisplayed()) {
      System.out.println("Compra não esta na lista de compra");
    }
  }
  
  protected void preecherCampos(WebDriver driver, String campo, String dado) {
    WebElement item = createDivByInput(driver, campo);
    WebDriverWait espera = new WebDriverWait(driver, 60);
    item.click();
    item.sendKeys(dado);
  }
  
  protected void clicarCheckBox(WebDriver driver, String campo) {
    WebElement item = createDivByInput(driver, campo);
    WebDriverWait espera = new WebDriverWait(driver, 60);
    item.click();
  }
  
  protected void verificarCompraFinalizada(WebDriver driver) {
    WebElement item = campoCampoFinalizado(driver);
    WebDriverWait espera = new WebDriverWait(driver, 60);
    espera.until(ExpectedConditions.elementToBeClickable(item));
    if (!item.isDisplayed()) {
      System.out.println("Compra não esta na lista de compra");
    }
  }
}
