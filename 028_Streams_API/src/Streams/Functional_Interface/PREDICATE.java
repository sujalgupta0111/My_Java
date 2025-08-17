package Streams.Functional_Interface;

import java.util.function.Predicate;

public class PREDICATE {
	public static void main(String... strings) {
		//isme batana jaruri jhai ki kis type ka input aayega vo boolean return karega 
		// yhea ek tarikese koi choti condition hold karne ke liye hai 
		Predicate<Integer> a = s -> s % 2 == 0;
		if (a.test(5))
			System.out.println("its even");
		else
			System.out.println("its odd");
	}

}
