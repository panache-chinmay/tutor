package InheritanceConcepts;

public class parentClass {

	int i  = 20 ;
	String name ;
	
	public String name(String name ) {
		this.name = name ;
		System.out.println(name);
		return name;
	}
	
	public void walk() {
		System.out.println("The person can walk");
	}
	
	public void talk() {
		System.out.println("The person can talk");
	}
	
	private void see() {
		System.out.println("The person can see");
	}
	public void accessPrivate() {
		see();
	}
	
	public void load() {
		System.out.println("The loan method of parent class");
	}

}
