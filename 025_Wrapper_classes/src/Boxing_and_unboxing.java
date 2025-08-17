public class Boxing_and_unboxing {

	public static void main(String[] args) 
	{
		//Boxing to convert privitive datatype into Wrapper Classes
		int a = 9;
		Integer b = a;
		//or
		Integer c = new Integer(a);
		
		//unboxing to conver wrapper classes into primitive datatype
		
		
		Integer d =5;
		int dd = d;
		int ddd=d.intValue();
		System.out.println(ddd);
		
		
		Double e = 7.9;
		double ee = e;
		double eee = e.doubleValue();
		System.out.println(ddd);
		

	}

}
