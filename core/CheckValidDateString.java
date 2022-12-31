package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class CheckValidDateString {
	
	 public static boolean isValidDate(String inDate) {
		 
		   
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	        dateFormat.setLenient(false);
	        try {
	            dateFormat.parse(inDate.trim());
	        } catch (ParseException pe) {
	            return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	    	
	    	   String str = "gomt_gts_viper-data-14-07-2021";
			    String str1 = str.substring(0,20);
			    String str2 = "";
			    
			    if(str1.equals("gomt_gts_viper-data-")) {
			    	str2 = str.substring(20);
			    	System.out.println(str1);
			    	
			    } else {
			    	
			    	System.out.println("invalid string");
			    }
			    
			    System.out.println(str2);

	        System.out.println(isValidDate(str2));
	       
	    }

}


