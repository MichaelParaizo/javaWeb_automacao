$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Login",
  "description": "\r\nEu como usuario do sistema quero logar para realizar \r\nmanutencao do cadastro de funcionarios",
  "id": "login",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 9,
  "name": "Deve realizar login com sucesso",
  "description": "",
  "id": "login;deve-realizar-login-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@positivo"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que eu tenha acesso ao sistema",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "informar meu usuario \"treinamentoINM\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "informar minha senha \"123456\"",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clicar no botao entre",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "deve abrir a pagina de cadastro de funcionarios",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginStep.queEuTenhaAcessoAoSistema()"
});
formatter.result({
  "duration": 27001551500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "treinamentoINM",
      "offset": 22
    }
  ],
  "location": "LoginStep.informarMeuUsuario(String)"
});
formatter.result({
  "duration": 349810400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 22
    }
  ],
  "location": "LoginStep.informarMinhaSenha(String)"
});
formatter.result({
  "duration": 149346600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clicarNoBotaoEntre()"
});
formatter.result({
  "duration": 60888214200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.deveAbrirAPaginaDeCadastroDeFuncionarios()"
});
formatter.result({
  "duration": 536296800,
  "status": "passed"
});
});