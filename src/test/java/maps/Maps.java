package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page.BasePage;

public class Maps {
  
  public By campoConfirmacao = By.xpath("//strong[.='Your order on My Store is complete.']");
  
  public By createLinkByText(String nome) {
    return By.xpath("//a[contains(.,'" + nome + "')]");
  }
  
  public By createSpanByText(String nome) {
    return By.xpath("(//span[contains(.,'" + nome + "')])[last()]");
  }
  
  public By createTittleByText(String nome) {
    return By.xpath("//h2[contains(.,'" + nome + "')]");
  }
  
  public By createLiByText(String nome) {
    return By.xpath("(//li[contains(.,'" + nome + "')])[last()]");
  }
  
  public By createDivByInput(String nome) {
    return By.xpath("//input[@id='" + nome + "']");
  }
}
