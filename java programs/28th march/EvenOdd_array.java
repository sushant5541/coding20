//To count evene and odd element in an array
import java.util.Scanner;
 class EvenOdd_array 
{
    public static void main(String a[])
    {
        int arr[]={12,43,60,67,53,90};

         ArrayList<Integer> al1=new ArrayList<>();
         ArrayList<Integer> al2=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                al1.add(arr[i]);
            }
            else
            {
                al2.add(arr[i]);
            }
        }
        System.out.println("Evev no's are: ");
        //int total1=0;
        for(int no:al1)
        {
            //total1=total1+no;
            System.out.print(no+"");
        }
        System.out.println("\ntotal no even no's are:"+al1.size());
        //System.out.println("sum of all even no's are:"+total1);

        System.out.println("Odd no's are: ");
        //int total2=0;
        for(int no:al2)
        {
            //total2=total2+no;
            System.out.print(no+"");
        }
        System.out.println("\ntotal no even no's are:"+al2.size());
       // System.out.println("sum of all odd no's are:"+total2);

    }
    
}
