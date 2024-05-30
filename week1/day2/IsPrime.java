package week1.day2;

public class IsPrime {

	public boolean checkPrime(int num) {
		boolean flag=false;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		
		return flag;	
	}
	
	public void primeNoSeries() {
		int num=30;
		int flag;
		System.out.println("Prime numbers between  1 and "+ num +" are :");
		for(int i=1; i<=num; i++) {
			flag=0;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j ==0) {
					//System.out.println(j+" is not a prime number ");
					flag=flag+1;
					break;
				}
			}
			if(flag==0)
				System.out.print(" "+i);
		}

	}
	
	
	public static void main(String[] args) {
		int num=16;
		System.out.println("Entered no to check whether this is prime or not is: " + num);
		IsPrime objPrime=new IsPrime();
		
		boolean flag=objPrime.checkPrime(num);
		if(!flag)
			System.out.println(num +" is a prime number");
		else
			System.out.println(num +" is a not prime number");	
		
		objPrime.primeNoSeries();
	}
}
