package ConstructorandEncapsulation;

public class classA {

	// variable should private , method should public 
	
	private int i ;
	private String name = "kys";
	private String add ;
	private int id = 10 ; ;
	private boolean  rollNum;
	
	public classA(String namey) {
		
		name = namey;
	}
	
	public classA(int idy) {
		
		id = idy;
	}
	
	// proper data insertion 
	
	// data intialise 
	
	
	public void classA() {
		System.out.println("classA");
	}
	
	public void nameVariable() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(rollNum);
		System.out.println(i);
		
		int b = 10 ;
		System.out.println(b);
		
		
	}
}
