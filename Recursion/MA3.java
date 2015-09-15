import java.applet.Applet;
import java.awt.*;
public class MA3 extends Applet
{
  public void paint (Graphics g)
  {
    int x = 90;
    int y = 90;
    
      for (int j = 0; j < 7; j++ )
      {
        g.drawOval (150, 90, x, y);
        
        y -= 8;
      }
  }  
}