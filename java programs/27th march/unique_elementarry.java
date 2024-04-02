//find uniqe element in array by using linear search
import java.util.Scanner;
class unique_elementarry
 {
    public static void main(String a[])
    {
        System.out.println("Enter array element");
        int arr[]=new int[6];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element you want to search:");
        int keyelement=sc.nextInt();
        int flag=0;
        for(int i=0;i<6;i++)
        {
            if(keyelement==arr[i])
            {
                flag=1;
                System.out.println("\n"+keyelement+" is found");
                break;
            }
        
        }
      if(flag==0)
        System.out.println("\n"+keyelement+" is not found");

        

        
    }
}
