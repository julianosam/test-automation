package com.target.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.target.Browser;
import com.target.pages.SearchPage;
import com.target.util.Reporter;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class SearchSteps {

    private SearchPage page = new SearchPage();

    @Quando("O usuario navega para pagina de busca")
    public void o_usuario_navega_para_pagina_de_busca() {
        this.page.openPage();
        Reporter.log("Abriu pagina de busca");
    }

    @Quando("Digita {string} no campo de busca")
    public void digita_no_campo_de_busca(String busca) {
        page.enterSearch(busca);
    }

    @Quando("Aperta enter no teclado")
    public void aperta_enter_no_teclado() {
        page.hitEnterOnSearch();
    }

    @Entao("A pagina com titulo {string} aparece")
    public void a_pagina_com_titulo_aparece(String tituloEsperado) {

        Browser.sleep(2000); //tava dando pau no firefox :)

        final String titulo = Browser.getTitle();

        assertEquals(tituloEsperado, titulo, "Titulo da pagina nao eh o esperado!");
    }

}
