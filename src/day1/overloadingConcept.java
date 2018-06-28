package day1;

import java.util.jar.Attributes.Name;

public class overloadingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// polyphorphism 
		
		// poly -- > many 
		
		// forms --> Different behaviour 
		
		// Over loading method should have different return type 
		
		overloadingConcept  a = new overloadingConcept();
		//name("Chinmay");// is it static?  --> No
		
		a.name(2);
		a.name("Chinmay");
		a.name("Chinmay", "Deshpande");

	}
	
	public String name(String firstName , String lastName) {
		return firstName + lastName;
	}
	
	public int name(int age ) {
		return age ;
	}
	
	public void name(String LastName ) {
		System.out.println(LastName);;
	}
	

}
