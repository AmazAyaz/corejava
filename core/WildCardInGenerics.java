package core;

import java.util.Arrays;
import java.util.List;

public class WildCardInGenerics {

   public static void main(String[] args) {
	
	   List<Integer> list1 = Arrays.asList(1,2,3,4,5);
	   
	   System.out.println(sum(list1));
	   printOnlyIntegerClassorSuperClass(list1);
	   
	   List<Double> list2 = Arrays.asList(5.0,6.0,7.0);
	   
	   System.out.println(sum(list2));
	   
	   List<Number> list3 = Arrays.asList(5.0,6.0,7.0);
	   printOnlyIntegerClassorSuperClass(list3);   
   
   }
   
   private static double sum(List<? extends Number> list) {
	   
	   double sum = 0.0;
	   for(Number i : list) {
		   
		   sum += i.doubleValue();
	   }
	   
	   return sum;
	   
   }
   
   /*Lower bounded wild card is applicable to its super class*/
   public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) 
   { 
       System.out.println(list); 
   } 

/*In the above program, list1 and list2 are objects of the List class. 
 *list1 is a collection of Integer and list2 is a collection of Double. 
 *Both of them are being passed to method sum which has a wildcard that 
 *extends Number. This means that list being passed can be of any field 
 *or subclass of that field. Here, Integer and Double are subclasses of class Number.*/


}
