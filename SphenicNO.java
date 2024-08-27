package Numpack;
import java.util.*;
public class SphenicNO {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Sphenic Number Program");
	int num=39;
     String product="";
     String factor[]= {};
     
     
     for(int i=1;i<=num;i++)
     {
    	if(num%i==0)
    	{
    	product=product+i+" ";
    	}
     }  
     factor=product.split(" ");
     
     Integer[] numbers = new Integer[factor.length];
     for(int i = 0;i < factor.length;i++)        
     {
    	 numbers[i] = Integer.parseInt(factor[i]);
     }
     int sum=1;
     
     if(numbers.length>2)
	 {   
        for(int x=0;x<numbers.length;x++)
        {
        	int prime=0;
        	for(int y=1;y<=numbers[x];y++)
        	{
        		if(numbers[x]%y==0)
        		{
        			prime=prime+1;
        		}
        	}
        	if(prime==2)
        	{
        		System.out.println(numbers[x]);
        		sum=sum*numbers[x];
        	}
        	//System.out.println(sum);
        }
        if(sum==num)
        {
        	System.out.println(num+" is Sphenic Number");
        }
       // System.out.println(sum);
     }
     
     scan.close();
     
	 }
	}


