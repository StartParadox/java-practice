public class Swap
  
{
  public static void main (String args[])
  {
    System.out.println ("What is the student's name?");
    String s = In.getString();
    int num = s.length()-1;
    char[] s2 = s.toCharArray();
    char temp = s2[0];
    s2[0] = s2[s.length()-1];
    s2[s.length()-1] = temp;
    System.out.println (s2);
  }
}