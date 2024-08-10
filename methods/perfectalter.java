import java.util.*;
class perfectalter
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
		for (int i=st ; i<=end ; i++ )
		{
			if (perfect(i))
			{
				count++;
				if (count%2!=0)
				{
					System.out.println(i);
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
	
