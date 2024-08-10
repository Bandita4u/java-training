import java.util.*;
class strongseclarge
{
	public static boolean strong(int n){
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int prod=1;
			for (int i=1 ; i<=r ; i++ )
			{
				prod*=i;
			}
			sum+=prod;
			n/=10;
		}
			if (temp==sum)
				return true;
			else
				return false;
	}
	public static void range(int st, int end){
		int count=0;
		for (int i=st ; i<=end ; i++ )
		{
			if (strong(i))
			{
				count++;
				if (count==2)
				{
					System.out.println(i);
					break;
					
				}
			}
		}
				
	}
	public static void main (String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a range :");
		int st = s.nextInt();
		int end = s.nextInt();

		range(st,end);
	}
}
	
