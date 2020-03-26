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
  
  public void clicarAddCar() {
    click(maps.createSpanByText("Add to cart"));
  }
  
  public void verificarItemAdd(String campo) {
    By element = maps.createTittleByText(campo);
    WebElement item = driver.findElement(element);
    wait(element);
    if (!item.isDisplayed()) {
      System.out.println("Compra não esta no carrinho");
    }
  }
}
