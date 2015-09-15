import java.applet.Applet;
import java.awt.*;

public class HeartPatterns extends Applet
{
  public void paint (Graphics g)
  {
    int a = 0;
    int b = 0;
    for (int j = 0; j < 26; j++)
    {
      int red = (int)((Math.random()*254)+1);
      int blue = (int)((Math.random()*254)+1);
      int green = (int)((Math.random()*254)+1);
      for (int i = 0; i < 26; i++)
      {
        heart (a, b, new Color(red, green, blue)); 
        b+= 20;
        if (i == 25)
          b = 0;
      }
      a+= 20;
    }
  }
  public void heart (int x, int y, Color c)
  {
    Graphics g = getGraphics();
    g.setColor (c);
    g.fillOval (x, y, 10, 10);
    g.fillOval (x+8, y, 10, 10);
    int xArray[] = {x, x+8, x+18};
    int yArray[] = {y+6, y+15, y+6};
    g.fillPolygon (xArray, yArray, 3);
  }
}