package page;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Date;

import javax.print.attribute.standard.PrinterURI;

import org.hamcrest.Condition.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import maps.Maps;

public class BasePage {
  public WebDriverWait wait;
  public WebDriver driver;
  public Actions action;
  
  public BasePage(WebDriver driver) {
    this.driver = driver;
    this.action = new Actions(driver);
    this.wait = new WebDriverWait(driver, 60);
  }
  
  Maps maps = new Maps();
  
  public void navegar(String url) {
    driver.get(url);
  }
  
  public void click(By element) {
    wait(element);
    driver.findElement(element).click();
  }
  
  public void wait(By element) {
    this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
  }
  
  public void rightClick(WebElement element) {
    action.contextClick(element).perform();
  }
  
  public void confirmAlert() {
    driver.switchTo().alert().accept();
  }
  
  public void clicarItem(String campo) {
    click(maps.createLinkByText(campo));
    takeScreenshot("clicar", driver);
  }
  
  public void botao(String campo) {
    click(maps.createSpanByText(campo));
  }
  
  public static void takeScreenshot(String fileName, WebDriver driver) {
    File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    Date data = new Date();
    try {
      FileHandler.copy(scrFile, new File(fileName + data.getTime() + ".png"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
