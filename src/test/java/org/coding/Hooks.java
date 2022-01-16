package org.coding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.seleniummethods.Commonaction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonaction {
	
	Commonaction ca= new Commonaction();
	@Before // executes for all feature
	public void launch() throws FileNotFoundException, IOException
	{
		launch(ca.getproperty("url"));
	}

	@After  // executes for all feature
	public void close()
	{
		System.out.println("done");
		//d.close();
	}
}
