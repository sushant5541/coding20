 import java.util.Scanner;
 class reverse array 
 {
    public static void main(String a[])
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(int i=0;i<a.length;i++)
        {
           
            System.out.println(a[i]+" ");
        }
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]+" ");
        }
       
    }
}
