//it print the data in next line without /n an dont need acces modifiers like println ;
public class Print {
	
	public static void main(String[] args) {
		boolean a =true;
		int     b = 76768;
		float   c = 234.1234567890f;
		double  d = 234.1234567890;
		char    e ='c';
		String  f = "Sujal + 1234";
		
		
		
		System.out.print("Boolean -->"  +a +"\n");
		System.out.print("Integer -->"  +b +"\n");
		System.out.print("Float   -->"  +c +"\n");
		System.out.print("Charater-->"  +e +"\n");
		System.out.print("String  -->"+f +"\n");
		
		System.out.println();
		
		System.out.print("All in one \nBoolean-->" +a +"\nInteger-->"+b +"\nFloat-->"+c  +"\nCharater-->"+e +"\nString-->"+f);
	}

}
