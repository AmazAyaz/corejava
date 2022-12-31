package core;

import java.util.Scanner;

public class DuplicateWordSearch {

public static void main (String args[]) {
	
	
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter sentence which has duplicate in it");

    String words = s.nextLine();

    String word[] = words.split(" ");
    
    
    
    
    
    int count;
    for(int i=0 ; i < word.length; i++ ) {
    	
    	count = 1;
    	
    	for (int j=i+1 ; j<word.length; j++) {
    		
    		if (word[i].equals(word[j])) {
    			
    			count = count+1;
    			word[j]="0";
    			
    			} 
    		
    	}
    		if (word[i]!="0") {
    				
    				System.out.println( word[i] + " count is " + count);
    			}
    			
    			
    	}
    }

}




