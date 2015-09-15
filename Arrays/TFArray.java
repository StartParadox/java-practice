public class TFArray
{
  public static void main (String[] args)
  {
    boolean[][] a = new boolean[10][10];
    
    for (int i = 0; i < 10; i++)
    {
      
      for (int j = 0; j < 10; j++)
      {
        a[i][j] = tf();
      } 
     
    }
    
    for (int k = 0; k < 10; k++)
    {
      for (int l = 0; l < 10; l++)
      {  
        if (k == 10)
          System.out.println(a[k][l] + "\t");
        else
          System.out.print(a[k][l]  + "\t");
      } 
    }
  }
  public static boolean tf ()
  {
    int num = (int)(Math.random()*2);
    
    if (num == 0)
      return true;
    else
      return false;
    
  }
  
}
