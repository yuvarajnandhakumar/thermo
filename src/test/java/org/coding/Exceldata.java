package org.coding;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.seleniummethods.Commonaction;

public class Exceldata extends Commonaction{

	Commonaction a = new Commonaction();
	public String cellvaluee[];


	public String datavalues(int i,String countryy) throws FileNotFoundException, IOException
	{
		
		String[][] data = getData("TC001", countryy);
		//System.out.println(data);
	
		
		int c=data[0].length;
		cellvaluee=new String[c];
		int j=0;
		
		
		for (String[] alldata : data) {
			for (String onebyonedata : alldata) {
				
				if(onebyonedata!=null)
				{
					cellvaluee[j]=onebyonedata;
					j++;
				}
			}
		}
		return cellvaluee[i];
	}
	
	
	public String datavalues(int i) throws FileNotFoundException, IOException
	{
		
		String[][] data = getData("TC001", a.getproperty("country"));
		//System.out.println(data);
	
		
		int c=data[0].length;
		cellvaluee=new String[c];
		int j=0;
		
		
		for (String[] alldata : data) {
			for (String onebyonedata : alldata) {
				
				if(onebyonedata!=null)
				{
					cellvaluee[j]=onebyonedata;
					j++;
				}
			}
		}
		return cellvaluee[i];
	}
	
	
}
