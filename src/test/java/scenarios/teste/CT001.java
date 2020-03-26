package scenarios.teste;

import page.CarrinhoPage;
import page.HomePage;

import org.junit.Before;
import org.junit.Test;

public class CT001 extends BaseTest {
  HomePage home;
  CarrinhoPage carrinho;
  
  @Before
  public void beforeTest() {
    home = new HomePage(driver);
    carrinho = new CarrinhoPage(driver);
  }
  
  @Test
  public void testaTituloDaPagina() throws InterruptedException {
    home.navegar("http://automationpractice.com/index.php");
    home.clicarItem("Faded Short Sleeve T-shirts");
    home.clicarAddCar();
    home.verificarItemAdd("Product successfully added to your shopping cart");
    home.botao("Proceed to checkout");
    carrinho.ClicarDelete();
    carrinho.verificarCompraExcluida();
  }
}
