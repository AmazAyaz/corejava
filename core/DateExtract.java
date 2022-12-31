package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtract {

	private static String getDate(String desc) {

		String allMatches = new String();
		Matcher m = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d").matcher(desc);
		while (m.find()) {
			allMatches = m.group();

		}
		return allMatches;
	}

	public static void main(String[] args) throws Exception {

		String dates = getDate("gomt_gts_viper-data-14-07-2021");

		System.out.println(dates);

	}

}
