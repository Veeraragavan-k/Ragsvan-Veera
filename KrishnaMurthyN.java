package Numpack;

public class KrishnaMurthyN {

	public static void main(String[] args) {
		int num=40585;
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
		else
		{
			System.out.println(temp+" is Not Krishnamurthy Number");
		}

	}

}
