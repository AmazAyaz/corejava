package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {

	public static void main(String[] args) {
	    
		String c= "This#is%a^address*   string&.";
        Pattern pt = Pattern.compile("[^a-zA-Z0-9]+");
        Matcher match= pt.matcher(c);
        while(match.find())
        {
            String s= match.group();
        c=c.replaceAll("\\"+s, "");
        }
        System.out.println(c);
		
	}

}
