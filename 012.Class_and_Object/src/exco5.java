class ert
{
	int t=20;
	String s = "Hello my world";
	}
public class exco5 {

	public static void main(String[] args) {
		ert a =new ert();
//a stores the reference (address) of memory location
		ert x = a;
//now the reference value stores in x so we also perform function with x
		
		System.out.println(x.t);
	}

}
