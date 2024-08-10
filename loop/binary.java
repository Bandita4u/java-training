import java.util.Scanner;
class binary

{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = a.nextInt();
		int t=n;
		String s="";
		while(n>0){
			int r=n%2;
			n/=2;
			s=r+s;
		}
		System.out.println(s);
	}
}