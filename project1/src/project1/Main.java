package project1;

class A {
	
	
	
	void meth1(int a ){
		System.out.println("para1");
	}
	
	void meth1(){
		System.out.println("para6");
	}

	
}

public class Main {
public static void main(String[] args) {
	A a = new A();
	a.meth1();
	a.meth1(12);
}
}
