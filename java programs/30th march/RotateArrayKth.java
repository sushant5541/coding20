//Write a program for rotate array by kth position 
 class RotateArrayKth 
 {
    public static void mian(String a[]
    {
        int nums[]={1,2,3,4,5,6,7};
        System.out.println("Given array is:"+nums[]);
    })
    public void rotate(int[] nums, int k)
    {
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        revrese(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }   
    public void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
