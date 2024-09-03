import java.util.*;
class fibonacci
	{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		 System.out.println("enter a num");
		int n=a.nextInt();
		int k=0;	// first digit of series
		int m = 1;	// second digit of series

		System.out.print(k + " " + m + " ");	// print both the digits first	
		for(int i=1; i<n; i++){			// then print afterwards
			int x=k+m;
			k = m;
			m = x;
			System.out.print(m + " ");
		
		}
	}
}
