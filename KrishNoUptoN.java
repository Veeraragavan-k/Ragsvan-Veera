package Numpack;
import java.util.*;
public class KrishNoUptoN {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
        int nums=scan.nextInt();
        
        for(int j=1;j<=nums;j++)
        {
        	int num=j;
    		int fact;
    		int sum=0;
    		int temp=num;
    		
    		while(num>0)
    		{
    			int rem=num%10;
    			fact=1;
    			
    			
    			for(int i=1;i<=rem;i++)
    			{
    				fact=fact*i;
    			}
    			//System.out.println(fact);
    			sum=sum+fact;
    			
    			num=num/10;
    		}
    		//System.out.println(sum);
    		if(temp==sum)
    		{
    			System.out.println(temp+" is Krishnamurthy Number");
    		}
        }
        scan.close();
	}

}
