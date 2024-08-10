import java.util.*;
class primelarge
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
		for (int i=end ; i>=st ; i-- )
		{
			if (isPrime(i)){ 
				System.out.println(i);
				break;
			}
		}
	}
	public static void main (String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a range :");
		int end = s.nextInt();
		int st = s.nextInt();

		range(st,end);
	}
}