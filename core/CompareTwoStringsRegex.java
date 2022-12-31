package core;

public class CompareTwoStringsRegex {

	public void compareStrings(String str1, String str2) {

		String firstStr = str1.trim().replaceAll("[^a-zA-Z0-9]+", " ");
		String secondStr = str2.trim().replaceAll("[^a-zA-Z0-9]+", " ");

		System.out.println(firstStr);
		System.out.println(secondStr);

		if (firstStr.equalsIgnoreCase(secondStr)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		// This#is%a^address* string&.
		// This is a address string
	}

	public static void main(String[] args) {

		CompareTwoStringsRegex c = new CompareTwoStringsRegex();

		c.compareStrings("This#is%a^address*   string", "This is a address    string");

	}

}
