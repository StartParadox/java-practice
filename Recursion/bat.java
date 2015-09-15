import java.awt.*;
import java.applet.*;

public class bat extends Applet
{
  public void paint (Graphics g)
  {
    int xArray[]={1, 14, 56, 66, 69, 91, 97, 104, 150, 151, 131, 122, 111, 98, 
      103, 95, 92, 88, 84 ,84, 69, 64, 60, 55, 54, 48, 59, 41, 31, 25};
    int yArray[]={104, 50, 49, 11, 27, 26, 2, 49, 47, 103, 89, 102, 90, 102,
      115, 112, 118, 113, 118, 106, 105, 117, 112, 115, 110, 112, 101, 92, 103, 91};
    //handle, pull out middle
    g.setColor (new Color(153, 153, 153));
    g.fillPolygon(xArray, yArray, 30);
    g.setColor (Color.black);
    g.drawPolygon(xArray, yArray, 30);
    g.setColor (Color.white);
    g.fillOval(62, 34, 18, 19);
    g.fillOval(78, 32, 20, 20); 
    g.setColor (new Color(121, 41, 50));
    g.fillOval(69, 41, 5, 4); 
    g.fillOval(84, 42, 5, 4); 
  }
}