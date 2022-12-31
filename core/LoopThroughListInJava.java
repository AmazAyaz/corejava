package core;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopThroughListInJava {

public static void main(String[] args) {
	List <Integer> list = Arrays.asList(1,2,3,4,5,6);
	
	//for loop
	System.out.println("Using for loop");
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	//iterator for traversing
	
	Iterator i = list.iterator();
	System.out.println("Using iterator");
	while(i.hasNext()) {
		
		System.out.println(i.next());
		
	}

//using for each loop
	System.out.println("Using for each loop");
	for(Integer j : list ) {
		
		System.out.print(j + " "); 
		
		
	}
	
	System.out.println("Using lambda expression");
	
	list.forEach(numbers->System.out.println(numbers + " "));
	
	List<String> namesList = new ArrayList<String>();
	
	List<List<String>> namesList1 = Arrays.asList(Arrays.asList("Paul","AQubek"), Arrays.asList("Amy","Bobby"));
	
	/*
	 * for(String names2 : namesList1) {
	 * 
	 * //System.out.println(names2 + " "); }
	 */
	
	for(int j=0; j<namesList1.size(); j++ ) {
		
		//System.out.println(namesList1.get(j));
	}
	
	//namesList1.forEach(namesListFromLambda -> {System.out.println(namesListFromLambda + " ");});
	
	if(namesList1.stream().anyMatch(e -> e.contains("(def)"))) {
		
		System.out.println("true");
		
		
	}
	
	boolean ab = namesList1.stream().anyMatch(a -> a.stream().anyMatch(b -> b.equalsIgnoreCase("AMY")));
		    
	//boolean ab = namesList1.stream().anyMatch(a -> a.stream().anyMatch(b -> b.isEmpty()));
	
	 System.out.println("numbers" +ab);
	
	
	

}
}
