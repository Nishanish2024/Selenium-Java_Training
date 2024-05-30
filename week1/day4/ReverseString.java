package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		String companyName="TestLeaf";
		reverseString(companyName);
	}
	
	public static String reverseString(String input) 
	{
		String reverse="";
		System.out.print("Input is: "+input);
		char[] charArray=input.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			reverse=reverse+charArray[i];
		}
		System.out.print("\nReversed String is: "+reverse);
		return reverse;
	}
}
