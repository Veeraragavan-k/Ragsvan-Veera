package Numpack;
import java.util.*;
public class BuzzNoUptoN {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i%10==7 || i%7==0)
			{
				System.out.println(i+" is Buzz Number");
			}
			else
			{
				System.out.println(i+" is Not Buzz Number");
			}
		}
		
		scan.close();
	}

}
