package algorithms;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
	
		System.out.println(a+"\n"+b);
		for(int i=0; i<11; i++) {
		System.out.println(a+b);
		int temp=a;
		a=b;
		b=temp+b;
	
		}
		
		
		}
		
		
		
	}
	