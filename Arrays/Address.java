public class Address 
{
  
  public static void main (String[] args)
  {
    
    String[] name = new String[5];  
    String[] address = new String[5];  
    
    for (int i = 0; i < 5; i++)
    {
      System.out.println("Enter name " + (i+1));
      name[i] = In.getString();
      System.out.println("Enter address " + (i+1));
      address[i] = In.getString();
    }
    
    printArray(name,address);
    System.out.println("\nSearch for a name to get the matching address");
    String s = In.getString();
    
    for (int j = 0; j < 5; j++)  
   {
    if (s.equalsIgnoreCase(name[j]))
      System.out.println(s + " lives in " + address[j]); 
   }
    
  }
  public static void printArray (String[] a, String[] b)
  {
    for (int k = 0; k < 5; k++)
    { 
      System.out.println("\n" + a[k] + " lives in " + b[k]);
    }
  }
}
