Feature: Login

  Scenario: Usuario com login valido
    Given Usuario navega para pagina de login
    When Entra o username "leticia"
    And Entra o password "lelele"
    And Clica no botao login
    Then A mensagem "Login com sucesso" aparece na pagina