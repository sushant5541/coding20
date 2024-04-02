//to calculate number of vowels and consonants

import java.util.Scanner;

class vowels
{
    public static void main(String a[])
    {
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        s=sc.nextLine();
        int vowel,cons;
        vowel=cons=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
                vowel++;
                else
                cons++;
            }
        }
        System.out.println("Total Vowels="+vowel+"\nTotal Consonants="+cons);
    }
}