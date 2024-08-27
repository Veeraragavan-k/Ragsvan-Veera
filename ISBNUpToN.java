package Numpack;

public class ISBNUpToN {

	public static void main(String[] args) {
    int num=250;
    
    for(int i=1;i<=num;i++)
    {   int sum=0; 
    	int nums=i;
    	int j=1;
    	while(nums>0)
    	{
    		int rem=nums%10;
    		sum=sum+(j*rem);
    		nums=nums/10;
    		j++;
    	}
    	//System.out.println(sum);
    	if(sum%11==0)
		{
			System.out.println(i+" is ISBN Number");
		}
		else
		{
			//System.out.println(i+" is Not ISBN Number");
		}
    	
    }
    
	}

}
