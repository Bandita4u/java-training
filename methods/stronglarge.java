import java.util.*;
class stronglarge
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
		
		for (int i=end ; i>=st ; i-- )
		{
			if (strong(i))
		    {
				System.out.println(i);
				break;
					
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
	
