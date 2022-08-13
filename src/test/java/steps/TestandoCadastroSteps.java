package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestandoCadastroSteps {

    WebDriver driver;

    @Before
    public void inicio() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void finaliza() {

       // driver.findElement(By.id("btnCloseModal")).click();
       WebElement botao = driver.findElement(By.xpath("//a[@id='btnCloseModal']"));
       botao.findElement(By.xpath("//a[@id='btnCloseModal']")).click();

       driver.quit();
    }


    @Dado("que o usuario esta na tela de cadastro")
    public void que_o_usuario_esta_na_tela_de_cadastro() {

        driver.get("https://bugbank.netlify.app/");
    }


    @Quando("preencher o campo email, senha, clicar em registrar")
    public void preencher_o_campo_email_senha_clicar_em_registrar() {

        driver.findElement(By.id("inputEmail")).sendKeys("jeffteste@teste.com");
        driver.findElement(By.id("inputPassword")).sendKeys("123456");
        driver.findElement(By.id("btnRegister")).click();
    }

    @Quando("confirmar senha,preencher o campo nome, clicar em opção com saldo e clicar em cadastrar")
    public void confirmar_senha_preencher_o_campo_nome_clicar_em_opção_com_saldo_e_clicar_em_cadastrar() {

        driver.findElement(By.id("inputName")).sendKeys("jeff teste1");
        driver.findElement(By.id("inputPasswordConfirmation")).sendKeys("123456");
        driver.findElement(By.id("toggleAddBalance")).click();
        driver.findElement(By.id("btnRegister")).click();

    }

    @Entao("deve receber mensagem a conta foi criada com sucesso")
    public void deve_receber_mensagem_a_conta_foi_criada_com_sucesso() {

      // Assert.assertTrue(driver.findElement(By.id("modalText")).getText().contains("foi criada com sucesso"));


    }


}
