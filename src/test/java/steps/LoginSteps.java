package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na pagina inicial$")
    public void que_estou_na_pagina_incial() {
        getDriver(Browser.CHROME);
        loginPage.acessarPaginaInicial();
    }

    @Dado("^clico no botao cadastro$")
    public void clico_no_botao_de_cadastro() {
        loginPage.clicarNoBotaoCadastro();
    }
}
