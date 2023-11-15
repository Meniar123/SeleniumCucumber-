package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;

	public AuthentificationStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		authentificationPage = new AuthentificationPage();
		configFileReader = new ConfigFileReader();
	}
	
	/* TC_01 connexion */
	@Given("Je me connecte sur l application nopecommerce")
	public void JeMeConnecteSurLApplicationNopecommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.recette"));
	}

	@When("Je saisis l mail {string}")
	public void JeSaisisLMail(String email) {
		seleniumUtils.writeText(AuthentificationPage.getEmail(), email);
	}

	@When("Je saisis le password {string}")
	public void JeSaisisLePassword(String password) {
		seleniumUtils.writeText(AuthentificationPage.getPassword(), password);
	}

	@When("Je clique sur le bouton login")
	public void JeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(AuthentificationPage.getbtnLogin());
	}

	@Then("Je me redirige vers la page home {string}")
	public void JejeMeRedirigeVersLaPageHome(String text) {
		String message = AuthentificationPage.getdashboard().getText();
		Assert.assertEquals(message, text);

	}

	/* TC_02* Invalid */
	@Then("Je verifie le message d erreur {string}")
	public void JeVerifieLeMessageDErreur(String txt) {
		String errorMsg = AuthentificationPage.geterrorMsg().getText();
		Assert.assertEquals(errorMsg, txt);
	}

	/* TC_03* Logout */
	@When("Je clique sur logout")
	public void JeCliqueSurLogout() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(AuthentificationPage.getbtnLogout());
	}

}
