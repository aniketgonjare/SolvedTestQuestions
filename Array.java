package TestQuestions;

import java.util.Scanner;

public class Array {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr1=new int[4];
		int[] arr2=new int[4];
		int num1=0,num2=0,num3;
		
		System.out.println("enter array elements:");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			num1=0;	
			for(int j=0;j<arr1.length;j++)
			{
				num1=arr1[j]*j+num1;
				num2++;
			}
			num3=arr1[0];
			for(int k=0;k<arr1.length;k++)
			{
				if(k<3)
					arr1[k]=arr1[k+1];
				else
					arr1[k]=num3;
			}
			arr2[i]=num1;
		}
		int temp=arr2[0];
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]>temp)
			{
				arr2[0]=arr2[i];
				temp=arr2[i];
			}
		}
		
		System.out.println(arr2[0]);
	}

}
