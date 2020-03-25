package scenarios.teste;

import page.HomePage;
import org.junit.Test;

public class CT001 extends BaseTest {
  
  HomePage home = new HomePage(driver);
  
  @Test
  public void testaTituloDaPagina() throws InterruptedException {
    home.navegar("http://automationpractice.com/index.php");
    home.clicarItem("Faded Short Sleeve T-shirts");
    home.clicarAddCar();
    home.verificarItemAdd("Product successfully added to your shopping cart");
  }
}
