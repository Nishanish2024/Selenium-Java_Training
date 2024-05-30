package week1.day1;

public class ReverseEvenPosition {

	public static void main(String[] args) {
		String input="I am a software tester";
		reverseEvenWords(input);
	}

	public static String reverseEvenWords(String str) {
		System.out.println("Input String ---> "+str);
		String tempStr="";
		String finalString="";
		String[] splitStr=str.split(" ");
		for (int i = 0; i <= splitStr.length - 1; i++) {
			String reverse="";
			tempStr=splitStr[i];
			
			if((i+1) % 2 == 0) {
				//System.out.println("i="+i);
				char[] charArray=tempStr.toCharArray();
				for (int j = charArray.length -1 ; j >=0 ; j--) {
					reverse=reverse +charArray[j] ;
				}
				finalString=finalString +" "+ reverse;
				//System.out.println("(inside IF)finalString= "+finalString);
			}
			else {
				finalString=finalString +" "+ splitStr[i] ;
				//System.out.println("(Else loop)finalString= "+finalString);
			}	
		}		
		finalString = finalString + " ";
		System.out.println("\n<----String reversed on even positions----> \n "+finalString);
		return finalString;
	}
}
