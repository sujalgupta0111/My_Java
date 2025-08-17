package Comparator;

import java.util.Comparator;
import java.util.TreeSet;
//Stringbuffer Compareble Interface 
class SR implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String a =  o1.toString();// yhea naya hai
		String b = o2.toString();// yhea element phela se TreeSet me hai

       return -a.compareTo(b);
     }

	
}

public class comparatorstringreverse {

	public static void main(String[] args) {
		SR a = new SR();
		TreeSet t = new TreeSet(a);
		t.add(new StringBuffer("Sujal"));
		t.add(new StringBuffer("Raj"));
		t.add(new StringBuffer("Mohit"));
		t.add(new StringBuffer("Mohit"));
		t.add(new StringBuffer("manju"));
		t.add(new StringBuffer("shalhi"));
		t.add(new StringBuffer("asha"));
		t.add(new StringBuffer("pawan"));
		
		System.out.println(t);

	}

}
