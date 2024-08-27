package Numpack;
import java.util.*;
public class PalindromeUPtoN {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int num=scan.nextInt(); 
    int sum;
    for(int i=1;i<=num;i++)
    {
    	int temp=i;
    	sum=0;
    	while(temp>0)
    	{
    		int rem=temp%10;
    		sum=sum*10+rem;
    		temp=temp/10;
    	}
    	if(sum==i)
    	{
    		System.out.println(i);
    	}
    }

scan.close();
	}

}
