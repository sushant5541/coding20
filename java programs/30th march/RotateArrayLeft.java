//Write a program for rotate array left by 1 position
class RotateArrayLeft
{
    public static void main(String a[])
    {
        int[] arr={1,2,3,4,5};
        rotateLeft(arr);
        System.out.println("Array after roatating left by 1 position");
        for(int num:arr)
        {
            System.out.println(num+" ");
        }
    }
    public static void rotateLeft(int[] arr)
    {
        if(arr==null || arr.length <=1)
        {
            return;
        }
        int firstElement = arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstElement;
    }
    
}
