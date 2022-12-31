package core;

public class DuplicateChar {

public static void main (String args[]) {
	
String str = "maheshbabu";

int length = str.length();

char[] ch = str.toCharArray();

System.out.println(ch[0]);

for(int i=0 ; i< length ; i++) {
	
	for (int j = i+1 ; j<length ; j++) {
		
		if (ch[i]==ch[j]) {
			
			System.out.println("Duplicate characters are  " + ch[j]);
			break;
		}
	}
}


}


}
