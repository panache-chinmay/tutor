package InheritanceConcepts;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		parentClass a = new parentClass();
		
		a.name("Chinmay");
		a.talk();
		a.walk();
		System.out.println(a.i);
		a.accessPrivate();
		a.load();
		// you cannot access methods and variable of child class 
		// with parent reference variable
		
		
		childClass d = new childClass();
		d.talk();
		d.drive();
		d.walk();
		d.fight();
		d.load();
		//  if the class is in other package we need to import the class
		// private method can not be access in other class directly 
		
		parentClass bv = new childClass();
		
		bv.talk();
		bv.walk();
		
		// over riding the method 
		
		// same method but different class
				
	}

}
