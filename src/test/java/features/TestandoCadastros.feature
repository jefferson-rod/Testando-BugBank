#language: pt

Funcionalidade: testando diversos cadastros

  Esquema do Cenário: cadastrando usuario1,usuario2 e usuario3

    Dado que o usuario esta na tela de cadastrar
    Quando preencher o campo email com <email>, senha com <senha> , clicar em registrar
    E preencher o campo confirmar senha com <senha> e name com <nome>
    Entao deve receber a mensagem a conta foi criada com sucesso

    Exemplos:
      | email              | senha    | nome     |
      | "teste1@teste.com" | "123456" | "teste1" |
      | "teste2@teste.com" | "654321" | "teste2" |
      | "teste3@teste.com" | "123123" | "teste3" |

