
public class MixedFraction
{  
  public static void main(String[] args)
  { 
    //Numerator and Denominator Input
    System.out.println ("Enter your numerator: ");
    int numerator = In.getInt ();
    System.out.println ("Enter your denominator: ");
    int denominator = In.getInt ();
    //Get whole number
    int full = numerator/denominator;
    //Get new Numerator
    int newNum = numerator%denominator;
    //Print Whole and Mixed Fractions
    System.out.println ("The improper fraction is " + numerator + "/" + denominator);
    System.out.println ("The improper fraction is " + full + " and " + newNum + "/" + denominator);
   
  }  
}
