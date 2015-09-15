/**
 * Auto Generated Java Class.
 */
public class SolveEqn 
{
  
  
  public static void main(String[] args)
  { 
    System.out.println ("This program will solve for x in the equation ax + b = 0");
    
    System.out.println ("\nEnter the value for a");
    double a = In.getDouble ();
    System.out.println ("\nEnter the value for b");
    double b = In.getDouble ();
    double x1 = -b/a;
    double x2 = (int)(x1*100);
    double x3 = x2/100;
    
    if (a == 0)
    {
     System.out.println ("The answer will be undefined, please use another value"); 
    }
    else
    {
     System.out.println (" The value for x is " + x3);  
    }
  }
  
  
}
