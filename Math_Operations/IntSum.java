
public class IntSum 
{
  public static void main(String[] args) 
  { 
    System.out.println ("Enter a postive 3 digit number");
    int numEntry = In.getInt ();
    
    //Rounding 100
    int hundreds = numEntry/100;
    double conv = Math.round (hundreds);
    int conv2 = (int)conv;
    
    //Rounding 10
    int tens = (numEntry-(conv2*100))/10;
    double conv3 = Math.round(tens);
    int conv4 = (int)conv3;
    
    //Rounding 1
    double ones = (numEntry-(conv2*100)-(conv3*10));
    double conv5 = Math.round(ones);
    int conv6 = (int)conv5;
    //Sum
    int sum = conv6 + conv4 + conv2;
    System.out.println ("The sum of these integers is " + sum);
  }
}
