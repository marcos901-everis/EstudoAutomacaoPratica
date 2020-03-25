package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import maps.Maps;

public class HomePage extends BasePage {
  public HomePage(WebDriver driver) {
    super(driver);
  }
  
  Maps maps = new Maps();
  
  public void clicarItem(String campo) {
    By element = maps.createLinkByText(campo);
    WebElement item = driver.findElement(element);
    wait(element);
    item.click();
  }
  
  public void clicarAddCar() {
    By element = maps.createSpanByText("Add to cart");
    WebElement item = driver.findElement(element);
    wait(element);
    item.click();
  }
  
  public void verificarItemAdd(String campo) {
    By element = maps.createTittleByText(campo);
    WebElement item = driver.findElement(element);
    wait(element);
    if (!item.isDisplayed()) {
      System.out.println("Compra não esta no carrinho");
    }
  }
  
  public void botao(String campo) {
    By element = maps.createSpanByText(campo);
    WebElement item = driver.findElement(element);
    wait(element);
    item.click();
  }
  
  public void verificarDadosEndereco(String campo) {
    By element = maps.createLiByText(campo);
    WebElement item = driver.findElement(element);
    wait(element);
    if (!item.isDisplayed()) {
      System.out.println("Compra não esta na lista de compra");
    }
  }
  
  public void preecherCampos(String campo, String dado) {
    By element = maps.createDivByInput(campo);
    WebElement item = driver.findElement(element);
    wait(element);
    item.click();
    item.sendKeys(dado);
  }
  
  public void clicarCheckBox(String campo) {
    By element = maps.createDivByInput(campo);
    WebElement item = driver.findElement(element);
    if (!item.isSelected()) {
      item.click();
    }
  }
  
  public void verificarCompraFinalizada(WebDriver driver) {
    By element = maps.campoConfirmacao;
    WebElement item = driver.findElement(element);
    wait(element);
    if (!item.isDisplayed()) {
      System.out.println("Compra não esta na lista de compra");
    }
  }
}
