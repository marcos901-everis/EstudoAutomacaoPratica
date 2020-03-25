package scenarios.teste;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;

public class CT002 extends HomePage {
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
  public void CT002() throws InterruptedException {
    iniciarAcesso(driver, "http://automationpractice.com/index.php");
    clicarItem(driver, "Faded Short Sleeve T-shirts");
    Thread.sleep(1000);
    clicarAddCar(driver);
    Thread.sleep(1000);
    verificarItemAdd(driver, "Product successfully added to your shopping cart");
    botao(driver, "Proceed to checkout");
    Thread.sleep(1000);
    botao(driver, "Proceed to checkout");
    preecherCampos(driver, "email", "teste@gamil.com");
    preecherCampos(driver, "passwd", "123456789");
    botao(driver, "Sign in");
    verificarDadosEndereco(driver, "Teste CT");
    verificarDadosEndereco(driver, "Teste");
    Thread.sleep(1000);
    botao(driver, "Proceed to checkout");
    clicarCheckBox(driver, "cgv");
    botao(driver, "Proceed to checkout");
    clicarItem(driver, "Pay by bank wire (order processing will be longer");
    Thread.sleep(1000);
    botao(driver, "I confirm my order");
    verificarCompraFinalizada(driver);
  }
  
  @AfterClass
  public static void tearDownTest() {
    driver.quit();
  }
}
