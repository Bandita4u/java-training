import java.util.Scanner;

class palindrome{
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
        for(int i=st;i<=end;i++)
	{
           if(isPalindrome(i))
	   System.out.println(i);
	}
    }
}