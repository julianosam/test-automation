# language: pt
Funcionalidade: Search

  Cenario: Busca leticia no google
    Quando O usuario navega para pagina de busca
    E Digita "leticia" no campo de busca
    E Aperta enter no teclado
    Entao A pagina com titulo "leticia - Google Search" aparece
  