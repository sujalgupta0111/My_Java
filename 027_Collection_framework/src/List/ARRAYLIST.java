package List;

import java.util.*;

public class ARRAYLIST {

	public static void main(String[] args) {
		
		 Collection c = new  ArrayList(30);
		 Collection c1 = new HashSet<>();
		ArrayList a=new ArrayList(40);
		//as arraylinst go beyond its limit it extend itself by 50% in this case 40+20 =60 if not mention then it extends by 10		
				a.add(4);
				a.add("ram");
				a.add(400);
				a.add(9.5);
				
				System.out.println(a.size());
				System.out.println(a);
				
		ArrayList b=new ArrayList(a);
		// if we pass object a array list inside another it extends it same with add but printing is different
		//b.add(a);
				b.add(90);
				b.add("ramesh");
				System.out.println(b);
		     
				
				a.set(2, 2);//a.set(index value like array, number that you want to set);
				System.out.println(a);

				ArrayList c10 =new ArrayList();
				
				Iterator i=a.iterator();//this return the object of collection which points above the o index
				while(i.hasNext()) //i.hasNext() return true if it found element at untill they found element and false when found null
				{
					System.out.println(i.next());//when true then 
					
				}
				
				
			
				
	}

}
