package scenarios.teste;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
  public WebDriver driver;
  
  @Before
  public void before() {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }
  
  @After
  public void afterTest() {
    try {
      driver.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
