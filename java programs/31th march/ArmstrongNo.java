//write a code to check Armstrong no or not

import java.util.Scanner;
class ArmstrongNo
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numbe");
        int no=sc.nextInt();
        int digits=countDigit(no);
        System.out.println("Total Digit: "+digits);
        ArmstrongChecker(no);
        

    }
    public static int countDigit(int no)
    {
        int counter=0;
        while(no>0)
        {
            no=no/10;
            counter++;
        }
        return counter;
    }
    public static void ArmstrongChecker(int no)
    {
        int num=no;
        int nod=countDigit(no);//nod=number of digits
        int result=0;
        
        while(no>0)
        {
            int digit=no%10;
            int temp=1;
            for(int i=0;i<nod;i++)
            {
                temp=temp*digit;
            }
             result=result+temp;
             no=no/10;
            
        }
        if(num==result)
        System.out.println(num+" is an armstrong number");
        else
        System.out.println(num+" is not an armstrong number");
    }
   
}   