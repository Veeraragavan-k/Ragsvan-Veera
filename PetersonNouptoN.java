package Numpack;
import java.util.*;
public class PetersonNouptoN {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int num=scan.nextInt();
	for(int i=1;i<=num;i++)
	{
		int temp=i;
		int sum=0;
		
		while(temp>0)
		{
			int rem=temp%10;
			int j=1;
			int fact=1;    
			while(j<=rem)
			{
				fact=fact*j;
				//System.out.println(fact);
				j++;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==i)
		System.out.println(i);
		scan.close();

	}
	

	}

}
