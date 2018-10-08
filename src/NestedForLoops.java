
public class NestedForLoops {
public static void main(String[] args) {
	
	//Write nested for loops (a for loop inside another for loop) to do the following:

	//	1. Display this output:
	//	          0  0
	//	          0  1
	//	          0  2
	//	          1  0
	//	          1  1
	//	          1  2
	//	          2  0
	//	          2  1
	//	          2  2

	for(int a=0;a<3;a++) {
		for(int b=0;b<3;b++) {
		System.out.println();
		System.out.print(a+""+b);
		}

	}

	//	2. Display the numbers 1 through 9 in a 3x3 square grid like this:
	//	          1  2  3
	//	          4  5  6
	//	          7  8  9
	System.out.println();
	for(int j=0;j<9;j+=3) {
	for(int i=1;i<4;i++) {
		System.out.print(i+j+" ");
	}
	System.out.println();
	}
	//	3. Display the numbers 1 through 100 in a 10x10 square grid.
	System.out.println();
	for(int j=0;j<100;j+=10) {
		for(int i=1;i<11;i++) {
			System.out.print(i+j+" ");

		}
		System.out.println();
	}
	//	4. Display the following output:
	//	          *
	//	          *  *
	//	          *  *  *
	//	          *  *  *  *
	//	          *  *  *  *  *
	//	          *  *  *  *  *  *
	for(int j=1;j<7;j++) {
	for(int i=0;i<j;i++) {
		System.out.print("*");
	}System.out.println();
	}
	//	**Bonus**
	//	Write a for loop that counts down from 100 to 0. However, the for loop must start with for(int i = 0; and you may NOT have any code ABOVE your for loop.
	for(int i=0;i<101;i++) {
		System.out.println(100-i);
	}
}
}