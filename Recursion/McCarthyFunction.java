
public class McCarthyFunction 
{
  
  
  public static void main(String[] args) 
  { 
    
    int num = 1;
    
    //Continues asking for user input until user enters '0'
    while (num != 0)
    {
      System.out.println("Pick a random number to input into the function (0 to exit)");
      num = In.getInt();
      System.out.println("M(" + num + ") = " + function(num));
      
    }
    
  }
  
  public static int function (int n)
  {
    
    //Base Case
    if (n > 100)
      return n-10;
   //Recursive Case
    else
      return function(function(n+11));
    
  }
}
