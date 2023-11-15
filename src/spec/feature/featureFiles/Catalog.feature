@catalog
Feature: Gestion du catalog
En tant qu utilisateur je souhaite chercher un produit 


Background: 
  Given Je me connecte sur l application nopecommerce
    When Je saisis l mail "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton login

  @chercher_Produit
  Scenario: je souhaite chercher un produit dans catalogue
  When Je clique sur catalogue
  And Je clique sur products
  And Je saisis product name "Lenovo"
  And Je clique sur search
  Then la liste de recherche s affiche 
  
  @add_categories
  Scenario: je souhaite ajouter une categorie
  When Je clique sur catalogue
  And je clique sur categories 
  And je clique sur le boutton addNew
  And je saisie le name "PC"
  And je saisis la description "texte" 
  And je selectionne "Computers"
  And je telecharge l image "C:\\Users\\mlamine\\Desktop\\FormationSelenium\\image1.png"
  And je clique sur boutton Save
  Then le produit est ajouté "successfully"
  
  