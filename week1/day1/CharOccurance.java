package week1.day1;

public class CharOccurance {

	public static void main(String[] args) {
		String input="welcome to Chennai";
		charCount(input);

	}
	public static int charCount(String str) {
		int count=0;
		System.out.println("Input : "+str);
		char occurenceOf='e';
		char[] charArray=str.toCharArray();
		for (int i =0; i <= charArray.length-1; i++) {
			if(charArray[i] == occurenceOf) {
				//System.out.println("i=" + charArray[i]);
				count= count+1;
			}
		}
		System.out.println("The no of Occurence of "+ occurenceOf +" is: "+count);
		
		return count;
	}
}
