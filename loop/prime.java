import java.util.*;
class prime  
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		 System.out.println("enter a num");
		int n=a.nextInt();
		boolean flag=true;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag=false;
				
			}
		}
		if (flag) System.out.println("prime num");
		else System.out.println(" not prime num");
	}
}
