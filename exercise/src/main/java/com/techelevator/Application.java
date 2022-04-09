package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TElog;

import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		try {

			TElog.log("Search application started.");// Step Two: Create TELog, and log the start of the application.
			//
			
			
			
			SearchDomain dataSearch = new SearchDomain("exercise/data");
			TElog.log(dataSearch.toString());// Step Four: Instantiate a Search Domain
			//
			
			
			
			//SearchEngine sE = new SearchEngine(dataSearch);
			//sE.indexFiles();
			// Step Six: Single word search
			//
			SearchEngine sE = new SearchEngine(dataSearch);
			sE.indexFiles();
			sE.search("squirrel");// Step Six: Single word search

			Scanner search = new Scanner(System.in);
			System.out.println("Please enter a word to search?");
			String wordToSearch = search.nextLine();
			List<String> words = sE.search(wordToSearch);

			if (words.size() > 0) {
				for (String string : words) {
					System.out.println(string);
				}
			} else{
				System.out.println("No matching files found.");
			}


			
			
			// Step Seven: Multiple word search
			//
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
