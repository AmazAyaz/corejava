package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class CheckedException {

	public static void main(String[] args) {
		
	try {
		File file = new File("D:\\file.java");
		FileReader fr = new FileReader(file); 
		
		
	    
	}
	
	catch (FileNotFoundException ex) {
         ex.printStackTrace();
}
	
	}
	
}
