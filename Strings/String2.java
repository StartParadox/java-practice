public class String2
{
  public static void main (String[] args)
  {
    System.out.println ("Enter a sentence and I will count the number of i");
    String s = In.getString();
    int count = 0;
    char letter = 'i';
    int i;
    for (i = 0; i < s.length(); i++)
    {
      if ((s.charAt(i)) == letter)
      {
        count++;
      }      
    }
    System.out.println ("Number of occurrences of the letter i : " + count);
    
  }
}