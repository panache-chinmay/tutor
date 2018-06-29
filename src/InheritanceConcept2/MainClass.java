package InheritanceConcept2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classC can = new classC ();
		can.methodA();
		can.methodB();
		can.methodC();
		System.out.println("---------------------------------------");
		
		
		classB canb = new classB();
		
		canb.methodB();
		canb.methodA();
		System.out.println("----------------------------");
	 
		classA cana = new classA();
		cana.methodA();
		System.out.println("----------------------------");
	 
	 
		classA canab = new classB();
		canab.methodA();
		canab.methodload();
	 
	 System.out.println("____________________-");
		
		
		
		

	}

}
