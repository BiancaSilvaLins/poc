package org.selenide.exemplos.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.selenide.exemplos.paginas.PaginaInicial;

public class crudTransportadora {

    private PaginaInicial paginaInicial = new PaginaInicial();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("que estou na tela inicial do sistema cockpit")
    public void que_estou_na_tela_inicial_do_sistema_cockpit() throws InterruptedException{
        paginaInicial.navegar();
    }

    @Given("realizo o login")
    public void realizo_o_login() throws InterruptedException{
        paginaInicial.login();
    }

    @Given("clico no botao Contigencia")
    public void clico_no_botao_Contigencia() {
        paginaInicial.clicarBotaoContingencia();
    }

    @Given("clico no botao cadastro")
    public void clico_no_botao_cadastro() throws InterruptedException {
        paginaInicial.clicarBotaoCadastro();
    }

    @Given("clico no botao Transportadora")
    public void clico_no_botao_Transportadora() {
        paginaInicial.clicarBotaoTransportadora();
    }

    @Given("clico no botao Nova Transportadora")
    public void clico_no_botao_Nova_Transportadora() throws InterruptedException {
        Thread.sleep(5000);
        paginaInicial.clicarBotaoNovaTrans();
    }

    @Given("preencho o campo Codigo Externo {string}")
    public void preencho_o_campo_Codigo_Externo(String string) {
        paginaInicial.preencherCampoCodExterno(string);
    }

    @Given("preencho o campo Nome {string}")
    public void preencho_o_campo_Nome(String string) {
        paginaInicial.preencherCampoNome(string);
    }

    @Given("preencho o campo Descricao {string}")
    public void preencho_o_campo_Descricao(String string) {
        paginaInicial.preencherCampoDescricao(string);
    }

    @When("clico no botao salvar")
    public void clico_no_botao_salvar() {
        paginaInicial.clicarBotaoSalvar();
    }

    @Then("validar a mensagem de sucesso {string}")
    public void validar_a_mensagem_de_sucesso(String string) {
       Assert.assertEquals(paginaInicial.mensagemSucesso(string),string);
    }

    @Given("clico no botao Alterar")
    public void clico_no_botao_Alterar() {
       paginaInicial.clicarBotaoAlterar();
    }

    @When("clico no botao atualizar")
    public void clico_no_botao_atualizar() {
        paginaInicial.clicarBotaoAtualizar();
    }

    @Given("validar o campo Codigo Externo {string}")
    public void validar_o_campo_Codigo_Externo(String string) {
        Assert.assertEquals(paginaInicial.validarCampoCodExterno(string),string);
    }

    @When("validar o campo Nome {string}")
    public void validar_o_campo_Nome(String string) {
        Assert.assertEquals(paginaInicial.validarCampoNome(string),string);
    }

    @Then("validar o campo Descricao {string}")
    public void validar_o_campo_Descricao(String string) {
        Assert.assertEquals(paginaInicial.validarCampoDescricao(string),string);
    }

    @Given("clicar no botao Excluir")
    public void clicar_no_botao_Excluir() {
        paginaInicial.clicarBotaoExcluir();
    }

    @Given("validar mensagem de confirmacao {string}")
    public void validar_mensagem_de_confirmacao(String string) {
        Assert.assertEquals(paginaInicial.mensagemConfirmacao(string),string);
    }

    @When("clicar no botao Excluir de confirmacao")
    public void clicar_no_botao_Excluir_de_confirmacao() {
        paginaInicial.clicarBotaoExcluirConfirmacao();
    }

    @Then("validar mensagem de sucesso excluir {string}")
    public void validar_mensagem_de_sucesso_excluir(String string) {
        Assert.assertEquals(paginaInicial.mensagemSucessoExcluir(string),string);
    }
}