import java.applet.Applet;
import java.awt.*;
public class MathArtD extends Applet
{
  public void paint (Graphics g)
  {
    int x = 60;
    int y = 60;
    
      for (int j = 0; j < 1; j++ )
      {
        g.drawOval (x, y, 50, 50);
        x -= 5;
        y -= 5;
      }
  }  
}