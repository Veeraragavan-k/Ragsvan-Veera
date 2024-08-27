package Numpack;
import java.util.Scanner;
public class DuckNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=scan.nextInt();
       
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
        	 System.out.println("Duck Number");
         }
         else
         {
        	 System.out.println("Not Duck Number");
         }
         scan.close();
	}

}
