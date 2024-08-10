import java.util.*;
class neon
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("enter a num");
		int n=a.nextInt();
		int sq=n*n;
		int sum+=0;
		
		for (int i=sq ;i>0 ;i/=10){
			sum+=i%10;
		}
			if (sum==n){ 
				System.out.println(n+"is a neon number");
			}
			else
				System.out.println(n+"is not a neon number");
	}
}

