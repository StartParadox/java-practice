public class RandValArray
{
  
  public static void main (String[] args)
  {
    
    int[] array = new int[100];
    int[] array2 = new int[100];
    int sum = 0;
    int r = 99;
    
    for (int i = 0; i < 100; i++)
    {
      array[i] = (int)((Math.random()*100)+1); 
      if ((i%8) == 0)
      {
        System.out.println();
        System.out.print("index " + (i+1) + " = " + array[i] + "\t" );
      }
      else
      {
        System.out.print("index " + (i+1) + " = " + array[i] + "\t" );
      }
      sum += array[i];
    }
    System.out.println("\nSum of the array is " + sum);
    System.out.println("\nArray backwards");

    for (int j = 0; j < 100; j++)
    {
      array2[j] = array[r];
      r--;  
     if ((j%8) == 0)
      {
        System.out.println();
        System.out.print("index " + (j+1) + " = " + array2[j] + "\t" );
      }
      else
      {
        System.out.print("index " + (j+1) + " = " + array2[j] + "\t" );
      }
    }
  }
}

