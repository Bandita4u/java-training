import java.util.Scanner;
class decimal

{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = a.nextInt();
		int d=0;
		int t=n;
		int i=0;
		while(n>0){
			int r=n%10;
			n/=10;
			d=d+r*(int)Math.pow(2,i++);
		}
		System.out.println(d);
	}
}
