package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import maps.Maps;

public class CompraPage extends BasePage {
  public CompraPage(WebDriver driver) {
    super(driver);
  }
  
  Maps maps = new Maps();
  
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
  
  public void verificarStatusCompra(String campo) {
    By element = maps.createStrong(campo);
    WebElement item = driver.findElement(element);
    wait(element);
    if (!item.isDisplayed()) {
      System.out.println("Compra não esta na lista de compra");
    }
  }
}
