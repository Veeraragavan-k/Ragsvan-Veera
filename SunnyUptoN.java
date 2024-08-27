package Numpack;
import java.util.Scanner;
public class SunnyUptoN {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the Number : ");
	    int num=scan.nextInt();
	    for(int i=1;i<=num;i++)
	    {
	    int sun=i+1;
	    double sum=Math.sqrt(sun);
	    if(sum%1==0)
	    	System.out.println(i+" is sunny Number");
	   // else
	    	//System.out.println(i+" is Not sunny Number");
	    }
	    scan.close();
	}

}
