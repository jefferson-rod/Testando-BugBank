package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestandoCadastrosSteps {

    WebDriver driver;
    @Before
    public void inicio(){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void finaliza(){

        driver.quit();

    }

   @Dado("que o usuario esta na tela de cadastrar")
   public void que_o_usuario_esta_na_tela_de_cadastrar() {

      driver.get("https://bugbank.netlify.app/");

   }

   @Quando("preencher o campo email com {string}, senha com {string} , clicar em registrar")
   public void preencher_o_campo_email_com_senha_com_clicar_em_registrar(String email, String senha) {

      driver.findElement(By.id("inputEmail")).sendKeys(email);
      driver.findElement(By.id("inputPassword")).sendKeys(senha);
      driver.findElement(By.id("btnRegister")).click();

   }

   @Quando("preencher o campo confirmar senha com {string} e name com {string}")
   public void preencher_o_campo_confirmar_senha_com_e_name_com(String senha, String name) {

       driver.findElement(By.id("inputPasswordConfirmation")).sendKeys(senha);
       driver.findElement(By.id("inputName")).sendKeys(name);
       driver.findElement(By.id("toggleAddBalance")).click();
       driver.findElement(By.id("btnRegister")).click();

   }

   @Entao("deve receber a mensagem a conta foi criada com sucesso")
   public void deve_receber_a_mensagem_a_conta_foi_criada_com_sucesso() {

       Assert.assertTrue(driver.findElement(By.id("modalText")).getText().contains("foi criada com sucesso"));

   }

}
