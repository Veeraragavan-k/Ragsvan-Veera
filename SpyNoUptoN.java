package Numpack;
import java.util.*;
public class SpyNoUptoN {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int Number=scan.nextInt();
    for(int i=1;i<=Number;i++)
    {
    int num=i;
	
	int sum=0;
	int product=1;
	
	while(num>0)
	{
		int rem=num%10;
		sum=sum+rem;
		product=product*rem;
		num=num/10;
	}
	if(sum==product)
		System.out.println(i);
    }
	scan.close();
	}
}
