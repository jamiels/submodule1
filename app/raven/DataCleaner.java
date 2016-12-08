package raven;

public class DataCleaner {

	public static String cleanEmail(String e){
		if(e!=null)
			return e.toLowerCase();
		return null;
	}	

	public static String cleanPhoneNumber(String p) {
		if(p!=null)
			return p.replaceAll("[^\\d]", "");
		return null;
	}	
}
