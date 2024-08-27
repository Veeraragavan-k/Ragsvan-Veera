   
    package Numpack;
    public class KeithNo {

	public static void main(String[] args) {
	int num=19;
	int first=0;
	int last=0;
	int sum;
	int temp=num;
	if(num>11 && 99>=num)
	{
	    first=num/10;
	    last=num%10;
	sum=0;
	    while(sum<temp)
	    {
	    	sum=first+last;
	    	 first=last;
	    	last=sum;
	    }
	    if(sum==temp)
	    	System.out.println(temp+" is Keith Number");
	    else
	    	System.out.println(temp+" is Not Keith Number");
	}
	}

    }

/*  
 
     COMMENT ANSWER :
     A. 19 is Keith Number
     B. 19 is Not Keith Number
      
*/
    