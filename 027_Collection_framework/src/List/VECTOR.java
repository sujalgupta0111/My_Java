package List;
import java.util.ListIterator;
import java.util.Vector;

public class VECTOR {

	public static void main(String[] args)
	{
		
	Vector a = new Vector();
// it similar to array list but thread safe unlike arraylist	
//as Vector go beyond its limit it extend itself by 50% in this case 40+40 =80 if not mention then it extends by 10		
			a.add(4);
			a.add("ram");
			a.add(400);
			a.add(9.5);
			
			System.out.println(a.size());
			System.out.println(a);
			
			Vector b = new Vector();
// if we pass object a array list inside another it extends it same with add but printing is different
	       //b.add(a);
			b.add(90);
			b.add("ramesh");
			System.out.println(b);
	     a.set(2, 2);//a.set(index value like array, number that you want to set);
			System.out.println(a);
			System.out.println(a.get(3));
			
			
			ListIterator l=a.listIterator();//ListIterator(sub interface of Iterator) works with List ONLY (not with Set or Map).
			System.out.println(l.next());
			System.out.println(l.next());
			System.out.println(l.next());
			System.out.println(l.previous());
			System.out.println(l.previous());
			System.out.println(l.previous());
		

	}

}
