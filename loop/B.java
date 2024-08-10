import java.util.*;

class B {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num = ");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		
		for (int i = b; i > a; i--) {
		
			if(i<=1) continue;
			boolean flag=true;
			for(int j=2; j<=i/2; j++){
				if(i%j==0){
					flag=false;
					break;
				}
				
			}
			if(flag){
				System.out.println (i);
				
			}
		}
		
		
	}
}

