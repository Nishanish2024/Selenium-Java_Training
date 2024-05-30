package week4.day2;

import org.testng.annotations.Test;

public class LengthOfLastWord {
	@Test
	public void lastWord() {
		//String S ="   fly me   to   the moon  ";
		String S = "luffy is still joyboy";
		String[] wordArray = S.split(" ");
		System.out.println("Input String: " + S);
		System.out.println("----------------------------------");
		int length=0;
		String lastWord ="";
		int arraySize = wordArray.length;
		//System.out.println("length of the wordArray: " + arraySize);
		if(arraySize > 0) {
			lastWord = wordArray[arraySize - 1];
			length = lastWord.length();
			System.out.println("Last word is: " + lastWord);
		}
		
		System.out.println("Length of the last word: " + length);
	}

}
