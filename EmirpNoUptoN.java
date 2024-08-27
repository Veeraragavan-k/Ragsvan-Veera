package Numpack;

import java.util.Scanner;

public class EmirpNoUptoN {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int Numb=scan.nextInt();
		int count=0;
		for(int x=1;x<=Numb;x++)
		{
		int num=x;
		//int Number=num;
		int sum=0;
		int prime=0;
		int prime1=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				prime=prime+1;
			}
		}
		if(prime==2)
		{
			while(num>0)
			{
				int rem=num%10;
				sum=sum*10+rem;
				num=num/10;
			}
			for(int j=1;j<=sum;j++)
			{
				if(sum%j==0)
				{
					prime1=prime1+1;
				}
			}
			
		}
		
		if(prime1==2)
		{
			System.out.println(x+" is Emirp Number");
		count=count+1;
		}
		}
		System.out.println("*"+count);
		scan.close();
	}

}
