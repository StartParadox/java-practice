import java.applet.Applet;
import java.awt.*;
public class MA1 extends Applet
{
  public void paint (Graphics g)
  {
    int x = 20;
    int y = 20;
    int x2 = 150;
    int y2 = 120;

      for (int i = 0; i < 10; i++ )
      {
        g.drawOval (x2, y2, x, y);
        x += 20;
        y += 20;
        x2 -= 10;
        y2 -= 10;
      }
      g.drawRect(x2+10, y2+10, x-20, y-20);
  } 
}
