import java.util.Scanner;
class secHighestAutomorphic
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
           int count=0;
	   for(int i=end;i>=st;i--)
	   {
             if(isAutomorphic(i)){
              count++;
               if(count==2)
		System.out.println(i);}
           }
       }
}