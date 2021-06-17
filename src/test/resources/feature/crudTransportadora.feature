@crudTransportadora
Feature: crud transportadora

  Scenario Outline: Criar Transportadora
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cadastro
    And clico no botao Transportadora
    And clico no botao Nova Transportadora
    And preencho o campo Codigo Externo "<CodigoExterno>"
    And preencho o campo Nome "<Nome>"
    And preencho o campo Descricao "<Descricao>"
    When clico no botao salvar
    Then validar a mensagem de sucesso "<mensagemSucesso>"

    Examples:
        |CodigoExterno |Nome   |Descricao |mensagemSucesso                   |
        |0101          |ateste |teste     |Transportadora Salva com Sucesso! |

  Scenario Outline: Alterar Transportadora
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cadastro
    And clico no botao Transportadora
    And clico no botao Alterar
    And preencho o campo Nome "<Nome>"
    And preencho o campo Descricao "<Descricao>"
    When clico no botao atualizar
    Then validar a mensagem de sucesso "<mensagemSucesso>"

    Examples:
      |Nome     |Descricao |mensagemSucesso                        |
      |areteste |testealt  |Transportadora Atualizada com Sucesso! |

  Scenario Outline: Consultar Transportadora
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cadastro
    And clico no botao Transportadora
    And validar o campo Codigo Externo "<CodigoExterno>"
    When validar o campo Nome "<Nome>"
    Then validar o campo Descricao "<Descricao>"

    Examples:
      |CodigoExterno |Nome     |Descricao |
      |0101          |areteste |testealt  |

  Scenario Outline: Excluir Transportadora
    Given que estou na tela inicial do sistema cockpit
    And realizo o login
    And clico no botao Contigencia
    And clico no botao cadastro
    And clico no botao Transportadora
    And clicar no botao Excluir
    And validar mensagem de confirmacao "<mensagemConfirmacao>"
    When clicar no botao Excluir de confirmacao
    Then validar mensagem de sucesso excluir "<mensagemSucessoExclusao>"

    Examples:
      |mensagemConfirmacao                               |mensagemSucessoExclusao              |
      |Deseja Mesmo Deletar a Transportadora Transfolha? |Transportadora Excluída com Sucesso! |