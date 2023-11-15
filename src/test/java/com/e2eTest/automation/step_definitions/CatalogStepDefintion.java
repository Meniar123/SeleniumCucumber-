package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogStepDefintion {

	private CatalogPage catalogPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;

	public CatalogStepDefintion() {
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		catalogPage = new CatalogPage();
	}

	/* TC_01 chercher product */

	@When("Je clique sur catalogue")
	public void jeCliqueSurCatalogue() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(CatalogPage.getbtnCatalog());

	}

	@When("Je clique sur products")
	public void jeCliqueSurProducts() {
		seleniumUtils.click(CatalogPage.getbtnProduct());

	}

	@When("Je saisis product name {string}")
	public void jeSaisisProductName(String productName) {
		seleniumUtils.writeText(CatalogPage.getproductName(), productName);

	}

	@When("Je clique sur search")
	public void jeCliqueSurSearch() {
		seleniumUtils.click(CatalogPage.getbtnSearch());
	}

	@Then("la liste de recherche s affiche")
	public void laListeDeRechercheSAffiche() {

	}

	/* TC_02 Ajouter categories */

	@When("je clique sur categories")
	public void jeCliqueSurCategories() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(CatalogPage.getCategories());

	}

	@And("je clique sur le boutton addNew")
	public void jeCliqueSurLeBouttonAddNew() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(CatalogPage.getAddNew());
	}

	@And("je saisie le name {string}")
	public void jeSaisieLeName(String nameCat) {
		seleniumUtils.writeText(CatalogPage.getNameCat(), nameCat);

	}

	@And("je saisis la description {string}")
	public void jeSaisisLaDescription(String TextDescription) {
		seleniumUtils.writeText(CatalogPage.getDescriptionCat(), TextDescription);
	}

	@And("je selectionne {string}")
	public void jeSelectionne(String Computers) {
		seleniumUtils.selectDropDownListByVisibleText(CatalogPage.getparentCat(), Computers);

	}
	
	@And("je telecharge l image {string}")
	public void jeTelechargeLImage(String filePath) {
		//String filePath = "C:\\Users\\mlamine\\Desktop\\FormationSelenium\\image1.png";
		seleniumUtils.writeText(CatalogPage.getUploadPicture(), filePath);   
	}

	@And("je clique sur boutton Save")
	public void jeCliqueSurBouttonSave() {
		seleniumUtils.click(CatalogPage.getBtnSave());
	}
   // Assert with contains
	@Then("le produit est ajouté {string}")
	public void leProduitEstAjouté(String texte) {
		String msgProduitAjoutee = CatalogPage.getMsgProduitAjoutee().getText();
		Assert.assertTrue(msgProduitAjoutee.contains(texte));
	}

}
