package Numpack;
import java.util.*;
public class DuckNoUptoN {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number");
	int nums=scan.nextInt();
	
	for(int i=1;i<=nums;i++)
	{
		int num=i;
		 int count=0;
	        while(num>0 && num>9)
	        {
	        	int rem=num%10;
	        	
	        	if(rem==0)
	        	{
	        		
	        		count=count+1;
	        	}
	        	num=num/10;
	        }
	        if(count>0)
	         {
	        	 System.out.println(i+"Duck Number");
	         }
	         else
	         {
	        	 System.out.println(i+"Not Duck Number");
	         }
	         
	}
scan.close();
	}

}
