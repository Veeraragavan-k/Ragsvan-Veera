package Numpack;
import java.util.*;
public class SunnyNO {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int num=scan.nextInt();
    int sun=num+1;
    double sum=Math.sqrt(sun);
    if(sum%1==0)
    {
    	System.out.println(num+" is sunny Number");
    }
    else
    	System.out.println(num+" is Not sunny Number");
    scan.close();
    }

}
