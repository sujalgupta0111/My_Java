package Streams.Functional_Interface;

import java.util.function.Function;
import java.util.function.Predicate;

public class FUNCTION {
	public static void main(String... strings) {
		// Function<T, R> T ki jagha batana padtha hai ki intput type kiya hai aur r ki
		// jagha output type kiya
		Function<Integer, Integer> divideby2 = s -> s / 2;
		Function<String, Integer> lenghtofstring = s -> s.length();
		Function<String, StringBuilder> inttochar = s -> new StringBuilder(s);

		int re = divideby2.apply(10);
		int len = lenghtofstring.apply("Sujal Gupta");
		StringBuilder le = inttochar.apply("String");

		System.out.println(re);
		System.out.println(len);
		System.out.println(le);

	}

}
