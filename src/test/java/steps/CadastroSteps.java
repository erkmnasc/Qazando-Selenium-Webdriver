package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    @Quando("^preencho todos os campos obrigatorios$")
    public void preencho_o_formulario_de_cadastro() {
        cadastroPage.preenchoOsDadosDeCadastro();
    }

    @Quando("^clico em cadastrar$")
    public void clico_em_cadastrar() {
        cadastroPage.clicarNoBotaoCadastrar();
    }

    @E("^vejo mensagem de usuário cadastrado com sucesso$")
    public void visualizo_a_mensagem_de_cadastro_realizado_com_sucesso() {
        cadastroPage.visualizoMensagemDeCadastroRealizado();
    }

    @Então("^clico no botão Ok$")
    public void clico_no_botão_Ok() {
        cadastroPage.clicarNoBotaoOK();
    }
  }