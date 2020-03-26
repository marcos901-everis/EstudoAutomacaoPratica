package maps;

import org.openqa.selenium.By;

public class Maps {
  public By campoDelete = By.xpath("//i[@class='icon-trash']");
  public By campoConfirmarDelete = By.xpath("//p[@class='alert alert-warning']");
  
  public By createSpanByText(String campo) {
    return By.xpath("(//span[contains(text(),'" + campo + "')])[last()]");
  }
  
  public By createTittleByText(String campo) {
    return By.xpath("//h2[contains(.,'" + campo + "')]");
  }
  
  public By createLiByText(String campo) {
    return By.xpath("(//li[contains(text(),'" + campo + "')])[last()]");
  }
  
  public By createDivByInput(String campo) {
    return By.xpath("//input[@id='" + campo + "']");
  }
  
  public By createStrong(String campo) {
    return By.xpath("//strong[text()='" + campo + "']");
  }
  
  public By createLinkByText(String campo) {
    return By.xpath("//a[contains(text(),'" + campo + "')]");
  }
}
