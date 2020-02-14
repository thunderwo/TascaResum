package JavaExample;

import java.util.Scanner;

public class JavaProject {
	static int fact(int num) {
		int factorial;
		int numero;
		String text;

		for (factorial = 1; num > 2; num--) {
			factorial *= num;
		}
		return factorial;
	}

	static int ncr(int n, int r) {
		return fact(n) / (fact(n - r) * fact(r));
	}

	public static void main(String args[]) {
		int rows, j;
		int i;
		String text;
		text = "Enter number of rows:";
		System.out.println(text);
		Scanner scanner = new Scanner(System.in);
		rows = scanner.nextInt();
		scanner.close();

		System.out.println("Pascal Triangle:");
		for (i = 0; i < rows; i = i + 1) {
			for (j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(" " + ncr(i, j-1));
			}
			System.out.println();
		}
	}
}