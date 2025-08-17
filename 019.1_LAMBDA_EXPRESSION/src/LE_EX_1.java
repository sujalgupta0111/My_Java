/*ambda expression provides implementation of functional interface.
 * An interface which has only one abstract method is called functional interface
 * It is an alternate to Anomous class here syntax became short
 * it introduce in java 8*/

import java.util.ArrayList;

public class LE_EX_1 {

	public static void main(String[] args) {
		
			int a[] = {1,5,63,6,4,43,67,343};
			ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    numbers.forEach( (n) -> { System.out.println(n); } );
			
		}	
     
	}


