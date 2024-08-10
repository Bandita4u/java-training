import java.util.*;
class reverse
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("enter a num");
		int n=a.nextInt();
		int r=0;

		for (int i=n;i>0 ;i/=10){
			int s=i%10;
			r=r*10+s;
		}
		System.out.println(r);
	}
}
			
