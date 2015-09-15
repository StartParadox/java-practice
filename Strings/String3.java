public class String3
{
 public static void main (String[] args)
 {
   System.out.println ("Enter a word with 'a's in it and the program will replace it with a 'u'");
   String w = In.getString();
   char [] w2 = w.toCharArray();
   char letter1 = 'a';
   char letter2 = 'u';
   int i;
   for (i = 0; i < w.length(); i++)
    {
      if ((w.charAt(i)) == letter1)
      {
        w2[i] = letter2;
      }      
    }
   System.out.println(w2);
 }
}