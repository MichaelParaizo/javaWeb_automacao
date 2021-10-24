# language: pt

Funcionalidade: Login

 Eu como usuario do sistema quero logar para realizar 
 manutencao do cadastro de funcionarios 
 
 @positivo
 Cenario: Deve realizar login com sucesso
 	Dado que eu tenha acesso ao sistema
 	Quando informar meu usuario "treinamentoINM"
 	E informar minha senha "123456"
 	E clicar no botao entre
 	Entao deve abrir a pagina de cadastro de funcionarios
 	
 	
 	@negativo
 	Cenario: Deve realizar login com senha invalida
	 	Dado que eu tenha acesso ao sistema
	 	Quando informar meu usuario "treinamentoINM"
	 	E informar minha senha "111111"
	 	E clicar no botao entre
	 	Entao deve apresentar mensagem "ERRO!"
 	