
public class GreaterValue 
{
  
  
  public static void main(String[] args) 
  { 
    System.out.println ("Enter the X value");
    int x = In.getInt ();
    System.out.println ("Enter the Y value");
    int y = In.getInt ();
    
    if (x > y)
    {
      System.out.println ("X is greater than Y"); 
    }
    else if (y > x)
    {
      System.out.println ("Y is greater than X"); 
    }
    else 
    {
      System.out.println ("Both values are equal"); 
    }
  }
  
}
