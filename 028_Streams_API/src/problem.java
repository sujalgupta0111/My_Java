import java.util.ArrayList;

public class problem {

	public static void main(String[] args) {
	   ArrayList a = new ArrayList();
	   a.add(1);
	   a.add("string");/*store both string and integer*/
	   
	   String s= (String) a.get(0);
	   String b =(String) a.get(1);/*No Compile time Error*/
	}

}
