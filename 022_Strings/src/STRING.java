/*String is immutable and if change the referencfe variable point to new and old one 
are avilable for garbage collection*/

/*it introduce in java 1.0*/

public class STRING {

	public static void main(String[] args) {
		/*there are 2 memory types 1, heap and 2. pool memory
		 
Heap memory -->duplicate value allowed here  so it create string  every time 
		        for different  variables even if it exists in  memory 
		    -->it use for run time
		    -->it use for dynamic memory allocation, meaning objects are 
		       allocated space as needed while the program is running.
		    -->Garbage Collector manages the heap, automatically freeing memory 
		       from objects no longer in use, preventing memory leaks.
		  
Pool memory--> duplicate values not allowed here  so if string of same name with   
		       different  variables created then all variable points to the same 
		       string that exists in  memory  
           --> pool memory is a region inside heap memory
		   --> String pool is managed by the JVM (Java Virtual Machine) 
		        and is specifically intended for immutable String literals.
		   --> no need for garbage collection 
		  
 */
		String s = new String("Hello");//this method create strings in heap memory
		String s3 = new String("Hello");
		
		String s5 = new String("Hello");
		
		String s1 = "Hello";//this method create strings in pool memory
		String s4 = "Hello";
		
		System.out.println(s==s3);
/*as "==" operator is compare the referece not the content  so s and s3 created 
  in heap and differently so it return false		*/
		System.out.println(s1==s4);
/*as "==" operator is compare the referece not the content  so s1 and s4 created 
		  in pool and differently so it return false		*/
		
		
		/*convert heap memory into pool by intern()*/
		
		s5 = s5.intern();
		System.out.println(s1==s5);
		// it gives true 

	}

}
