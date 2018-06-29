package AbtractConcept;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//AbstractClassOne hint = new AbstractClassOne();
		// Cannot create object of abstract class
		ChildClass obj = new ChildClass();
		obj.load();
		obj.loadchild();
	    obj.normalMethod();
	    obj.printC();
	    obj.printA();
	    obj.printB();

	}

}
