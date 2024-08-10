import java.util.*;

class largest {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num = ");
		
		int a=sc.nextInt();
		int b=sc.nextInt();

		int largest = 0;
		int secondLargest = 0;
		
		
		for (int i = b; i >= a; i--) {
		
			if(i<=1) continue;
			boolean flag=true;
			for(int j=2; j<= i/2; j++){
				if(i%j==0){
					flag=false;
					break;
				}
				
			}
			if(flag){
				if (i > largest) {
					secondLargest = largest;
					largest = i;
				}

				else if (i > secondLargest && i != largest) {
					secondLargest = i;
				}
				
				
			}
		}

		System.out.println (secondLargest);
		
		
	}
}

