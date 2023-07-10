# language: pt

  @cadastro_de_usuario
  Funcionalidade: Cadastro de usuário
    Eu como usuário do sistema
    Quero me cadastrar
    Para finalizar uma compra no site

    @cadastro_usuario_sucesso
    Cenário: Nome do usuário vazio
      Dado que estou na pagina inicial
      E clico no botao cadastro
      Quando preencho todos os campos obrigatorios
      E clico em cadastrar
      E vejo mensagem de usuário cadastrado com sucesso
      Então clico no botão Ok