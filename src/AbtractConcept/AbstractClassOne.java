package AbtractConcept;

public abstract class AbstractClassOne {
	
	abstract public void load();
	
	public void normalMethod() {
		System.out.println("Normalabstractclassmethod");
	}
	
	// if class contains abstract method , we need to declare class as 
	//abstract
	// abstract method have no body...
}
