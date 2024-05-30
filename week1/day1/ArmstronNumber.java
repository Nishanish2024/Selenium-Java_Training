package week1.day1;

public class ArmstronNumber {

	public static void main(String[] args) {
		long num=153;
		isArmStrong(num);

	}

	public static boolean isArmStrong(long num) {
		boolean armstrong=false;
		long output=0;
		long remainder=0;
		System.out.println("Input : "+num);
		long temp=num;
		while (num >0){
			remainder = num%10;
			output = (long) (output + Math.pow(remainder, 3));
			num=num/10;
		}
		if(temp==output)
		{
			armstrong=true;
			System.out.println("It is a ArmStrong Number");
		}
		else {
			armstrong=false;
			System.out.println("It is a not ArmStrong Number");
		}
		return armstrong;
	}
}
