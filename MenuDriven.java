package TestQuestions;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("1.print prime numbers from 1 to n");
		System.out.println("2.print sum of digits of given number");
		System.out.println("3.cheak weather the number is palindrome or not");
		System.out.println("4.exit");
		
		int choice=0;
		
		do
		{
			System.out.println("enter choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				   int count=0,sum=0;
				   System.out.println("Enter number:");
				   int n=sc.nextInt();
				   for(int i=0;i<n;i++)
				   {
					   count=0;
					   for(int j=2;j<i;j++)
					   {
						   if(i%j==0)
						   {
							   count++;
						   }
					   }
					   if(count==0 && i!=1)
					   {
						   sum=sum+i;
					   }
				   }
				   System.out.println(sum);
				break;
			case 2:
				  System.out.println("enter number");
				  int num=sc.nextInt();
				  int sum1=0,n1=0;
				  for(int i=0;i<num;)
				  {
					   n1=num%10;
					  num=num/10;
					  sum1=sum1+n1;
				  }
				System.out.printf("sum of digits of of entered number is:%d/n",sum1);
				break;
			case 3:
				System.out.println("enter the number to cheak weather it is palindrome or not");
			    int num1=sc.nextInt();
			    int sum2=0,s=num1;
			    while(s>0)
			    {
			    	int r=s%10;	    	
			    	sum2=sum2*10+r;	
			    	s=s/10;
			    }
			    if(num1==sum2)
			    {
			    	System.out.println("numner is palindrome");
			    }
			    else
			    {
			    	System.out.println("number is not palindrome");
			    }
				
				break;
			case 4:
				System.out.println("succesfully exited :)");
				break;
				
			}
			
		}while(choice!=4);
		sc.close();
	}

}
