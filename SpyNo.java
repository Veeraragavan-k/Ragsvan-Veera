    
    package Numpack;
    public class SpyNo {

	public static void main(String[] args) {
		
		int num=4121;
		int Number=num;
		int sum=0;
		int product=1;
		
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		if(sum==product)
			System.out.println(Number+" is Spy Number");
		else
			System.out.println(Number+" is Not Spy Number");
			}
        }

    
/*
      COMMENT ANSWER :
      A. 4121 is Spy Number
      B. 4121 is Not Spy Number

*/