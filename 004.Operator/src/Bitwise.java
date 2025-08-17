
public class Bitwise {

	public static void main(String[] args) {
		int a=5;//in binary = 0101
		int b =9;//in binary =1001
		
		int c = a^b;// Bitwise XOR perform XOR logic gate operation on binary of a and b
		int d = a&b;// Bitwise AND perform AND  logic gate operation on binary of a and b
		int e = a|b;// Bitwise OR perform OR logic gate operation on binary of a and b
		int f = a>>b;// Bitwise  right shift perform aArithematic right shift at one position
		int g = a<<b;//Bitwise  right shift perform aArithematic left shift at one position 
		
		System.out .println(c);
		System.out .println(d);
		System.out .println(e);
		System.out .println(f);
		System.out .println(g);
		
		

	}

}
