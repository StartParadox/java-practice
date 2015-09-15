
public class NumRound
{
  
  
  public static void main(String[] args) 
  { 
    
    System.out.println ("Enter the number you want to round");
    double number = In.getDouble ();
    System.out.println ("\nHow many decimal places do you want");
    int decimals = In.getInt ();
    double power = Math.pow (10, decimals);
    
    double roundNum1 = (number*power);
    System.out.println (roundNum1);
    
    double roundNum2 = Math.round (roundNum1);
    System.out.println (roundNum2);
    
    double roundNum3 = (roundNum2/power);  
    System.out.println ("Your new rounded number is " + roundNum3);

  }

}
