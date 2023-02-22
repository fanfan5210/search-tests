package com.ajc.kata4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchFunctionality {
	
	public static final int MIN_LENGHTH_SEARCHTEXT = 2;
	public String[] cities = {"Paris", "Budapest", "Skopje", "Rotterdam", 
	        "Valencia", "Vancouver", "Amsterdam", "Vienna", 
	        "Sydney", "New York City", "London", "Bangkok", 
	        "Hong Kong", "Dubai", "Rome", "Istanbul"};
	
	List<String> listCities = Arrays.asList(cities);
	
		
	public  List<String> searchFunctionality(String textSearch) {
		
		if (textSearch.length() < MIN_LENGHTH_SEARCHTEXT) { 
			List<String> listEmpty = new ArrayList<>();
			return listEmpty;
		}else {
			List<String> listOfcities = new ArrayList<>();
			
			for(String s: listCities) {
				if(s.toLowerCase().contains(textSearch.toLowerCase())) {
					listOfcities.add(s);
				}
			} 
			return listOfcities;
	    }
		
	}

}