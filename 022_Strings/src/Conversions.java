
public class Conversions {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("hello");
		StringBuffer s1 = new StringBuffer("hello");
		String s2 = new String("hello");
		String s5 ="hello";
		
		//string to builder and buffer
		StringBuilder s3 = new StringBuilder(s2);
		StringBuffer s4 = new StringBuffer(s2);
		//to prove
		System.out.println(s3.reverse());
		//reverse is method of string builder
		
		//buildr to string
		
		String s6 = new String(s);
		//to prove 
		s6=s6.intern();
		System.out.println(s5==s6);
		
		
		
		
		
		
	}

}
