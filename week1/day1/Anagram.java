package week1.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String input1="stop";
		String input2="post";
		isAnagram(input1,input2);
	}
	
	public static boolean isAnagram(String input1, String input2) {	
		String str1 = input1.toLowerCase();
		String str2 = input2.toLowerCase();
		boolean flag=false;
		// check if length is same
	    if(str1.length() == str2.length()) {

	      // convert strings to char array
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();

	      // sort the char array
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);

	      // if sorted char arrays are same
	      // then the string is anagram
	      boolean result = Arrays.equals(charArray1, charArray2);
	      if(result) {
	          System.out.println(str1 + " and " + str2 + " are anagram.");
	        }
	        else {
	          System.out.println(str1 + " and " + str2 + " are not anagram.");
	        }
	    }
	    else {
	    	flag=false;
	    	System.out.println(str1 + " and " + str2 + " are not anagram.");
	    }
		return flag;
	}
}
