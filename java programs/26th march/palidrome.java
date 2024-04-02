import java.util.Scanner;
class palidrome
{
        public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter integer");
        int no=s.nextInt();
        int num=no;
        int sum=0;
        while(no>0)
        {
            int digit=no%10;

            sum=(sum*10)+digit;
            no=no/10;
        }
       if(num==sum)
       {
        System.out.println(num+" is palidrome number");
       }
       else
       {
        System.out.println(num+" is not palidrome number");
       }
    }
}
