package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunBase;
import runner.RunCucumberTest;
import support.Utils;

import static support.Utils.esperarElementoSerPresente;

public class LoginPage extends RunCucumberTest {

    private static By botao_cadastro = By.linkText("Cadastro");

    public static void acessarPaginaInicial() {
        getDriver().get("http://automationpratice.com.br/");
        esperarElementoSerPresente(botao_cadastro, 5);
    }

    public static void clicarNoBotaoCadastro() {
        getDriver().findElement(botao_cadastro).click();
    }
}