package com.target.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.target.Browser;
import com.target.pages.LoginPage;
import com.target.util.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    @Given("Usuario navega para pagina de login")
    public void usuario_navega_para_pagina_de_login() {
        this.loginPage.openPage();
        Reporter.log("Ta na pagina de login");
    }

    @When("Entra o username {string}")
    public void entra_o_username(String userName) {
        this.loginPage.setUserName(userName);
    }

    @When("Entra o password {string}")
    public void entra_o_password(String password) {
        this.loginPage.setPassword(password);
    }

    @When("Clica no botao login")
    public void clica_no_botao_login() {
        this.loginPage.clickLoginButton();
    }

    @Then("A pagina com titulo {string} e carregada")
    public void a_pagina_com_titulo_e_carregada(String titulo) {

        final String title = Browser.getTitle();

        assertEquals(titulo, title, "Titulo da pagina nao eh o esperado!");

    }

}
