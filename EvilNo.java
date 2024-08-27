package Numpack;

public class EvilNo {

	public static void main(String[] args) {
		int num=15;
		int temp=num;
		String Binary= "";
		while(num>0)
		{
			int rem=num%2;
			Binary=rem+Binary;
			
			num=num/2;
		}
		System.out.println(Binary);
		
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
		else
		{
			System.out.println(temp+" is Not Evil Number");
		}

	}

}
