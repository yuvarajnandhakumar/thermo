package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniummethods.Commonaction;

public class CreateaccountLocator  extends Commonaction{
	
	Commonaction ca= new Commonaction();
	
	public CreateaccountLocator()
	{
		PageFactory.initElements(ca.d, this);
	}
	
	public WebElement getCreateacc() {
		return createacc;
	}

	@FindBy(xpath = "//span[text()='Create Account']")
	private WebElement createacc;
	
	@FindBy(xpath = "//input[@formcontrolname='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@formcontrolname='lastName']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement pwd;
	
	@FindBy(xpath = "//p[text()='Yes']//preceding::span[1]")
	private WebElement yesradiobtn;
	
	@FindBy(xpath = "//input[@formcontrolname='company']")
	private WebElement cmpny;
	
	@FindBy(xpath = "//input[@formcontrolname='city']")
	private WebElement city;
	
	@FindBy(xpath = "//span[text()='Sri Lanka']")
	private WebElement srilanka;
	
	@FindBy(xpath = "//span[text()='India']")
	private WebElement india;
	
	@FindBy(xpath = "//*[@id='country-dropdown']")
	private WebElement country;
	
	
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement submitbtn;

	@FindBy(xpath ="//div[text()='Add to Chrome']")
	private WebElement addtochrome;


	public WebElement getAddtochrome() {
		return addtochrome;
	}
	
	public WebElement getCountry() {
		return country;
	}
	
	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getYesradiobtn() {
		return yesradiobtn;
	}

	public WebElement getCmpny() {
		return cmpny;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getSrilanka() {
		return srilanka;
	}

	public WebElement getIndia() {
		return india;
	}
	
	
	
}
