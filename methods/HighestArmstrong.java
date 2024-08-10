import java.util.Scanner;

class HighestArmstrong
 {
    public static boolean isArmstrongNum(int n) {
        int num=n;
        int count=0;
        while (n>0) 
        {
          count++;
          n=n/10;
        }
         n=num; 
         int sum =0;
       while(n>0)
       {
        int product=1;
        int d=n%10;
        for(int i=1;i<=count;i++)
           {
             product*=d;
            }
            sum+=product;
            n=n/10;
         }

         if(sum==num)return true;
         else
         return false;
         
       }

    public static void main(String[] args) 
     {
        range(1,100);
     }
     public static void range(int st,int end)
	{
	       
		for(int i=end;i>=st;i--)
                {
		   if(isArmstrongNum(i)){
                   
			System.out.println(i);
			break;
		   }
                }
        }
    
}
