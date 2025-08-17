//it use to explicitely throw exception by methods
//throw use karke hum kisi bhi method se exception fikwa sakte hai
public class Throws {
	
	public static void hello()
	{
		System.out.println("lets throw artimatics");
     throw new ArithmeticException("Arithimatic exception using throw keyword");
	}
	public static void hi()
	{System.out.println("lets throw array out of bound ");
     throw new ArrayIndexOutOfBoundsException("Arithimatic exception using throw keyword");
	}

	public static void main(String[] args) {
		
		System.out.println("start");
         hello();
         
         System.out.println("end ");
		

	}

}
