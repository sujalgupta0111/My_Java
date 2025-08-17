package List;

import java.util.*;

public class LINKLIST {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		/*a.add(4);
		a.add("ram");
		a.add(400);
		a.add(9.5);
		*/
	 /*a.addFirst(1);
	    a.addFirst(2);
	    a.addFirst(3);
	
     	a.addLast(4);
    	a.addLast(5);
	    a.addLast(6);*/
	
    	a.addFirst(1);
    	a.addLast(2);
	    a.addFirst(3);
	    a.addLast(4);
	    a.addFirst(5);
	    a.addLast(6);
	    a.addFirst(7);
	    a.addLast(8);
	
/*by using addfirst() and addlast() it  store data like in queue but by simple add() it store data sequentially*/
	
   System.out.println(a.get(2));//retrive by telling index
   System.out.println(a.size());
   System.out.println(a);
   System.out.println("------------------------------------------------");
   Iterator i=a.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
		

	}

}
