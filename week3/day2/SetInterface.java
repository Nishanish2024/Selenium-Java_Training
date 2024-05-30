package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		 String companyName = "google";
		 System.out.println("companyName = "+companyName);
		 char[] cName=companyName.toCharArray();
		 Set<Character> names= new LinkedHashSet<Character>();
		 for(int i=0; i<cName.length ; i++) {
			 names.add(cName[i]);
			// System.out.print(cName[i]);
		 }
		 System.out.println("unique characters are : "+names);
	}

}
