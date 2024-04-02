Class sorting_array
{
    public static void main(String a[])
    {
        int array[]={5,12,3,9,7,2,15,8};

        sortFirstHalfAscending(array);
        sortSecondHalfDescending(array);

        System.out.Print("Sorted array:");
        for(int num:array)
        {
            System.out.print(num+"");
        }
    }
    //Function to sort the first half of array in ascending order
    public static void sortFirstHalfAscending(int[] array)
    {
        for(int i=0;i<array.length/2-1;i++)
        {
            for(int j=i+1;j<array.length/2;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    //Function to sort the second half of the array in descending order
    public static void sortSecondHalfDescending(int[] array)
    {
        for(int i=array.length/2;i<array.length-1;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]<array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}