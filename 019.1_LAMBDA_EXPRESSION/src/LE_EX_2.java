/*ambda expression provides implementation of functional interface.
 * An interface which has only one abstract method is called functional interface
 * It is an alternate to Anomous class here syntax became short
 * it introduce in java 8*/


interface xy
{
 public void display();
 //public void xyz();
 //any other method not allowed as labda expression
}
interface AA
{
	void add(int a ,int b);

	
}
public class LE_EX_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		xy a=()->{ System.out.println("hello lambda"); };
		a.display();
		
		AA b = (s,t) ->{System.out.println(s+t);};
		b.add(10,25);
			
			
		}	
     
	}


