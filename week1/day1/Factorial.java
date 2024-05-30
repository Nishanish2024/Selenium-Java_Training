package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int input=5;
		getFactorial(input);
	}

	public static int getFactorial(int num) {
		System.out.println("Find the Factorial of "+num);
		int factor=1;
		for(int i=1; i<=num;i++) {
			factor=factor*i;
		}
		System.out.println("factor="+factor);
		return factor;
	}
}
