package concept;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTextFromHtmlTag {

	public static void main(String[] args) {
		
		
		String nodestr = "<html>"
				+ "<head> "
				+ "<title>503 Service Temporarily Unavailable</title>"
				+ "</head>"
				+ "<h1>502 Bad Gateway</h1>"
				+ "</html>";
		
		
		String text = extractWebPageTitle(nodestr);
		
		System.out.println(text);



	}
	
	private static String extractWebPageTitle(String html) {
		String s = "";
		Pattern pattern = Pattern.compile("<h1>(.*?)</h1>");
		Matcher matcher = pattern.matcher(html);
		while (matcher.find()) {
			//System.out.println(matcher.group(1));
			 s = matcher.group(1);
			
		}
		return s;
	}

}
