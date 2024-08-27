package Numpack;
import java.util.*;
public class AutomorphicNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=scan.nextInt();
		int sum=0;
		String num1=""; 
		num1=num1+num;
		int square=num*num;
		
		switch(num1.length())
		{
		case 1:
			sum=square%10;
			if(sum==num)
				System.out.println(num+" is Automorphic Number");
			break;
		case 2:
			sum=square%100;
			if(sum==num)
				System.out.println(num+" is Automorphic Number");
			break;
		case 3:
			sum=square%1000;
			if(sum==num)
				System.out.println(num+" is Automorphic Number");
			break;
		case 4:
			sum=square%10000;
			if(sum==num)
				System.out.println(num+" is Automorphic Number");
			break;
		case 5:
			sum=square%100000;
			if(sum==num)
				System.out.println(num+" is Automorphic Number");
			break;
			default:
				System.out.println("Enter Valid number");
			
		}
		
		
		
scan.close();
	}

}
