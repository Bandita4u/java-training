import java.util.Scanner;
class alterSpy {
    public static boolean isSpy(int n) 
    {
        int sum=0;
        int mul=1;
        int temp=n;

      while(temp>0)
     {
      int d = temp % 10;
      sum += d;
      mul *= d;
      temp/=10;
      }
     if (sum==mul)
     return true;
     else
     return false;
    }

    public static void main(String[] args) 
       {
        range(1,100);
       }
    public static void range(int st,int end)
      {
        int count=0;
	for(int i=st;i<=end;i++)  
	{
          
	 if(isSpy(i))
         {count++;
          if(count%2!=0)
	System.out.println(i);}
        }
      }
}