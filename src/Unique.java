public class Unique
{
    private static boolean unique = true;
    private static boolean notUnique = false;
    

    public void uniqueOrNot(boolean unique, boolean notUnique)
    {
        Unique.unique = unique;
        Unique.notUnique = notUnique;
    }

    public static boolean isUnique(String wordString)
    {
        for(int i = 0; i < wordString.length(); i++)
        {
            for(int j = i + 1; j < wordString.length(); j++)
            {
                if(wordString.charAt(i) == wordString.charAt(j))
                {
                    return notUnique;
                }
                
            }
        }
        return unique;
    }

    public static void main(String[] args)
    {
        String testString = "orange";
        System.out.print("is the word " + testString + " unique?: " + isUnique(testString));
    }

}