Feature: Create new Process

  Background:
    Given the user is on Agapito server page
    And the user clicks on  Process menu

  Scenario Outline: create new process valid with consult next #<descricao>

    And the user clicks on <tipoBotao>
    And the user fills vara equal "<vara>"
    And the user fills numero processo equal "<numeroProcesso>"
    And the user fills natureza equal "<natureza>"
    And the user fills partes equal "<partes>"
    And the user fills urgente equal "<urgente>"
    And the user fills arbitragem equal "<arbitragem>"
    And the user fills assistente social equal "<assistenteSocial>"
    And the user fills data entrada equal "<dataEntrada>"
    And the user fills data saida equal "<dataSaida>"
    And the user fills data agendamento equal "<dataAgendamento>"
    And the user fills status equal "<status>"
    And the user fills observacao equal "<observacao>"
    When the user clicks on <botaoStatus>
    Then the user should see "<mensagem>" into success page


    And the user clicks on  return button
    And the user clicks on Load Process button
    Then the user should see into get page

    And the user clicks on  return button
    And the user clicks on Update Process button
    And the user fills vara equal "Nova Vara"
    And the user fills observacao equal "Foi atualizada com sucesso!!!"
    When the user clicks on Save button
    Then the user should see "Processo atualizado com sucesso." into success page

    And the user clicks on  return button
    And the user clicks on Delete Process button



    Examples:
      | descricao                | tipoBotao          | vara  | numeroProcesso | natureza | partes       | urgente | arbitragem | assistenteSocial | dataEntrada | dataSaida  | dataAgendamento | status     | observacao | botaoStatus | mensagem                         |
      | Create new process valid | new Process button | teste | 11223          | 3        | João X Mária | S       | Sim        | Joana Dark       | 25/12/2019  | 01/01/2020 | 01/05/2019      | Complicado | Teste      | Save button | Processo foi criado com sucesso. |

#    Scenario: create new process valid with consult next
 #     And the user clicks on Load Process button
  #    Then the user should see into get page


#  Scenario: Update process valid
#    And the user clicks on Update Process button
#    And the user fills vara equal "Nova Vara"
#    And the user fills observacao equal "Foi atualizada com sucesso!!!"
#    When the user clicks on Save button
#    Then the user should see "Processo atualizado com sucesso." into success page
