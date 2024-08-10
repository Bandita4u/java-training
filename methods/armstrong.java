import java.util.Scanner;

class armstrong {
    public static boolean isArmstrongNum(int n) {
        int num = n;
int num2=n;
        int count = 0;
       while (n>0) 
       {
        count++;
        n=n/10;
       }
     
    int sum =0;
      while(num>0)
       {
        int product=1;
        int d=num%10;
        for(int i=1;i<=count;i++)
           {
                product *=d;
           }
            sum+=product;
            num=num/10;
        }

         if(sum == num2)return true;
         else
         return false;
         
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scn.nextInt();
        

        if (isArmstrongNum(n)) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}