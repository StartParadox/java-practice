public class String1
{
 public static void main (String[] args)
 {
   System.out.println ("What is your name?");
   String name = In.getString();
   
   String name2 = name.substring (0,(name.indexOf(" "))+2);
   System.out.println ("Greetings " + name2);
 }
}