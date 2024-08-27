package Numpack;
import java.util.*;
public class EmirpNO {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		int Number=num;
		int sum=0;
		int prime=0;
		
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
					prime=prime+1;
				}
			}
			
		}
		if(prime==4)
			System.out.println(Number+" is Emirp Number");
	scan.close();	

	}

}
