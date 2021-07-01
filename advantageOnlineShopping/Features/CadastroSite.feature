#language: pt
Funcionalidade: Cadastro no site
		
@C001_CT01 
  Cenario: Cadastro com usuario inapropriado
    Dado que preencho o cadastro com menos caracteres que o exigido no campo usuario "yur"
    Entao valido mensagem de obrigatoriedade do campo

@C001_CT02 
  Cenario: Cadastro com email inapropriado
    Dado que preencho o cadastro com o email "teste"
    Entao valido mensagem de formato incorreto no campo email

@C001_CT03 
  Cenario: Cadastro com senha inapropriado
    Dado que preencho o cadastro com a senha "olaaa"
    Entao valido mensagem de letra maiuscula obrigatoria

@C001_CT04 
  Cenario: Cadastro com confirmacao de senha errada
    Dado que preencho o cadastro com senha "Teste123" e confirmacao de senha "Teste"
    Entao valido mensagem de senha diferentes
    
@C001_CT05
  Cenario: Cadastro com sucesso
    Dado que faco o cadastro com username, email, password e confirmacao de password no sistema com as credenciais "yuri.melo" e "teste@mail.com" e "Rayquaza101" e "Rayquaza101"
    Quando aceito os termos e clico no botao Registrar
    Entao valido que estou logado
    