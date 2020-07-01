#encoding: utf-8
#language: pt

@cadastro
Funcionalidade: Preencher Formulário
  Eu como usuário, gostaria de acessar o sistema e efetuar o preenchimento do formulário de cadastro.


  Cenário: Acessar menu forms
    Dado que estou na tela inicial do sistema
    Quando clico no menu Forms
    Então tela de Forms é exibida

  Cenário: Preencher formulário de cadastro
    Dado que estou na tela de formulário
    Quando preencho com minhas informações "Maycon","Sozua","maycon.souza@gmail.com","male","16981373131","<data_nasc>","English","Sports","Rua dos Testes, 123","NCR","Noida"
    E clico no botão submit
    Então mensagem de confirmação de envio é exibida
