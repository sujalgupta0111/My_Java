class xy
{
	static int count=0;
	int plus =0;
}
public class Svariable4 {

	public static void main(String[] args)
	{
		xy a = new xy();
		xy b = new xy();
		xy c = new xy();
		
		xy.count =10;//static variable value by class
		System.out.println("----All objects count after value by class------");
		System.out.println("A objects count-->"+a.count);
		System.out.println("B objects count-->"+b.count);
		System.out.println("C objects count-->"+c.count);
		a.count =30;
		a.plus =20;
		
		//value by object a in plus and count 
		System.out.println();
		System.out.println("----Value by object a in plus and count------");
		System.out.println("A objects count-->"+a.count);
		System.out.println("A objects plus-->"+a.plus);
		System.out.println("B objects count-->"+b.count);
		System.out.println("B objects plus-->"+b.plus);
		System.out.println("C objects count-->"+c.count);
		System.out.println("C objects plus-->"+c.plus);
     }//after changing the value of static variable with object A its same for every other
	

}
