package Numpack;
import java.util.*;
public class PetersonNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=scan.nextInt();
		int temp=num;
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			int j=1;
			int fact=1;
			while(j<=rem)
			{
				fact=fact*j;
				//System.out.println(fact);
				j++;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==temp)
		System.out.println(temp);
		scan.close();

	}

}
