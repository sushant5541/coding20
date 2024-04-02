
//find the index of two array elements whose sumis equal to the given value
class sumArrayGivenvalu
{
    public static void main(String a[])
    {
        int[] arr={4,6,5,-10,8,2,5};
        int n=10;
        findThePairs(arr, n);
    }

    public static void findThePairs(int[] arr, int n) 
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==n)
                {
                    System.out.println(arr[i]+"+"+arr[j]+"="+n);
                }
            }
        }    
    }
}