package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Sort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");
	String str1=sc.nextLine();
	System.out.println("enter second string");
	String str2=sc.nextLine();
	char[] arr1=str1.toCharArray();
	char[] arr2=str2.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	System.out.println(arr1);
	System.out.println(arr2);

	if(Arrays.equals(arr1, arr2))
	{
		System.out.println("given strings are Anagram");
	}
	else
	{
		
		System.out.println("given strings are not Anagram");
	}
}
}
