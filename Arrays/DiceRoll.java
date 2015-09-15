public class DiceRoll
{
  
  public static void main(String[] args)
  {
    System.out.println ("How many times will each die be rolled?");
    int n = In.getInt();
    int[] dice1 = new int[n];
    int[] dice2 = new int[n];
    
    // to keep track of tyhe number of times each side is rolled
    int [] count = new int [6];
    
    for (int i = 0; i < dice1.length; i++)
    {
      dice1[i] = dice();
      dice2[i] = dice();
      
      // v[i] is the number rolled
      count[dice1[i]-1]++;
      count[dice2[i]-1]++;
    }    
    
    printArray(dice1);
    printArray(dice2);
    System.out.println("\n1's rolled: " + count[0]);
    System.out.println("2's rolled: " + count[1]);
    System.out.println("3's rolled: " + count[2]);
    System.out.println("4's rolled: " + count[3]);
    System.out.println("5's rolled: " + count[4]);
    System.out.println("6's rolled: " + count[5]);
  }
  
  
  public static int dice ()
  {
    int roll = (int)((Math.random()*6)+1);
    return roll;
  }
  
  public static void printArray (int[] a)
  {
    System.out.println("\nRolls\n");
    for (int j = 0; j < a.length; j++)
    { 
      System.out.println("Roll " + (j+1) + ": " + a[j]);
    }
    
  }
}