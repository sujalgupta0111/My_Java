import java.util.*;
import java.util.regex.*;



public class EmailValidation {

	

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		String Email=in.next();
		String regex ="^[a-zA-Z0-9._$]+@[A-Za-z0-9]+\\.[a-zA-Z]{2,}+$";
		
		Pattern pat = Pattern.compile(regex);
		Matcher  mat = pat.matcher(Email);
		if(mat.matches())
		System.out.println("valid");
		else
		System.out.println("not valid");

	}

}
