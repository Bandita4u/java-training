import java.util.*;
class b
	{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		for(int i=0; i<n;i++){
			
			for (int j=0;j<n ; j++ )
			{
				if (j==0 || i==3 || j==5)
				{
					System.out.print(" * ");
				}else{
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}
			for(int rows=1; rows<n;rows++){
			
			for (int col=1; col<n ; col++ )
			{
				if (rows==0 || rows==n-1 || col==n/2)
				{
					System.out.print(" * ");
				}else{
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}