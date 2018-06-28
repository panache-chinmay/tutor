package day1;

public class functionsinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		agey(10);
		String lastnamey =surnames("Deshpande");
		System.out.println(lastnamey +" Chinmay");
		System.out.println(surnames("Deshpande"));
		
		// Static method call be called directly
		
		// Static method call be called by classname 
		
		System.out.println("-----------------------------");
		
		
		functionsinJava.name();
		functionsinJava.agey(20);
		String lak =functionsinJava.surnames("Dani");
		System.out.println("Ninad " + lak);
	}
	
	// method with return type and argument 
	
	// void -- means it does not return anything 
	
	public static  void name() {
		System.out.println("chinmay");
	}
	
	// 2) method with argument
	public static void agey(int age) {
		System.out.println("The age is"+ age);
	}
	// 3) methods with arguments and return type
	
	public static String surnames (String lastname) {
		return lastname ;
	}

}
