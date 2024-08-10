import java.util.Scanner;

class secHighestPalindrome {
    public static boolean isPalindrome(int n) {
        int num=n;
        int reverse=0;
        int i;
      while (n>0) {
      i=n%10;
      reverse=reverse*10+i;
      n/=10;
        }

     boolean flag = true;
     while (num > 0 && reverse > 0)
      {
            if(num%10!=reverse%10) 
          {
                flag=false;
                break;
           }
            else
            {
                num/=10;
               reverse/=10;
            }
        }
      return flag;
    }

    public static void main(String[] args) {
       range(1,100);
 
       }
    public static void range(int st,int end)
    { 	
        int count=0;
        for(int i=end;i>=st;i--)
	{
           if(isPalindrome(i)){
            count++;
           if(count==2)
	   System.out.println(i);}
	}
    }
}