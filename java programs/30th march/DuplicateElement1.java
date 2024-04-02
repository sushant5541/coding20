//Write a program to remove duplicate elements in unsorted array.
//also we are remove duplicacy in sorted & unsorted array by using HASHSET.

import java.util.Scanner;
class DuplicateElement1 
{
    int[] a={1,2,3,4,2,5,3,6,7,8,5,};
    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<a.length;i++)
    {
        hs.add(a[i]);
    }

    for(int no:hs)
    (
        System.out.print(no+" ");
    )
}
