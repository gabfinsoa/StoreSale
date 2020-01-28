
Feature: Buy items Anacapri
  This feature deals with the login functionality of the application

  @Teste
  Scenario Outline: Buy item with Full Price Anacapri
#    Given I navigate to the Arezzo product Full Price page
    Given I select the number "39"
    And I click the buy button
    And I click the buy button on cart
    And I insert the Store Sale <username> and <password>
    When I click the continue button
    And  I select Entrega pela Loja method
    And I click the continue address button
    And I select Credit Cart pay method
    And I insert the Credit Cart number
    And I insert the Nome do Titular
    And I insert the Validade Mes
    And I insert the Validade Ano
    And I insert the Codigo de Seguranca
    And I insert the CPF do Titular
    And I click the continue Credit Cart button
    And I click the Finish Order button
    Then I get the Order Number in the Order Confirmation page
    And I go to homegape
    And I click on exit my account

    Examples:
      | username                     | password  |
      | gabriel.soares@arezzo.com.br | Arezzo123 |



