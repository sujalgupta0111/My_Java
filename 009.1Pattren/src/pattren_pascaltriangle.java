
// Print Pascal's Triangle in Java
import java.io.*;

class pattren_pascaltriangle {
	public static int factorial(int i) {
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}

	public static void main(String[] args) {
		int n = 4, i, j;
		int spaces = n;
		String msg = " ";
		pattren_pascaltriangle g = new pattren_pascaltriangle();
		for (i = 0; i <= n; i++) {
			for (j = 0; j < spaces; j++) {

				// for left spacing
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				if (j == 0)
					msg = "";
				else
					msg = " ";

				System.out.print(msg + factorial(i) / (factorial(i - j) * factorial(j)));
			}

			// for newline
			System.out.println();
			spaces--;
		}
	}
}