package Data;
import user.*;
import java.util.*;

public class SavedData {
	
	private SavedData() {}
	public Map<String, User> userData = new HashMap<String, User>();
	private static SavedData savedData = null;
	public static SavedData getObj(){
		if(savedData==null)savedData = new SavedData();
		
		return savedData;
	}
	
	
}
