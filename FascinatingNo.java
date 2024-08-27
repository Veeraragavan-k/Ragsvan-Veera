package Numpack;
import java.util.*;
public class FascinatingNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int num=scan.nextInt();
		int Number=num;
		String Fasci="";
		Fasci=Fasci+num;
		
		while(Fasci.length()>=3 && Fasci.length()<9)
		{
			Fasci=Fasci+num*2;
			Fasci=Fasci+num*3;
			
		}
		
		char Fascin[]= {'1','2','3','4','5','6','7','8','9'};
		
		char Fascino[]=new char[Fasci.length()];
		Fascino=Fasci.toCharArray();
		/*for(int i=0;i<Fasci.length();i++)
		{
			Fascino[i]=Fasci.charAt(i);
		}
		
		for(int j=0;j<Fasci.length();j++)
		{
			for(int k=j+1;k<Fasci.length();k++)
			{
				if(Fascino[j]>Fascino[k])
				{
					char temp=Fascino[j];
					Fascino[j]=Fascino[k];
					Fascino[k]=temp;
				}
			}
		}*/
		Arrays.sort(Fascino);
			boolean check=true;
			for(int z=0;z<Fasci.length();z++)
			{
				
				
				
				if(Fascino[z]!=Fascin[z])
				{
					check=false;
				}
			}
			
			
			
			if(check)
			{
				System.out.println(Number+" is Fascinating Number");
			}
			else
				System.out.println(Number+" is Not Fascinating Number");
		
		
		
		
		scan.close();

	}

}
