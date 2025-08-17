//same as format
public class Printf {
	static public void main (String ... sujal)
	{
		boolean a =true;
		int     b = 76768;
		float   c = 234.1234567890f;
		double  d = 234.1234567890;
		char    e ='c';
		String  f = "Sujal + 1234";
		
		
		//format dont produce newline with it and it require acces sepcifies to print
		System.out.printf("---------------------------------Print  Bollean----------------------------- \n");
		System.out.format(" %b %B",a,a);
		
		System.out.println("");
		
		
		System.out.printf("---------------------------------Print Integer----------------------------- \n");
		System.out.printf("%d \n",b);
		System.out.printf("%x \n",b);
		System.out.printf("%X \n",b);
		System.out.printf("%o \n",b);
		
		System.out.println("");
		
		System.out.printf("---------------------------------Print Float----------------------------- \n");
		//format print float upto 6 digit of decimal
		System.out.printf("%f \n",c);
		System.out.printf("%f \n",d);
		
		System.out.println("");
		
		System.out.printf("---------------------------------Print String----------------------------- \n");
		//format print float upto 6 digit of decimal
		System.out.printf("%c \n",e);
		System.out.printf("%C \n",e);
		
		System.out.println("");
		
		System.out.printf("---------------------------------Print String----------------------------- \n");
		//format print float upto 6 digit of decimal
		System.out.printf("%s \n",f);
		System.out.printf("%S \n",f);
		
		System.out.println("\n");
		
		System.out.printf("---------------------------------Print ALl in one ----------------------------- \n");
		//format print float upto 6 digit of decimal
		System.out.printf(" String->%s \n Char->%c \n Float->%f \n integer 1->%d \n integer 2 hexa form->%X \n boolean->%B",f,e,d,b,b,a);
		
		
		System.out.println("\n");
	}

}
