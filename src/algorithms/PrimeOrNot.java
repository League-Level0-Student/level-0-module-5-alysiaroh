package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {

		String input = JOptionPane
				.showInputDialog("Input a number greater than 1 and I can tell you if it is prime or not.");
		int num = Integer.parseInt(input);
		System.out.println(isPrime(num));

	}

	static boolean isPrime(int num) {
		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
