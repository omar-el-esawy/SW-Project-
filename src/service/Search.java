package service;

import java.util.ArrayList;
import java.util.Map;

import Data.SavedData;
import Screen.Pair;

public class Search {

	
	static public ArrayList<Pair> search(String id) {
		ArrayList<Pair> searchResult = new ArrayList<Pair>();
		
		for(Map.Entry<String, Service> service : SavedData.getObj().services.entrySet()) {
			if(service.getKey().contains(id)) {				
				searchResult.add(new Pair(service.getKey(), service.getValue() ) );
				
			}
		}
		return searchResult;
	}
	
	static public void showSearchResult(ArrayList<Pair>searchResult) {
		for(int i =0 ;i<searchResult.size();i++) {
			System.out.println(searchResult.get(i).name);
		}		
	}
	 
}
