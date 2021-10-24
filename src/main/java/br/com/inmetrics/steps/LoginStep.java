package br.com.inmetrics.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//import org.junit.Before;

import br.com.inmetrics.cor.DriverFactory;
import br.com.inmetrics.page.FuncionarioListPage;
import br.com.inmetrics.page.LoginPage;
//import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginStep {

	private LoginPage loginPage;
	private FuncionarioListPage funcionarioListPage;

	@Dado("^que eu tenha acesso ao sistema$")
	public void queEuTenhaAcessoAoSistema() throws Throwable {
		DriverFactory.getDriver().get(DriverFactory.url);
	}

	@Quando("^informar meu usuario \"([^\"]*)\"$")
	public void informarMeuUsuario(String arg1) throws Throwable {
		loginPage = new LoginPage();
		loginPage.setUsuario(arg1);
	}

	@E("^informar minha senha \"([^\"]*)\"$")
	public void informarMinhaSenha(String arg1) throws Throwable {
		loginPage.setSenha(arg1);
	}

	@E("^clicar no botao entre$")
	public void clicarNoBotaoEntre() throws Throwable {
		loginPage.clicarBotaoEntre();
	}

	@Entao("^deve abrir a pagina de cadastro de funcionarios$")
	public void deveAbrirAPaginaDeCadastroDeFuncionarios() throws Throwable {

		funcionarioListPage = new FuncionarioListPage();
		assertEquals("NOVO FUNCIONÁRIO", funcionarioListPage.getLinkNovoFuncionario());
	}

	@Entao("^deve apresentar mensagem \"([^\"]*)\"$")
	public void deve_apresentar_mensagem(String arg1) throws Throwable {
		assertTrue(loginPage.getMensagemErro().contains(arg1));
	}

}
