package Numpack;
import java.util.*;
public class KeithUptoN {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int Number=scan.nextInt();
    for(int z=1;z<=Number;z++)
    {
    int num=z;
	int first=0;
	int last=0;
	int mid=0;
	int Smid=0;
	int sum=0;
	int temp=num;
	if(num>11 && 99>=num)
	{
	    first=num/10;
	    last=num%10;
	
	    while(sum<temp)
	    {
	    	sum=first+last;
	    	 first=last;
	    	last=sum;
	    	
	    }
	}
	else if(num>99 && 999>=num)
	{
		last=num%10;
		num=num/10;
		mid=num%10;
		first=num/10;
		
	    while(sum<temp)
	    {
	    	sum=first+mid+last;
	    	 first=mid;
	    	mid=last;
	    	last=sum;
	    	
	    }
	}
	else if(num>999 && 9999>=num)
	{
		last=num%10;
		num=num/10;
		Smid=num%10;
		num=num/10;
		mid=num%10;
		first=num/10;
		
	    while(sum<temp)
	    {
	    	sum=first+mid+Smid+last;
	    	 first=mid;
	    	mid=Smid;
	    	Smid=last;
	    	last=sum;
	    	
	    } 
	}
	 if(sum==temp)
		    
	    	System.out.println(temp+" is Keith Number");
    }
    scan.close();
	}

}
