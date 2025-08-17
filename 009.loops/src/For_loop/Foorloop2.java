package For_loop;

public class Foorloop2 {

	public static void main(String[] args) {
		
		/*for(;;)<-----infinite loop
		{
			
		}/*/
		
		for(int a=1 ;a<=5;System.out.println("Hello Bhai"+a))
		{
			System.out.println(a);
			++a;
		}

		System.out.println("---------------------------------------------------------");
		for(int a=1 ;a<=5;++a,System.out.println("Hello Bhai"+a))
		{
			System.out.println(a);
			
		}
		System.out.println("---------------------------------------------------------");
	//	for(int a=1 System.out.println("Hello Bhai"+a);a<=5;++a,)error
		for(int a=1 ;a<=5;++a,System.out.println("Hello Bhai 1-->"+a),System.out.println("Hello Bhai 2-->"+a),System.out.println("Hello Bhai 3-->"+a ))    
		{
			System.out.println(a);
			
		}
	}

}
