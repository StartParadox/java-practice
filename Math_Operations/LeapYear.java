
public class LeapYear  
{
  
  
  public static void main(String[] args) 
  { 
    boolean isLY = true;
    System.out.println ("What year is it?");
    int year = In.getInt ();
    
    if (year%4 == 0)
    {
      isLY = true;
      System.out.println ("This is a leap year");
    }
    else
    {
      isLY = false;
      System.out.println ("This is not a leap year");
      
    }
  }
  
}
