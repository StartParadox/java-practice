public class String8
{
  public static void main (String[] args)
  {
    System.out.println ("Enter your six digit code");
    String d = In.getString();
    
    int value = 0;
    int sum = 0;
    int i;
    int n = 0;
    for (i = 1; i <= d.length(); i++)
    { 
      value = Integer.parseInt(d.substring(n,i));
      n++;
      sum+=value;
    }    
    System.out.println("The sum is " + sum);
    int a = sum%10;
    int num = Integer.parseInt(d.substring(5));
    if (num == a) 
    {
      System.out.println("Valid Code");
    }
    else
    {
      System.out.println("Invalid Code"); 
    }
  }
}