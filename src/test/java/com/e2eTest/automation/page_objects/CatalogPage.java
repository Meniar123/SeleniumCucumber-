package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CatalogPage extends BasePage{
	
 /* Retrieve Web elements */
	
	//product
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement btnCatalog;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement btnProduct;
	
	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement productName;
	
	@FindBy(how = How.ID, using = "search-products")
	private static WebElement btnSearch;
	
	// categories 
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement categories;
	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement addNew ;
	
	@FindBy(how = How.ID, using = "Name")
	private static WebElement nameCat;
	
	@FindBy(how = How.XPATH, using = "//html")
	private static WebElement descriptionCat;
	
	@FindBy(how = How.XPATH, using = "//input[@title='file input']")
	private static WebElement uploadPicture;
	
	@FindBy(how = How.ID, using = "ParentCategoryId")
	private static WebElement parentCat;
	
	//@FindBy(how = How.XPATH, using = "//input[@title='file input']")
	//private static WebElement btnUploadPicture;
		
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave;
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement msgProduitAjoutee;
	
	/* Create method */

	public CatalogPage() {
		super(Setup.getDriver());
	}

	public static WebElement getbtnCatalog() {
		return btnCatalog;
	}
		
	public static WebElement getbtnProduct() {
		return btnProduct;
	}
	
	public static WebElement getproductName(){
		return productName;	
	}
	
	public static WebElement getbtnSearch() {
		return btnSearch;
	}
	
	//categories
	
	public static WebElement getCategories() {
		return categories;
	}
	
	public static WebElement getAddNew() {
		return addNew;
	}
	public static WebElement getNameCat(){
		return nameCat;
	}
	
	public static WebElement getDescriptionCat(){
		return descriptionCat;
	}
	
	public static WebElement getUploadPicture(){
		return uploadPicture;
	}
	
	public static WebElement getparentCat(){
		return parentCat;
	}
	public static WebElement getBtnSave(){
		return btnSave;
	}
	public static WebElement getMsgProduitAjoutee(){
		return msgProduitAjoutee;
	}
	
	
	
	
	
}
