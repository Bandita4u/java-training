import java.util.*;
class perfectseclarge
{
	public static boolean perfect(int n){
		int sum=0;
		for (int i=1; i<=n/2 ; i++)
		{
			if (n%i==0) 
			{
				sum+=i;
			}
		}
			if (n==sum)
				return true;
			else
				return false;
	}
	public static void range(int st, int end){
		int count=0;
		for (int i=end ; i>=st ; i-- )
		{
			if (perfect(i))
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
	