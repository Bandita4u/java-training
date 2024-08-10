import java.util.Scanner;
class automorphic
{
      public static boolean isAutomorphic(int n)
      {
          int square=n*n;
           
           boolean flag=true;
            while(n>0)
             {
	      if((n%10)!=(square%10))
              {
                flag=false;
                break;
              }
               n/=10;
               square/=10;
             }
  
          if(flag==true)
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
	   for(int i=st;i<=end;i++)
	   {
             if(isAutomorphic(i))
		System.out.println(i);
           }
       }
}