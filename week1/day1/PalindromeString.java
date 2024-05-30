package week1.day1;

public class PalindromeString {

	public static void main(String[] args) {
		String input="racecar";
		checkPalindrome(input);

	}
	public static boolean checkPalindrome(String str) {
		boolean flag=false;
		String reverse="";
		System.out.println("Input : "+str);
		if(str.isEmpty()) {
			System.out.println("Invalid input");
		}
		else {
			
			char[] charArray=str.toCharArray();
			for (int i = charArray.length-1; i >=0 ; i--) {
				reverse=reverse+charArray[i];
			}
			System.out.println("Reversed String is: "+reverse);
		}
				
		if(str.equals(reverse)) {
			flag=true;
			System.out.println("It is a Palindrome");
		}
		else {
			flag=false;
			System.out.println("It is a not Palindrome");
		}
		return flag;
	}
}
