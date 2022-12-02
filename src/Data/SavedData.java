package Data;
import user.*;
import java.util.*;
import service.*;

public class SavedData {
	
	private SavedData() {}
	public Map<String, User> userData = new HashMap<String, User>();
//	public Map<String,ArrayList<Service>> usersCompleteService = new HashMap<String,ArrayList<Service>>(); 
	public Map<String, Map<String,Service>> usersCompleteService = new HashMap<String,Map<String,Service>>(); 

	private static SavedData savedData = null;
	public static SavedData getObj(){
		if(savedData==null)savedData = new SavedData();
		
		return savedData;
	}
	
	
}
