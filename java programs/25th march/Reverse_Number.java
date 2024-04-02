 import java.util.Scanner;
 class Reverse_Number 
 {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any no");
        int no=s.nextInt();
        int rev=0;
        while(no!=0)
        {
            int remainder=no%10;
            rev=rev*10+remainder;
            no=no/10;
        }
        System.out.println("The reverse of the given number is:"+rev);
    }   
}
