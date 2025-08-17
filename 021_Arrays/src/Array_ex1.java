//in java array is an object
public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarations
		//              {0, 1, 2, 3, 4}  
		int[] numbers = {1, 2, 3, 4, 5}; // Directly initializing with values
		int[] num = new int[5];  // Array of 5 integers

            System.out.println(numbers.length);//to check length
            System.out.println(numbers[0]);  
            System.out.println(numbers[1]);  
            System.out.println(numbers[2]);  
            System.out.println(numbers[3]);
            System.out.println(numbers[4]);  
           // System.out.println(numbers[5]);  
            
            
            char c1[]={'h','e','l','l','o'};
    	    char c2[] = new char [5];
            
           
         // Using a for loop
         for (int i = 0; i < numbers.length; i++) {
             System.out.println(numbers[i]);
         }

         // Using an enhanced for loop
         for (int number : numbers) {
             System.out.println(number);
         }

         // multi dimensional array
         int[][] matrix = {
        		    {1, 2, 3},
        		    {4, 5, 6},
        		    {7, 8, 9}
        		};

        		// Accessing elements
        		System.out.println(matrix[1][2]); // Outputs: 6

	}

}
