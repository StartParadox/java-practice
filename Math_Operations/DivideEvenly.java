public class DivideEvenly
{
  
  
  public static void main(String[] args) 
  { 
    System.out.println ("Enter the first number");
    int num1 = In.getInt();
    System.out.println ("Enter the second number");
    int num2 = In.getInt();
    int even = num1%num2;
    
    if ( even == 0 || even == 1)
    {
     System.out.println ("The number divides evenly"); 
    }
    else
    {
      System.out.println ("The number does not divide evenly"); 
    }
  }
  
}