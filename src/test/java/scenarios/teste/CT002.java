package scenarios.teste;

import org.junit.Before;
import org.junit.Test;

import page.CarrinhoPage;
import page.CompraPage;
import page.HomePage;

public class CT002 extends BaseTest {
  HomePage home;
  CompraPage compra;
  CarrinhoPage carrinho;
  
  @Before
  public void beforeTest() {
    home = new HomePage(driver);
    compra = new CompraPage(driver);
    carrinho = new CarrinhoPage(driver);
  }
  
  @Test
  public void testeCT002() {
    home.navegar("http://automationpractice.com/index.php");
    home.clicarItem("Faded Short Sleeve T-shirts");
    home.clicarAddCar();
    home.verificarItemAdd("Product successfully added to your shopping cart");
    home.botao("Proceed to checkout");
    home.botao("Proceed to checkout");
    compra.preecherCampos("email", "teste@gamil.com");
    compra.preecherCampos("passwd", "123456789");
    compra.botao("Sign in");
    compra.verificarDadosEndereco("Teste CT");
    compra.verificarDadosEndereco("Teste");
    compra.botao("Proceed to checkout");
    compra.clicarCheckBox("cgv");
    compra.botao("Proceed to checkout");
    compra.clicarItem("Pay by bank wire (order processing will be longer");
    compra.botao("I confirm my order");
    compra.verificarStatusCompra("");
  }
}
