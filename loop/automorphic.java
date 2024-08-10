import java.util.Scanner;
class automorphic

{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = a.nextInt(); ////n=5
		int sq=n*n;//sq=25
		while(n > 0) {
			
			if (n % 10 == sq % 10)//
			{
				System.out.println(" Automorphic");
			}

			else{
				System.out.println ("not Automorphic");
			}
	}

}
}

	