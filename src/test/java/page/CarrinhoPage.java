package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import maps.Maps;

public class CarrinhoPage extends BasePage {
  public CarrinhoPage(WebDriver driver) {
    super(driver);
  }
  
  Maps maps = new Maps();
  
  public void ClicarDelete() {
    click(maps.campoDelete);
  }
  
  public void verificarCompraExcluida() {
    By element = maps.campoConfirmarDelete;
    WebElement item = driver.findElement(element);
    wait(element);
    if (!item.isDisplayed()) {
      System.out.println("Compra não excluida");
    }
  }
}
