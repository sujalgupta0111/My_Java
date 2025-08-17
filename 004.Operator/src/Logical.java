
public class Logical {

	public static void main(String[] args) {
		
		int a = 10,b =5 ,c= 5;
		
		//Logical AND( Multiply)
		System.out.println("\nLogical AND ");
		boolean d = (a>b) &&  (c==b);  //both true
		boolean e = (a<b)  && (c==b);  // false true
        boolean f = (a>b)  &&  (c>b);  // true false
        boolean g = (a==b) &&  (c>b);  //both false
		System.out.println("True  and True  ="+d);
		System.out.println("Fasle and True  ="+e);
		System.out.println("True  and False ="+f);
		System.out.println("Fasle and False ="+g);
		System.out.printf("\n");
		//Logical OR(add)
		System.out.println("Logical OR");
		boolean h = (a>b)  || (c==b); //both true
		boolean i = (a<b)  || (c==b); // false true
        boolean j = (a>b)  ||  (c>b);// true false
        boolean k = (a==b) ||  (c>b);//both false
        System.out.println("True  and True  ="+h);
		System.out.println("Fasle and True  ="+i);
		System.out.println("True  and False ="+j);
		System.out.println("Fasle and False ="+k);
		System.out.printf("\n");
		
		//Logical NOT
		System.out.println("Logical NOT");
		boolean l = !(c == b); //True condition
		boolean m = !(a<b ) ;// False condition
		System.out.println("True condition  ="+l);
		System.out.println("True condition  ="+m);


		
		/**Logical AND 
		True  and True   =true
		Fasle and True  =false
		True  and False  =false
		Fasle and False =false

		Logical OR
		True  and True   =true
		Fasle and True  =true
		True  and False  =true
		Fasle and False =false

		Logical NOT
		True condition =false
		True condition =true*/

	}

}
