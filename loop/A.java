import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		
		long n = a.nextLong();
		long b = a.nextLong();
		
		for (long i = 1; i <= b; i++) {
		 	 
			long multiply = n * i;
			
			System.out.println (n+"*"+ i +"="+ multiply);
		}
		
		
	}
}