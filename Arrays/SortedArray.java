public class SortedArray
{
  
  public static void main(String args[])
  {
    
    int[] num = new int[5];
    boolean o = true;
    for (int i = 0; i < 5; i++)
    {
     System.out.println("Enter a number"); 
     int n = In.getInt();
     num[i] = n;
     if (i > 1)
     {
       if (num[i] > num[i-1])
         o = true;
       else
         o = false; 
     } 
    }
    if (o == true)
     System.out.println("The array is in order"); 
    else
     System.out.println("The array is not in order"); 
  } 
}
