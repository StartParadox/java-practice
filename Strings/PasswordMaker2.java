public class PasswordMaker2
{
  public static void main (String args[])
  {
    //First Name
    System.out.println ("Create a password from your first name, middle name, last name and age");
    System.out.println("\nWhat is your first name?");
    String fn = In.getString();
    
    //Middle Name
    System.out.println("What is your middle name?");
    String mn = In.getString();
    
    //Last Name
    System.out.println("What is your last name?");
    String ln = In.getString();
    
    //Age
    System.out.println("What is your age?");
    int age = In.getInt();
    int p1 = age*100;
    
    String m1 = fn.substring((fn.length()-1)/2, ((fn.length()-1)/2)+1);
    String m2 = mn.substring((mn.length()-1)/2, ((mn.length()-1)/2)+1);
    String m3 = ln.substring((ln.length()-1)/2, ((ln.length()-1)/2)+1);
    String pass = m1+m2+m3+p1;
    System.out.println("Your new passowrd is: " + pass);
  }
}
