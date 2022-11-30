package Data;
import user.*;
import java.util.*;

public class SavedData {
	
	private SavedData() {}
	public Map<String, User> userData = new HashMap<String, User>();
	public Map<String,String> savedAccounts=new HashMap<String, String>();
	private static SavedData savedData = null;
	
	public static SavedData getObj(){
		if(savedData==null)savedData = new SavedData();
		
		return savedData;
	}
	
	
}
