import java.applet.Applet;
import java.awt.*;
public class MA4 extends Applet
{
  public void paint (Graphics g)
  {
    int x = 40;
    int y = 40;
    int x2 = 120;
    int y2 = 120;

      for (int j = 0; j < 8; j++ )
      {
        g.drawOval (x2, y2, x, y);
        x += 10;
        y += 10;
        x2 += 5;
        y2 += 5;
      }

  } 
}