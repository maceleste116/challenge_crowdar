Feature: Ingresar Cliente Tienda


  Scenario Outline: Ingresar cliente a tienda con credencial correcta
    Given cliente quiere ir a home tienda
    When cliente ingresa <username> <passwd> en home tienda correctamente
    Then cliente ingresa a tienda
    Examples:
      | username                | passwd      |
      | standard_user           |secret_sauce |
      | problem_user            |secret_sauce |
      | performance_glitch_user |secret_sauce |


  Scenario Outline: Ingresar cliente a tienda con credencial incorrecta
    Given cliente quiere ir a home tienda
    When cliente ingresa <username> <passwd> en home tienda incorrectamente
    Then cliente no ingresa a tienda
    Examples:
      | username                | passwd         |
      | standard_user_01        |secret_sauce    |
      | performance_glitch_user |secret_sauce_01 |

