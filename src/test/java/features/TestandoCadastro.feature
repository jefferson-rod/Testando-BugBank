#language: pt

Funcionalidade: testando login bugbank

  Cenário: deve cadastrar com sucesso

    Dado que o usuario esta na tela de cadastro
    Quando preencher o campo email, senha, clicar em registrar
    E confirmar senha,preencher o campo nome, clicar em opção com saldo e clicar em cadastrar
    Entao deve receber mensagem a conta foi criada com sucesso
