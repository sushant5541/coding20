import java.util.Scanner;
class fiboncci
{
    public static void main(String args[])
    {
        int no1=0;
        int no2=1;
        int no3;
        int term;
        System.out.print("Enter term "); 
        Scanner sc=new Scanner(System.in);
        term=sc.nextInt();
        
        for(int i=1;i<=term;i++)
        {
            System.out.println( no1+ " ");
            no3=no1+no2;
            no1=no2;
            no2=no3;
            
        }
    }
}