package Data;

public class SavedData {
	
	private SavedData() {}
	
	private static SavedData savedData = null;
	
	SavedData getObj(){
		if(savedData==null)savedData = new SavedData();
		
		return savedData;
	}
	
	
}
