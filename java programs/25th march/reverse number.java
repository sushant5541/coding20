 class Reverse Number 
 {
    public static void main(String a[])
    {
        int number=56789,rev=0;
        while(number!=0)
        {
           int remainder=number%10;
            rev=rev*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse of the given number is:"+rev);
    }   
}
