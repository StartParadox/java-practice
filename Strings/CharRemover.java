public class CharRemover
  
{
  public static void main (String args[])
  {
    int i = 0;
    System.out.println ("Enter your word (contains at least 3 'm')");
    String w = In.getString();
    w = w.toLowerCase();
    for (i = 0; i < 3; i++)
    {
      w = w.replaceFirst("m"," ");
    }
    
    System.out.println(w);    
  }
}
