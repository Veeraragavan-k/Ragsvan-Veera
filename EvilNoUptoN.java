package Numpack;
import java.util.*;
public class EvilNoUptoN {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int nums=scan.nextInt();
	
	for(int i=1;i<=nums;i++)
	{
		int num=i;
		int temp=num;
		String Binary= "";
		while(num>0)
		{
			int rem=num%2;
			Binary=rem+Binary;
			
			num=num/2;
		}
		//System.out.println(Binary);
		
		int count=0;
		for(int a=0;a<Binary.length();a++)
		{
			if(Binary.charAt(a)=='1')
			{
				count=count+1;
			}
		}
		//System.out.println(count);
		if(count%2==0)
		{
			System.out.println(temp+" is Evil Number");
		}
		
	}
scan.close();
	}

}
