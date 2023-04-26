package string;

import java.util.Scanner;

public class Second_Occurance {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter string");
    	String s=sc.nextLine();
    	int count=0,d=0,i=0;
    	
    	System.out.println("enter char");
    	char c=sc.next().charAt(0);
    	sc.close();
    	char[] arr=s.toCharArray();
    	for( i=arr.length-1;i>0;i--)
    	{
    		if(arr[i]==c)
    		{
    			count++;
    			if(count==2)
    			{
    				d++;
    				break;
    			}
    		}
    	}
    	if(d==1)
    	{
    		System.out.println(i);
    	}
    	else if(count==1)
    	{
    		System.out.println("No two occurance");
    	}
    	else
    	{
    		System.out.println("char not present");
    	}
    	
    }
}
