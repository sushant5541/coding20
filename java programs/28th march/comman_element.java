//to find comman element between two array
class comman_element 
{
    public static void main(String a[])
    {
        int arr1[]={12,54,67,89,48};
        int arr2[]={98,63,54,50,12};
        
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    } 
}
