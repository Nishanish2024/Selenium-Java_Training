package week1.day4;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] num= {2,5,7,7,5,9,2,3};
		Arrays.sort(num); //
		System.out.println("Duplicates are");
		System.out.println("--------Method 1 single for loop --------");
		for(int i=0; i< num.length -1 ; i++)
		{
				if(num[i]==num[i+1]) {
					System.out.println(num[i]);
				}
					
		}
		
		System.out.println("--------Method 2 nested for loop --------");
		for(int i=0; i< num.length -1 ; i++)
		{
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
					
		}

	}

}
