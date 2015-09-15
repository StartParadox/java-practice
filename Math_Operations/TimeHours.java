
public class TimeHours
{
  
  public static void main(String[] args)
  { 
    System.out.println ("How many hours");
    double hours = In.getDouble ();
    System.out.println ("How many minutes");
    double minutes = In.getDouble ();
    double conv1 = minutes/60;
    //System.out.println (conv1);
    System.out.println ("How many seconds");
    double seconds = In.getDouble ();
    double conv2 = ((seconds/60)/60);
    double total = hours + conv1 + conv2;
    double roundOff = Math.round(total * 100.0) / 100.0;
    System.out.println (hours + " hours, " +minutes + " minutes and " + seconds + " seconds is " + roundOff + " hours");
    
  }
  
  
}
