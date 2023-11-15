@multiUsers
Feature: je souhaite vérifier la connexion avec plusieurs uilisateurs 
  ETQ je souhaite vérifier la connexion avec plusieurs utilisateurs 
  
  Background:
    Given Je me connecte sur l application nopecommerce
    
    @authentificationMultiUsers
    Scenario Outline: 
    When Je saisis l mail "<name>"
    And Je saisis le password "<value>"
    And Je clique sur le bouton login

 
    Examples: 
      | name                  | value    | 
      | admin@yourstore.com   | admin    |
      | test@yourstore.com    | test     |
      | minyar@yourstore.com  | minyar   |
      | hajer@yourstore.com   | hajer    |
