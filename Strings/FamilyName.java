public class FamilyName
  
{
  public static void main (String args[])
  {
    System.out.println ("What is the first name (Format: FirstName LastName)");
    String n1 = In.getString();
    System.out.println ("What is the second name (Format: FirstName LastName)");
    String n2 = In.getString();
    String lf = n1.substring(n1.indexOf(" ")+1);
    String ls = n2.substring(n2.indexOf(" ")+1);
    n1 = n1.replaceFirst (lf, ls);
    n2 = n2.replaceFirst (ls, lf);
    System.out.println (n1);
    System.out.println (n2);
    
  }
}