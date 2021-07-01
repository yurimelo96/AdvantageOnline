package page;

import static util.EvidenceManager.GerarEvidencia;

import core.BasePage;
import core.Elemento;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;


public class CadastroPage extends BasePage {
	private Elemento menuUser = new Elemento(getDriver(), "xpath", "//a[@id='hrefUserIcon']//*[local-name()='svg']");	
	private Elemento criarAccount = new Elemento(getDriver(), "xpath", "//a[normalize-space()='CREATE NEW ACCOUNT']");
	private Elemento inputUsername = new Elemento(getDriver(), "xpath", "//input[@name='usernameRegisterPage']");
	private Elemento inputEmail = new Elemento(getDriver(), "xpath", "//input[@name='emailRegisterPage']");
	private Elemento inputSenha = new Elemento(getDriver(), "xpath", "//input[@name='passwordRegisterPage']");
	private Elemento inputConfirmarSenha = new Elemento(getDriver(), "xpath", "//label[normalize-space()='Confirm password']");
	private Elemento inputTermos = new Elemento(getDriver(), "xpath", "//input[@name='i_agree']");
	private Elemento buttonRegister = new Elemento(getDriver(), "xpath", "//button[normalize-space()='REGISTER']");
	private Elemento labelUsernameError = new Elemento(getDriver(), "xpath", "//label[@class='animated invalid']");
	private Elemento labelEmailError = new Elemento(getDriver(), "xpath", "//label[normalize-space()='Email field is required']");
	private Elemento labelSenhaError = new Elemento(getDriver(), "xpath", "//label[normalize-space()='One upper letter required']");
	private Elemento labelConfirmarSenhaError = new Elemento(getDriver(), "xpath", "//label[normalize-space()='Passwords do not match']");
	private Elemento labelConfirmarSucesso = new Elemento(getDriver(), "xpath", "//span[@class='hi-user containMiniTitle ng-binding']");
	
	
	@Dado("que preencho o cadastro com menos caracteres que o exigido no campo usuario {string}")
	public void cadastroUsername(String user) throws Exception {
		navegar("https://advantageonlineshopping.com/#/");
		esperarElemento(menuUser, BIG);
		GerarEvidencia("Tela inicial do site");
		clicar(menuUser);
		Thread.sleep(3000);
		clicar(criarAccount);
		escrever(inputUsername, user);
		clicar(inputEmail);
	}


	@Entao("valido mensagem de obrigatoriedade do campo")
	public void validarMensagemUsername() throws Exception {
		validarElemento(labelUsernameError);
		GerarEvidencia("Mensagem de falha");
	}

	@Dado("que preencho o cadastro com o email {string}")
	public void cadastroEmail(String email) throws Exception {
		navegar("https://advantageonlineshopping.com/#/");
		esperarElemento(menuUser, BIG);
		GerarEvidencia("Tela inicial do site");
		clicar(menuUser);
		Thread.sleep(3000);
		clicar(criarAccount);
		escrever(inputEmail, email);
		clicar(inputConfirmarSenha);
	}

	@Entao("valido mensagem de formato incorreto no campo email")
	public void validarMensagemEmail() throws Exception {	
		Thread.sleep(2000);
		validarElemento(labelEmailError);
		GerarEvidencia("Mensagem de falha");
	}
	
	
	@Dado("que preencho o cadastro com a senha {string}")
	public void cadastroSenha(String pass) throws Exception {
		navegar("https://advantageonlineshopping.com/#/");
		esperarElemento(menuUser, BIG);
		GerarEvidencia("Tela inicial do site");
		clicar(menuUser);
		Thread.sleep(3000);
		clicar(criarAccount);
		escrever(inputSenha, pass);
		clicar(inputUsername);
	}

	@Entao("valido mensagem de letra maiuscula obrigatoria")
	public void validarMensagemSenha() throws Exception {	
		Thread.sleep(2000);
		validarElemento(labelSenhaError);
		GerarEvidencia("Mensagem de falha");
	}
	
	@Dado("que preencho o cadastro com senha {string} e confirmacao de senha {string}")
	public void cadastroRepetirSenha(String pass,String passConfirm) throws Exception {
		navegar("https://advantageonlineshopping.com/#/");
		esperarElemento(menuUser, BIG);
		GerarEvidencia("Tela inicial do site");
		clicar(menuUser);
		Thread.sleep(3000);
		clicar(criarAccount);
		escrever(inputSenha, pass);
		clicar(inputConfirmarSenha);
		escrever(inputConfirmarSenha, passConfirm);
	}

	@Entao("valido mensagem de senha diferentes")
	public void validarMensagemConfirmarSenha() throws Exception {
		Thread.sleep(2000);
		validarElemento(labelConfirmarSenhaError);
		GerarEvidencia("Mensagem de falha");
	}
	
	@Dado("que faco o cadastro com username, email, password e confirmacao de password no sistema com as credenciais {string} e {string} e {string} e {string}")
	public void cadastroSucesso(String user,String email,String pass,String passConfirm) throws Exception {
		navegar("https://advantageonlineshopping.com/#/");
		esperarElemento(menuUser, BIG);
		GerarEvidencia("Tela inicial do site");
		clicar(menuUser);
		Thread.sleep(3000);
		clicar(criarAccount);
		escrever(inputUsername, user);
		escrever(inputEmail, email);
		escrever(inputSenha, pass);
		clicar(inputConfirmarSenha);
		escrever(inputConfirmarSenha, passConfirm);
	}

	@Quando("aceito os termos e clico no botao Registrar")
	public void cadastrar() throws Exception {
		Thread.sleep(2000);
		GerarEvidencia("Termos Aceitos");
		clicar(inputTermos);
		clicar(buttonRegister);
	}
	
	@Entao("valido que estou logado")
	public void validarMensagemSucesso() throws Exception {
		Thread.sleep(2000);
		validarElemento(labelConfirmarSucesso);
		GerarEvidencia("Cadastro Sucesso");
}
	
}