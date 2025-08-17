package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

class even implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer a = (Integer) o1;// yhea naya hai
		Integer b = (Integer) o2;// yhea element phela se TreeSet me hai

     if(a%2!=0)
     {return 0;}
     else {
    	
    	 if(a==b)
    		 return 0;
    	 else if (a>b)
    		 return -1;
    	 else
    		 return 1;
     }

	}
}

public class comparatoreven {

	public static void main(String[] args) {
		even a = new even();
		TreeSet t = new TreeSet(a);
		t.add(10);
		t.add(1);
		t.add(0);
		t.add(13);
		t.add(15);
		t.add(15);
		t.add(20);
		t.add(24);
		t.add(22);
		t.add(21);
		System.out.println(t);

	}

}
