import java.applet.Applet;
import java.awt.*;
public class MathArtA extends Applet
{
  public void paint (Graphics g)
  {
    int x = 15;
    int y = 15;
    
    for (int i = 0; i < 5; i++)
    {
      for (int j = 0; j < 5; j++ )
      {
        g.drawRect (x, y, 25, 25);
        x += 30;
      }
      x = 15;
      y += 30;
    }
  }  
}