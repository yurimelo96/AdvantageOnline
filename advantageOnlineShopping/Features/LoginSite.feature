#language: pt
Funcionalidade: Login no site
	
	@C002_CT01
  Cenario: Username obrigatorio
    Dado que faco o login com a credencial, senha "testeE"
    Entao a mensagem de campo username obrigatorio

@C002_CT02
  Cenario: Login com erro
    Dado que faco o login com as credenciais, usuario "yurii" e senha "testeE"
    Entao valido mensagem de usuario ou senha incorreta
    
  @C002_CT03
  Cenario: Login com sucesso
    Dado que realizo login com as credenciais, usuario "yuri.melo" e senha "Rayquaza101"
    Entao valido login com sucesso