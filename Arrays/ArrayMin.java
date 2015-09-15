public class ArrayMin
{
  public static void main (String args[])
  {
    int[] num = new int [5];
    
    
    for (int i = 0; i < 5; i++)
    {
      num[i] = (int)((Math.random()*10)+1);
      System.out.print(num[i] + ", ");
    }    
    int min = minimum(num);
    int max = maximum(num);
    System.out.println("\nThe minimum is " + num[min] + " and it is located at index " + min );
    System.out.println("The maximum is " + num[max] + " and it is located at index " + max);
  }
  public static int minimum (int[] a)
  {
    int m = a[0];
    int i = 0;
    for (int j = 1; j < 5; j++)
    {
      if (a[j] < m)
      {
        m = a[j];
        i = j;
      }
    }
    return i;
  }
  public static int maximum (int[] a)
  {
    int m = a[0];
    int i = 0;
    for (int j = 1; j < 5; j++)
    {
      if (a[j] > m)
      {
        m = a[j];
        i = j;
      }
    }
    return i;
  }
}