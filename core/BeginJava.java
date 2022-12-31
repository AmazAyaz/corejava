package core;

public class BeginJava {

private int a;
private int b;

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public BeginJava() {
	

}

public void startJavaAgain() {
	
	System.out.println("Im back again");
	}

public static void main (String args[]) {
	
	BeginJava bj = new BeginJava();
	
	bj.startJavaAgain();
}

}
