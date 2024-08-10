import java.util.*;
class primeSecLarge
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
		int count=0;
		for (int i=end ; i>=st ; i-- )
		{
			if (isPrime(i)){ 
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
	
