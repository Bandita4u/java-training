import java.util.*;
class sumprime  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter a num");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
	
		for(int i=a;i<=b;i++){
			if(i<=0) continue;
				boolean flag=true;
			   for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			   }
			if (flag){
		     sum+=i;
			System.out.println(sum);
			break;

			}
		}
		
		}
	}


