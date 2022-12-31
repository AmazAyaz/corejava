package concept;

public class DriverMain {

public static void main(String[] args) {
	
	Parent p = new Child();
	
	Child c = new Child();
	
	//p.childMethod(); cant call child with reference of parent
	
	c.parentMethod(); //can call child and parent method
	c.childMethod();
	
}



}
