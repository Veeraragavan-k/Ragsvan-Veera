   
    package Numpack;
    import java.util.*;
    public class TechNo {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the Number upto 999999");
     int Number=scan.nextInt();
     for(int i=1;i<=Number;i++)
     {
     int num=i;
     int temp=num;
     int quotient=num/100;
     int remainder=num%100;
     int sum=quotient+remainder;
     int sqrt=sum*sum;
     
     
     if(temp==sqrt)
    	 System.out.print(temp+" ");
     }
     scan.close();
	 }
     }

/*
     COMMENT ANSWER :
     
     A. 1 2025 3025 9801 10000
     B. 1 205 325 981 1011 1234 
     
     
*/