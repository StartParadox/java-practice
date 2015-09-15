public class CourseSplitter
  
{
  public static void main (String args[])
  {
    //Course
    System.out.println("Enter the course. Please follow the format below: \n ABC 1D0: Course Name");
    String c = In.getString();
    
    //Course Code
    String code = c.substring(0,3);
    System.out.println("Course Code: " + code);
    
    //Course Level
    String level = c.substring (4,6);
    System.out.println("Course Level: " + level);
    
    //Course Description
    String cd = c.substring (9);
    System.out.println("Course Description: " + cd);
    
  }
}
