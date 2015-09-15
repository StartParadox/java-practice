public class String7
{
 public static void main (String[] args)
 {
   System.out.println ("Enter a word to make a word pyramid");
   String w = In.getString();
   char[] w2 = w.toCharArray();
   int i;
   for (i = 0; i < w.length(); i++)
   {
    System.out.println (w.substring(0,i+1));                                  
   }
   
   
 }
}