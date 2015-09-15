import java.applet.Applet;
import java.awt.*;
public class MA2 extends Applet
{
  public void paint (Graphics g)
  {
    int x = 40;
    int y = 40;
    
      for (int j = 0; j < 7; j++ )
      {
        g.drawOval (150, 90, x, y);
        x += 10;
        y += 10;
        
      }
  }  
}