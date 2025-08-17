
public class STRING_Methods {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = "Hello";
	 
		
		System.out.println(s+s1);
		System.out.println(s.concat(s1));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("Sujal".toUpperCase());
		System.out.println(s.equals(s1));//compare upper case and lower case
        System.out.println(s.equalsIgnoreCase(s1));  
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        
        
        //substring
        System.out.println(s1.substring(1));
		System.out.println(s1.substring(0,3));
		
		//index0f
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.indexOf("lo"));//pass string give starting index of that string 
		System.out.println(s1.indexOf('l',3));//it strat search after the given index 
		System.out.println(s1.lastIndexOf('l'));//it check form bheind and return -1 if not found
	       
		//trim
		
		System.out.println("hello     my gupta              ".trim());
		// remove all spaces after the end  element 
		


	
		
	}

}
