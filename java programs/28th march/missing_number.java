//missing number in given array
class missing_number 
{
    public static void main(System a[])
    {
    int[]={4,5,6,7,9,10};
    
    int expected_no_elements=a.length+1;
    int total_sum=expected_no_elements*(expected_no_elements+1)/2;
    //System.out.println(total_sum);

    int sum=0;
    for(int i=0;i<a.length;i++)
    {
        sum=sum+a[i];
    }
    System.out.println("missing no is: "+(total_sum-sum));
    }    

}
