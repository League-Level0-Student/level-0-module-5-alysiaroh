
public class ForLoopGauntlet {
	// Write a for loop to do each the following:
	public static void main(String[] args) {

		// 1. Display all numbers from 0 to 100
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		// 2. Display all numbers from 100 to 0
		for (int a = 100; a >= 0; a--) {
			System.out.println(a);
		}
		// 3. Display all even numbers from 2 to 100
		for (int b = 2; b < 101; b++) {
			if (b % 2 == 0) {
				System.out.println(b);
			}
		}
		// 4. Display all odd numbers from 1 to 99
		for (int c = 1; c < 100; c++) {
			if (c % 2 == 1) {
				System.out.println(c);
			}
		}
		// 5. Display all numbers from 1 to 500. If the number is odd, print “odd” next
		// to the number.
		for (int d = 1; d < 501; d++) {
			if (d % 2 == 0) {
				System.out.println(d + " is even");
			} else {
				System.out.println(d + " is odd");
			}
		}
		// If the number is even, print “even” next to the number.
		// Eg:
		// 1 is odd
		// 2 is even
		// 3 is odd
		// 4 is even
		// 5 is odd...etc.

		// 6. Display all multiples of 7 from 0 to 777.
		for (int e = 7; e < 778; e++) {
			if (e % 7 == 0) {
				System.out.println(e);
			}
		}
		// 7. Print all the years you were alive and how old you were in each. e.g. “In
		// 1979, i was 2 years old.”
		// (for a really old person)
		int yO = 0;
		for (int y = 2003; y <= 2018; y++) {

			System.out.println("In " + y + " I was " + yO + " years old.");
			yO++;
		}
	}
}
