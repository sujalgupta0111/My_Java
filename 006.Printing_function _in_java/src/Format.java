
public class Format {
	static public void main (String ... sujal)
	{
		boolean a =true;
		int     b = 76768;
		float   c = 234.1234567890f;
		double  d = 234.1234567890;
		char    e ='c';
		String  f = "Sujal + 1234";
		
		
		//format dont produce newline with it and it require acces sepcifies to print
		System.out.format("---------------------------------Print  Bollean----------------------------- \n");
		System.out.format(" %b %B",a,a);
		
		System.out.println("");
		
		
		System.out.format("---------------------------------Print Integer----------------------------- \n");
		System.out.format("%d \n",b);
		System.out.format("%x \n",b);
		System.out.format("%X \n",b);
		System.out.format("%o \n",b);
		
		System.out.println("");
		
		System.out.format("---------------------------------Print Float----------------------------- \n");
		//format print float upto 6 digit of decimal
		System.out.format("%f \n",c);
		System.out.format("%f \n",d);
		
		System.out.println("");
		
		System.out.format("---------------------------------Print String----------------------------- \n");
		//format print float upto 6 digit of decimal
		System.out.format("%c \n",e);
		System.out.format("%C \n",e);
		
		System.out.println("");
		
		System.out.format("---------------------------------Print String----------------------------- \n");
		//format print float upto 6 digit of decimal
		System.out.format("%s \n",f);
		System.out.format("%S \n",f);
		
		System.out.println("\n");
		
		System.out.format("---------------------------------Print ALl in one ----------------------------- \n");
		//format print float upto 6 digit of decimal
		System.out.format(" String->%s \n Char->%c \n Float->%f \n integer 1->%d \n integer 2 hexa form->%X \n boolean->%B",f,e,d,b,b,a);
		
		
		System.out.println("\n");
	}

}
