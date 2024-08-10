import java.util.Scanner;
class palindrome

{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = a.nextInt();
		int reverse = 0;
		int m=n;
		while(n != 0){
			int r = n % 10;
			reverse = reverse*10 + r;
			n /= 10;

		}
		if (m==reverse) // to compare value always use double =
		{
			System.out.println(m + "is Palindrome");
		}
		else {
			System.out.println(m+"not palindrome");
		}
	}
}