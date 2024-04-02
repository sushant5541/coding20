//Write a program to remove duplicate elements in sorted array
class DuplicateElement 
{
        public static void main(String[] args) 
        {
            int[] a={1,2,2,3,4,5,5};
            int[] temp=new int[a.length];
            //for write program to without creating a new array just remove the temp array 
            
            int j=0;
            for(int i=0;i<a.length-1;i++)
            {
                if(a[i] !=a[i+1])
                {
                    temp[j]=a[i];
                    j++;
                }
            }
            temp[j]=a[a.length-1];

            for(int i=0;i<temp.length;i++)//replace temp.length with j+1 for insert element in given array
            {
                System.out.print(temp[i]+" ");
            }
        }
}
