import java.util.*;
class armstrong
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
	    System.out.println("enter a num");
		int num = a.nextInt();
		int b=a.nextInt();
		int digit;
		int count;
		int result;
		int i;
		for ( i =num; i <= b; i++ )
		{
			 digit = i; // to keep the input number safe and unchanged
			 result = 0;
			 count = 0;
			
			while (digit != 0)
			{
				digit /= 10;
				count++;	// count the number of digit
			}
		}
		

		digit = i;		// updating input number into the variable

		// to calculate the power and then sum

		while (digit != 0)		// digit
		{
			int remainder = digit % 10;	//
			int power = 1;	// 

			for ( i = 1; i <=count; i++)
			{
				power *= remainder;		// make the  power of num; n times
			}

			result += power;	// 27+125+1		//add all the powers of all digits
			digit /= 10;
		}

		if (result == i)
		{
			System.out.println(i );
		}
		

	}
}