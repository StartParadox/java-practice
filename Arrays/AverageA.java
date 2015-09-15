public class AverageA
{
  
  public static void main (String[] args)
  {
    
    int[] grades = new int[10];
    String[] courses = new String[10];
    int sum = 0;
    
    for (int i = 0; i < grades.length; i++)
    { 
      System.out.println("Enter course code for course " + (i+1));
      courses[i] = In.getString();
      System.out.println("Enter mark " + (i+1) + ":");
      grades[i] = In.getInt();
      sum += grades[i];
    }
    
    printGrades(grades,courses);
    double average = (double)(sum/10);
    System.out.println("\nAverage: " + average + "%");
  } 
 
  public static void printGrades (int[] a, String[] b)
  {
    System.out.println("\nAll Marks (1-10)\n");
    for (int j = 0; j < a.length; j++)
    { 
      System.out.println(b[j] + ": " + a[j] + "%");
    }
  }
}