package scenarios.teste;

import org.junit.Test;

import page.HomePage;

public class CT002 extends BaseTest {
  HomePage home = new HomePage(driver);
  
  @Test
  public void CT002() {
    home.navegar("http://automationpractice.com/index.php");
    home.clicarItem("Faded Short Sleeve T-shirts");
    home.clicarAddCar();
    home.verificarItemAdd("Product successfully added to your shopping cart");
    home.botao("Proceed to checkout");
    home.botao("Proceed to checkout");
    home.preecherCampos("email", "teste@gamil.com");
    home.preecherCampos("passwd", "123456789");
    home.botao("Sign in");
    home.verificarDadosEndereco("Teste CT");
    home.verificarDadosEndereco("Teste");
    home.botao("Proceed to checkout");
    home.clicarCheckBox("cgv");
    home.botao("Proceed to checkout");
    home.clicarItem("Pay by bank wire (order processing will be longer");
    home.botao("I confirm my order");
    home.verificarCompraFinalizada(driver);
  }
}
