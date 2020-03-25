package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class maps {
  protected WebElement createLinkByText(WebDriver driver, String nome) {
    WebElement item = driver.findElement(By.xpath("//a[contains(.,'" + nome + "')]"));
    return item;
  }
  
  protected WebElement createSpanByText(WebDriver driver, String nome) {
    WebElement item1 = driver.findElement(By.xpath("(//span[contains(.,'" + nome + "')])[last()]"));
    return item1;
  }
  
  protected WebElement createTittleByText(WebDriver driver, String nome) {
    WebElement item2 = driver.findElement(By.xpath("//h2[contains(.,'" + nome + "')]"));
    return item2;
  }
  
  protected WebElement createLiByText(WebDriver driver, String nome) {
    WebElement item2 = driver.findElement(By.xpath("(//li[contains(.,'" + nome + "')])[last()]"));
    return item2;
  }
  
  protected WebElement createDivByInput(WebDriver driver, String nome) {
    WebElement item2 = driver.findElement(By.xpath("//input[@id='" + nome + "']"));
    return item2;
  }
  protected WebElement campoCampoFinalizado(WebDriver driver) {
    WebElement item2 = driver.findElement(By.xpath("//strong[.='Your order on My Store is complete.']"));
    return item2;
  }
  

}
