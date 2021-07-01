package page;

import static util.EvidenceManager.GerarEvidencia;

import core.BasePage;
import core.Elemento;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;


public class LoginPage extends BasePage {
	private Elemento menuUser = new Elemento(getDriver(), "xpath", "//a[@id='hrefUserIcon']//*[local-name()='svg']");	
	private Elemento inputUser = new Elemento(getDriver(), "xpath", "//input[@name='username']");
	private Elemento inputSenha = new Elemento(getDriver(), "xpath", "//input[@name='password']");
	private Elemento buttonLogin = new Elemento(getDriver(), "xpath", "//button[normalize-space()='SIGN IN']");
	private Elemento mensagemUsername = new Elemento(getDriver(), "xpath", "//label[normalize-space()='Username field is required']");
	private Elemento labelConfirmarSucesso = new Elemento(getDriver(), "xpath", "//span[@class='hi-user containMiniTitle ng-binding']");
	private Elemento labelConfirmarErro = new Elemento(getDriver(), "xpath", "//label[normalize-space()='Incorrect user name or password.']");
	
	
	@Dado("que faco o login com a credencial, senha {string}")
	public void loginSenha(String senha) throws Exception {
		navegar("https://advantageonlineshopping.com/#/");
		esperarElemento(menuUser, BIG);
		GerarEvidencia("Tela inicial do site");
		clicar(menuUser);
		Thread.sleep(3000);
		escrever(inputSenha, senha);
		clicar(buttonLogin);
	}


	@Entao("a mensagem de campo username obrigatorio")
	public void validarUsername() throws Exception {
		validarElemento(mensagemUsername);
		GerarEvidencia("Mensagem de falha");
	}

	@Dado("que faco o login com as credenciais, usuario {string} e senha {string}")
	public void login(String user, String senha) throws Exception {
		navegar("https://advantageonlineshopping.com/#/");
		esperarElemento(menuUser, BIG);
		GerarEvidencia("Tela inicial do site");
		clicar(menuUser);
		Thread.sleep(3000);
		escrever(inputUser, user);
		escrever(inputSenha, senha);
		clicar(buttonLogin);
	}


	@Entao("valido mensagem de usuario ou senha incorreta")
	public void loginIncorreto() throws Exception {
		validarElemento(labelConfirmarErro);
		GerarEvidencia("Mensagem de falha");
	}
	
	@Dado("que realizo login com as credenciais, usuario {string} e senha {string}")
	public void loginSucesso(String user, String senha) throws Exception {
		navegar("https://advantageonlineshopping.com/#/");
		esperarElemento(menuUser, BIG);
		GerarEvidencia("Tela inicial do site");
		clicar(menuUser);
		Thread.sleep(3000);
		escrever(inputUser, user);
		escrever(inputSenha, senha);
		clicar(buttonLogin);
	}


	@Entao("valido login com sucesso")
	public void validarLogin() throws Exception {
		Thread.sleep(1000);
		validarElemento(labelConfirmarSucesso);
		GerarEvidencia("Mensagem de falha");
	}
	
}