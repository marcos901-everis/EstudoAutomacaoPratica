package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class maps {
  protected WebElement campoItem(WebDriver driver, String nome) {
    WebElement item = driver.findElement(By.xpath("//a[contains(.,'" + nome + "')]"));
    return item;
  }
  protected WebElement botaoAddCar(WebDriver driver, String nome) {
    WebElement item1 = driver.findElement(By.xpath("//span[contains(.,'" + nome + "')]"));
    return item1;
  }
  protected WebElement campoItemAdd(WebDriver driver, String nome) {
    WebElement item2 = driver.findElement(By.xpath("//h2[contains(.,'" + nome + "')]"));
    return item2;
  }
}
