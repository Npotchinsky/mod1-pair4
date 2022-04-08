package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TElog;

public class Application {

	public static void main(String[] args) {
		
		try {

			TElog.log("Search application started.");// Step Two: Create TELog, and log the start of the application.
			//
			
			
			
			SearchDomain dataSearch = new SearchDomain("exercise/data");
			TElog.log(dataSearch.toString());// Step Four: Instantiate a Search Domain
			//
			
			
			
			SearchEngine sE = new SearchEngine(dataSearch);
			sE.indexFiles();
			sE.search("squirrel");// Step Six: Single word search
			//

			
			
			// Step Seven: Multiple word search
			//
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
