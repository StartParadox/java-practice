
public class QuadraticEqn 
{
  
  
  public static void main(String[] args)
  { 
    System.out.println ("Enter your values and I will determine the value for x using the quadratic equation");
    
    System.out.println ("What is the a value?");
    double a = In.getDouble ();
    
    System.out.println ("What is the b value?");
    double b = In.getDouble ();
    
    System.out.println ("What is the c value?");
    double c = In.getDouble ();
    
    double numroots = (b * b - (4 * a * c));
    double neg = -1.0*b;
    double root1 = ((neg + (Math.sqrt(numroots)))/(2.0 * a));
    double root2 = ((neg - (Math.sqrt(numroots)))/(2.0 * a));
    
    
    if  (a == 0 || numroots < 0)
    {
      System.out.println ("There are no real roots for this equation because a is 0"); 
    }
    else if (numroots == 0)
    {
      System.out.println ("This equation has one root"); 
      System.out.println ("x = " + root1); 
    }
    else
    {
      System.out.println ("This equation has two roots");
      System.out.println ("x1 = " + root1); 
      System.out.println ("x2 = " + root2); 
    }
    
    
    
  }
  
}
