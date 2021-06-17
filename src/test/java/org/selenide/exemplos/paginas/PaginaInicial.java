package org.selenide.exemplos.paginas;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PaginaInicial {


    public PaginaInicial navegar() throws InterruptedException{
        open("http://localhost:3000");
        return this;
    }

    public void login() throws InterruptedException {
        $(byXpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div/div[1]/form/div[1]/div/div[1]/div[1]/input")).shouldBe(visible).sendKeys("broker.admin");
        $(byXpath("//*[@id='password']")).shouldBe(visible).sendKeys("broker@admin2021");
        $(byXpath("/html/body/div[1]/div/div/div/main/div/div/div/div/div/div[2]/button/div")).shouldBe(visible).click();
    }

    public void clicarBotaoContingencia() {
        $(byXpath("/html/body/div[1]/div/div/div/div[3]/aside[1]/section/div[1]/div[2]/div[1]")).shouldBe(visible).click();
    }

    public void clicarBotaoCadastro() throws InterruptedException {
        $(byXpath("//*[@id='appDrawer']/section/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div")).shouldBe(visible).click();
    }

    public void clicarBotaoTransportadora() {
        $(byXpath("//*[@id='appDrawer']/section/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a/div[1]/div")).shouldBe(visible).click();
    }

    public void clicarBotaoNovaTrans() {

        $(byXpath("/html/body/div[1]/div/div/div/div[5]/main/div/div[2]/div/div[1]/div/div/div/nav/div/button")).shouldBe(visible).click();
    }

    public void preencherCampoCodExterno(String codExterno) {
        $(byXpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[1]/div/input")).shouldBe(visible).sendKeys(codExterno);
    }

    public void preencherCampoNome(String nome) {
        $(byXpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[1]/div/input")).shouldBe(visible).sendKeys(nome);
    }

    public void preencherCampoDescricao(String descricao) {
        $(byXpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/div/div/div[3]/div/div[1]/div/input")).shouldBe(visible).sendKeys(descricao);
    }

    public void clicarBotaoSalvar(){
        $(byXpath("/html/body/div[1]/div/div/div/div[3]/div/div/nav/div/div[3]/button[2]")).shouldBe(visible).click();
    }

    public void clicarBotaoAlterar(){
        $(byXpath("/html/body/div[1]/div/div/div/div[5]/main/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[5]/button[1]")).shouldBe(visible).click();
    }

    public void clicarBotaoExcluir(){
        $(byXpath("/html/body/div[1]/div/div/div/div[5]/main/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[5]/button[2]")).shouldBe(visible).click();
    }

    public void clicarBotaoAtualizar(){
        $(byXpath("/html/body/div[1]/div/div/div/div[3]/div/div/nav/div/div[3]/button[2]")).shouldBe(visible).click();
    }

    public void clicarBotaoExcluirConfirmacao(){
        $(byXpath("/html/body/div[3]/div/div[3]/button[3]")).shouldBe(visible).click();
    }

    public String mensagemSucesso(String msg) {
        return $(byXpath("/html/body/div[4]/div[2]/p")).shouldBe(visible).getText();
    }

    public String validarCampoCodExterno(String codExterno) {
        return $(byXpath("/html/body/div[1]/div/div/div/div[5]/main/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[2]")).shouldBe(visible).getText();
    }

    public String validarCampoNome(String nome) {
        return $(byXpath("/html/body/div[1]/div/div/div/div[5]/main/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[3]")).shouldBe(visible).getText();
    }

    public String validarCampoDescricao(String descricao) {
        return $(byXpath("/html/body/div[1]/div/div/div/div[5]/main/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[4]")).shouldBe(visible).getText();
    }

    public String mensagemConfirmacao(String msg) {
        return $(byXpath("//*[@id='swal2-title']")).shouldBe(visible).getText();
    }

    public String mensagemSucessoExcluir(String msg) {
        return $(byXpath("/html/body/div[4]/div[2]/p")).shouldBe(visible).getText();
    }
}