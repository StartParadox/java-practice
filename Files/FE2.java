import java.io.*;
public class FE2
{
  public static void main(String[] args)
  {
    try
    {
      String file = "file02.txt";
      String nm = "";
      FileWriter write = new FileWriter (file);
      PrintWriter out = new PrintWriter (write);
      for (int i = 0; i < 5; i++)
      {
      out.println((int)(11*Math.random()));
      }
      out.close();
      FileReader read = new FileReader (file);
      BufferedReader in = new BufferedReader (read);
       for (int i = 0; i < 5; i++)
      {
      nm = in.readLine();
      System.out.println(nm);
      }
      
      in.close();
    }    
    catch (IOException e)
    {
      System.out.println ("There was an error! Please try again."); 
    }
  }
}