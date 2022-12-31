package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ExtractDateFromString {

	
	
	 public static void main(String[] args) throws ParseException {
	       
	        
	        String test = "gomt_gts_viper-data-14-07-2021";

	        Pattern pattern = Pattern.compile("data-(.*)");
	        Matcher matcher = pattern.matcher(test);

	        if(matcher.find())
	        {
	            String dateString = matcher.group(1);   //I'm using the Capturing groups to capture only the value.
	            java.util.Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
	            System.out.println(date);
	        }
	    }
}
	




