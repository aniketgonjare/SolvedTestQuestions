package string;

import java.util.Scanner;

public class Anagram_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second string");
		String str2=sc.nextLine();
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		int index=0,counter=0,d=0,l=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[index]==arr1[j])
				{
					counter++;
				}
			}
			
			for(int k=0;k<arr2.length;k++)
			{
				if(arr2[k]==arr1[index])
				{		
					d++;
				}
			}
			if(d!=counter)
			{
				l++;
				break;
			}
			else
			{
				
			}
			counter=0;
			index++;
			d=0;
		}
		if(l==0)
		{
			System.out.println("given strings are Anagram");
		}
		else
		{
			System.out.println("given strings are not Anagram");
		}
		sc.close();

	}

}
