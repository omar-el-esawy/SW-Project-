package Data;

import java.util.*;
import java.lang.*;

public class SavedData {
	
	private SavedData() {}
	public Map<String, String> userData = new HashMap<String, String>();
	private static SavedData savedData = null;
	
	public static SavedData getObj(){
		if(savedData==null)savedData = new SavedData();
		
		return savedData;
	}
	
	
}
