package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

class DecORDER implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer a = (Integer) o1;// yhea naya hai
		Integer b = (Integer) o2;// yhea element phela se TreeSet me hai

//Yahan compare kaar rakha hai 
		if (a < b)
			return 1;// +ve number return kiya

		else if (a == b)
			return 0;

		else
			return -1;
		
		//yahan dec order ke liye comparator baan raha hai claho samajte hai kiya ho raha hai
		
		/* 10 aise hie add ho jayega useka baad jaab 1 add hoga tho compare(1,10) hoga 
		 * compare me aane ke baad condition check hongi aur decending order me 1 10 ke baad aayea then means 10 ke after tho
		 * +ve return karega but 13 phela (before aayega tho vo) uske liye kara hai -ve 
		 * 
		 * 
		 * */

	}
}

public class comparator {

	public static void main(String[] args) {
		DecORDER a = new DecORDER();
		TreeSet t = new TreeSet(a);
		t.add(10);
		t.add(1);
		t.add(0);
		t.add(13);
		t.add(15);
		t.add(15);
		System.out.println(t);

	}

}
