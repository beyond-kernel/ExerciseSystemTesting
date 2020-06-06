Feature: Create new Process
  Scenario: Create new process valid

    Given the user is on Agapito server page
    And the user clicks on  Process menu
    And the user clicks on new Process button
    And the user fills vara equal "18011"
    And the user fills numero processo equal "11223"
    And the user fills natureza equal "3"
    And the user fills partes equal "João X Mária"
    And the user fills urgente equal "S"
    And the user fills arbitragem equal "Sim"
    And the user fills assistente social equal "Joana Dark"
    And the user fills data entrada equal "25/12/2019"
    And the user fills data saida equal "01/01/2020"
    And the user fills data agendamento equal "01/05/2019"
    And the user fills status equal "Complicado"
    And the user fills observacao equal "Teste"
    When the user clicks on Save button
    Then the user should see "Processo foi criado com sucesso." into success page



