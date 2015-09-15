public class TwoDiceRoll
{
  public static void main (String args[])
  {
    int[][] d = new int[6][6];
    int r;
    int c;
    
    System.out.println("How many rolls do you want?");
    int rolls = In.getInt();
    for (int i = 0; i < rolls; i++)
    {

      r = dice();
        c = dice();
        d[r-1][c-1] += 1;  
        System.out.println("The two dices rolled a: " + r + " and " + c);
    }
    
    System.out.println("The grid below shows how many times each value is rolled");
    for (int j = 0; j < 6; j++)
    {
      System.out.println();
      for (int k = 0; k < 6; k++)
      {  
        if (k == 6)
          System.out.println(" | " + d[j][k] + " | " + "\t");
        else
          System.out.print(" | " + d[j][k] + " | " + "\t");
      } 
    }
  }
  public static int dice ()
  {
    int roll = (int)((Math.random()*6)+1);
    return roll;
  }
}