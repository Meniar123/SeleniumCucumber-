@authentification
Feature: Je souhaite vérifier la page de connexion
  En tant que utilisateur je souhaite vérifier la page de connexion

  @authentification-valid
  Scenario: Je souhaite vérifier la page de connexion
    Given Je me connecte sur l application nopecommerce
    When Je saisis l mail "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "Dashboard"

  
    
    @authentification-invalid
  Scenario: Je souhaite vérifier la page de connexion
    Given Je me connecte sur l application nopecommerce
    When Je saisis l mail "minyar@hmail.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton login
    Then Je verifie le message d erreur "Login was unsuccessful. Please correct the errors and try again. No customer account found"
    
    @logout
  Scenario: Je souhaite me deconnecter
    Given Je me connecte sur l application nopecommerce
    When Je saisis l mail "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton login
    When Je clique sur logout
    