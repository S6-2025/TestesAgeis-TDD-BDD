#language: pt

Funcionalidade: validar area de cobertura

  Cenário: Localidade válida Contagem
    Dado que o usuário esteja em uma cidade válida
    Quando informar o endereço "tanto faz" e a cidade "CONTAGEM"
    E confirmar as informações
    Então o sistema deve mostrar a mensagem "Motorista a caminho"

 # Cenário: Localidade inválida
  #  Dado que o usuário não digite Belo Horizonte ou Contagem
   # E clicar no botão de enter
  #  Então o sistema deve mostrar a mensagem "Área fora de cobertura".