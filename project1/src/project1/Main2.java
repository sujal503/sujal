package project1;
 class B{
	 void meth1()
	 {
		 System.out.println("override");
	 }
 }
 
 class C extends B
 {
	@Override
	void meth1() {
		// TODO Auto-generated method stub
		super.meth1();
	}
 }
public class Main2 {

public static void main(String[] args) {
	 C c = new C();
	 c.meth1();
}

}
