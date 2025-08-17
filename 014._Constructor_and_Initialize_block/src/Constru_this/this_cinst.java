package Constru_this;
class AA
{
	int age=1;
	AA(int age)
	{ 
		//this.age =age;// this statement show 29
		age = age ;// this statement show 1
	}
}
public class this_cinst {

	public static void main(String[] args)
	{
		AA b = new AA(29);
		
		System.out.println(b.age);
	}

}
