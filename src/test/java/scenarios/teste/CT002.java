package scenarios.teste;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;

public class CT002 extends HomePage{
  private static WebDriver driver;
  
  @BeforeClass
  public static void setUpTest() {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");
  }
  
  @Before
  public void before() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }
  
  @Test
  public void testaTituloDaPagina() throws InterruptedException {
    iniciarAcesso(driver, "http://automationpractice.com/index.php");
    clicarItem(driver, "Faded Short Sleeve T-shirts");
    clicarAddCar(driver);
    // Thread.sleep(10000);
    verificarItemAdd(driver, "Product successfully added to your shopping cart");
  }
  
  @AfterClass
  public static void tearDownTest() {
    driver.quit();
  }
}
