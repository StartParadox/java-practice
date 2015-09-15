import java.io.*;
public class FE1
{
  public static void main(String[] args)
  {
    try
    {
      String file = "file01.txt";
      String message = "";
      String nm = "";
      FileWriter write = new FileWriter (file);
      PrintWriter out = new PrintWriter (write);
      System.out.println ("Enter the message you want printed on the file!");
      message = In.getString();
      out.println(message);
      out.close();
      FileReader read = new FileReader (file);
      BufferedReader in = new BufferedReader (read);
      nm = in.readLine();
      System.out.println(nm);
      in.close();
    }    
    catch (IOException e)
    {
      System.out.println ("There was an error! Please try again."); 
    }
  }
}