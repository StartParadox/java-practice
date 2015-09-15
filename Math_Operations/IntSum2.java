
public class IntSum2 
{
  
  
  public static void main(String[] args) 
  { 
    System.out.println("Enter a number and find the sum of its digits");
    int num = In.getInt();
    System.out.println ("The next line will print the sum of the digits of " + num);
    int end;
    int sumDig = 0;
    do
    {
      end = num%10;
      num = num/10;
      sumDig += end;  
    }
    while(num > 0);
    System.out.println ("The sum of is " + sumDig);
  }
  
}
