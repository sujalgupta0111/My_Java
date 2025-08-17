// Stringbuffer is intrfuse in java 1
/*it os more thread safe and syncronized means two thread not called 
function of this simentaniously

it is less efficient than String Builder*/

//stringbuilder aslo same but it was not thred samfe nad introfdue in 1.5 java
public class STRINGBUFFER_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer();
		s =s.append(" world");
		System.out.println(s);
		System.out.println(s2.capacity());
		//Stringbuffer reserve some extra space while initializing 
		System.out.println(s.capacity());
		//it give 16+no of letters in string as output
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		
		//fpr reverse
		System.out.println(s.replace(4, 8, " hei "));
		System.out.println(s.reverse());
		StringBuffer sb = new StringBuffer("Hello");
		sb.insert(3, " Java");
		
		
		StringBuffer sb1 = new StringBuffer("Hello World");
		sb1.replace(0,1, "Java");
		System.out.println(sb1);  // Output: Hello Java

		System.out.println(sb);
	}

}
