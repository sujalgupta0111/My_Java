/*this is use to remove the confusion (  Ambiguity ) 
for compiler between local and instance variable when name is same */
package Constru_this;

public class const_this {

	public static void main(String[] args) {
		
		abc b = new abc();
		
		b.xyz(4);// give a value 4 to a 
		System.out.println(b.a);
		

	}

}
class abc
{
	int a =10 ;
	
	void xyz(int a)// here compiler confuse between instance and local variable 
	{ 
		this.a=a ;//use this statement print  will print 4
		//a=a; //use this statement print  will print 10
		
		/*this keyword clear a confusion for compiler 
		and show which  a is belongs to the method */
		
	}
	
	
	 
	
}
