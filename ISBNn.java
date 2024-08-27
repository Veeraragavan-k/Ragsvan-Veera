package Numpack;

public class ISBNn {

	public static void main(String[] args) {
		long  num=43;
		long temp=num;
		long sum=0;
		long i=1;
		while(num>0)
		{
			long rem=num%10;
			sum=sum+(i*rem);
			num=num/10;
			i++;
			
		}
		System.out.println(sum);
		if(sum%11==0)
		{
			System.out.println(temp+" is ISBN Number");
		}
		else
		{
			System.out.println(temp+" is Not ISBN Number");
		}
	}

}
