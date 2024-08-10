import java.util.*;
class prime
{
	public static boolean isPrime(int n){
		if (n<=1) return false;
			for (int i=2 ; i<=n/2 ; i++ )
			{
				if (n%i==0) return false;
			}
		return true;
	}
	public static void range(int st, int end){
		for (int i=st ; i<=end ; i++ )
		{
			if (isPrime(i))
				System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a range: ");
		int st=s.nextInt();
		int end=s.nextInt();
		range(st,end);
	}
}
