class remove_character
{
    public static void main(String a[])
    {
        String input="Hello123@World";
        String result=removeNonAlphabetic(input);
        System.out.println("Input: "+input);
        System.out.println("Result: "+result);

    }
    public static String removeNonAlphabetic(String str)
    {
        return str.replaceAll("[^a-zA-Z]", "");
    }
}