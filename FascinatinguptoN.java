
    package Numpack;
    import java.util.*;
    
    public class FascinatinguptoN {
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number upto 333 : ");
	int Number1=scan.nextInt();
	for(int a=1;a<=Number1;a++){
	int num=a;
	int Number=num;
	String Fasci="";
	Fasci=Fasci+num;
	while(Fasci.length()==3 && Fasci.length()<9){
		Fasci=Fasci+num*2;
		Fasci=Fasci+num*3;
	char Fascin[]= {'1','2','3','4','5','6','7','8','9'};
	char Fascino[]=new char[Fasci.length()];
	for(int i=0;i<Fasci.length();i++){
		Fascino[i]=Fasci.charAt(i);
	}
	
	for(int j=0;j<Fasci.length();j++){
		for(int k=j+1;k<Fasci.length();k++){
			if(Fascino[j]>Fascino[k]){
				char temp=Fascino[j];
				Fascino[j]=Fascino[k];
				Fascino[k]=temp;
			}
		}
	}
		boolean check=true;
		for(int z=0;z<Fasci.length();z++){
			if(Fascino[z]!=Fascin[z]){
				check=false;
			}
		}
		
		if(check){
			System.out.println(Number+" is Fascinating Number");
		}
	}
	
	}
	scan.close();

	}
    }
