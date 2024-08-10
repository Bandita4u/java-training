import java.util.Scanner;
class alterNeonNum
{
	public static boolean isNeon(int n)
 	{
           int sum=0;
           int square=n*n;
            
          for(;square!=0;square/=10)
           {
            int r=square%10;
            sum=r+sum;
            }
              if(sum==n)
              return true;
              else
              return false; 
        }
        public static void main(String[]args)
        {
	     range(1,100);
           

        }
        public static void range(int st,int end)
	{
		 int count=0;
		for(int i=st;i<=end;i++)
		{
                  if(isNeon(i))
		  {
                    count++;
                    if(count%2!=0)
                    System.out.println(i);
		  }
                }
	}
}