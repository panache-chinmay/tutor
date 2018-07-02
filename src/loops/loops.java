package loops;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array 
		
		// collections of elements 
		
		// collection of similar data type 
		
		// Array has fixed length 
		
		// Collection ----> to over come the result 
		
		// array.length // number of elements in array 
	
		int [] abc = {1,2,3,4,5,6,2,3,4,5,6,7};
		
		//int [] abc = {1,2,3,4,5,6};
		
		String [] abcd = {"Chinmay","Chinmay1"};
		
		//System.out.println(abc.hashCode());
		
//		System.out.println(abc.length);
//		
//		System.out.println("-----"+abc[2]);
		
		for(int i = 0 ; i < abc.length;i++) {
			System.out.println(abc[i]);
		}
		
		for(int i = abc.length -1; i >= 0 ;i--) {
			System.out.println("The element at index "+i+" is "+abc[i]);
		}
		
		int i = 0;
		for( i = 0 ; i < 10 ; i++) {
			System.out.println(i);
			
			// break statement ;
			if(i == 6)
				break;
		}
		System.out.println("---------");
		System.out.println(i);
		
		
	System.out.println("-------------------->");
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
