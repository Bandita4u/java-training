import java.util.*;
class spy
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("enter a num");
		int n=a.nextInt();
		int mul=1;
		int sum=0;
		int m=n;
		for (int i=n ;i>0 ;i/=10){
			int r=i%10;
			sum+=r;
			mul*=r;
		}
			if (sum==mul){ 
				System.out.println(m+"is a spy number");
			}
			else
				System.out.println(m+"is not a spy number");
	}
}
