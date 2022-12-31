package CollectionConcept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeDriver {

public static void main(String[] args) {
	HashSet<Employee> h = new HashSet<>();
	
	Employee e1 = new Employee();
	e1.setName("john");
	e1.setDept("IT");
	
	Employee e2 = new Employee();
	e2.setName("john");
	e2.setDept("IT");
	
	h.add(e1);
	h.add(e2);
	
	System.out.println(h.size());
	
	Iterator<Employee> it = h.iterator();
	
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	
}

}
