package org.coding;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.locators.CreateaccountLocator;
import org.seleniummethods.Commonaction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateAccount extends Commonaction{
	
	CreateaccountLocator lo = new CreateaccountLocator();
	Commonaction ca= new Commonaction();
	Exceldata ee=new Exceldata();
	
	
	@Given("Launch chromebrowser")
	public void launch_chromebrowser() {
	}
	
	@Then("Click on Createaccount button")
	public void click_on_Createaccount_button() throws InterruptedException, FileNotFoundException, IOException {
	   ca.submit(lo.getCreateacc());
	   ca.passvalue(lo.getFirstname(), ee.datavalues(1));
	   ca.passvalue(lo.getLastname(), ee.datavalues(2));
	   ca.passvalue(lo.getEmail(), ee.datavalues(3));
	   ca.passvalue(lo.getPwd(), ee.datavalues(4));
	   
	   ca.submit(lo.getYesradiobtn());
	   ca.passvalue(lo.getCmpny(), "india");
	   ca.passvalue(lo.getCity(), "chennai");
	   ca.submit(lo.getCountry());
	   ca.jscript(lo.getSrilanka());
	   ca.submit(lo.getSrilanka());
	   
	   ca.submit(lo.getSubmitbtn());
	   
	}
	
	

@Then("Click on Createaccount button for {string}")
public void click_on_Createaccount_button_for(String country) throws InterruptedException, FileNotFoundException, IOException {
	 ca.submit(lo.getCreateacc());
	   ca.passvalue(lo.getFirstname(), ee.datavalues(1, country));
	   ca.passvalue(lo.getLastname(), ee.datavalues(2,country));
	   ca.passvalue(lo.getEmail(), ee.datavalues(3,country));
	   ca.passvalue(lo.getPwd(), ee.datavalues(4,country));
	   
	   ca.submit(lo.getYesradiobtn());
	   ca.passvalue(lo.getCmpny(), "india");
	   ca.passvalue(lo.getCity(), "chennai");
	   ca.submit(lo.getCountry());
	   ca.jscript(lo.getSrilanka());
	   ca.submit(lo.getSrilanka());
	   
	   ca.submit(lo.getSubmitbtn());
}


	@Then("bookmark the cookies")
	public void bookmark_the_cookies() throws InterruptedException {
	    d.get("https://chrome.google.com/webstore/detail/editthiscookie/fngmhnnpilhplaeedifhccceomclgfbg");
	    Thread.sleep(2000);
	    ca.submit(lo.getAddtochrome());
	    ca.acceptalert();
	}



}
