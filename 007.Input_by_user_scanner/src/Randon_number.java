import java.util.Random;
public class Randon_number {

	public static void main(String[] args) {
		
		Random r = new Random();
		int a = r.nextInt(100,111);
		double b = r.nextDouble(99.99);
		boolean c =r.nextBoolean();
	     float d = r.nextFloat(20);
	     double e = r.nextGaussian(10,29);
	     
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
