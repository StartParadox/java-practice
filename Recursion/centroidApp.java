//import java.applet.Applet;
import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class centroidApp extends Applet
{  
  public int values()
  {
    System.out.println ("Enter the first x value");
    int x1 = In.getInt();
    System.out.println ("Enter the first y value");
    int y1 = In.getInt();
    System.out.println ("Enter the second x value");
    int x2 = In.getInt();
    System.out.println ("Enter the second y value");
    int y2 = In.getInt();
    System.out.println ("Enter the third x value");
    int x3 = In.getInt();
    System.out.println ("Enter the third y value");
    int y3 = In.getInt();
    
  }
  public void paint (Graphics g)
  { 
    int x1 = values();
    int y1 = values();
    int x2 = values();
    int y2 = values();    
    int x3 = values();
    int y3 = values();
    
    int xArray[] = {x1,x2,x3};
    int yArray[] = {y1,y2,y3};
    g.setColor(Color.blue);
    g.fillPolygon (xArray,yArray,3);
    g.setColor(Color.red);
    //find the value to move halfway between each line
    int cx1 = Math.abs(((x3-x2)/2));
    int cy1 = Math.abs(((y3-y2)/2));
    int cx2 = Math.abs(((x3-x1)/2));
    int cy2 = Math.abs(((y3-y1)/2));
    int cx3 = Math.abs(((x2-x1)/2));
    int cy3 = Math.abs(((y2-y1)/2));
    //Draw median lines
    if (y2 > y3)
      g.drawLine(x1,y1,x2+cx1,y2-cy1);
    else 
      g.drawLine(x1,y1,x2+cx1,y2+cy1);
    if (y1 > y3)
      g.drawLine(x2,y2,x1+cx2,y1-cy2);
    else
      g.drawLine(x2,y2,x1+cx2,y1+cy2);
    if (y2 > y1)
      g.drawLine(x3,y3,x1+cx3,y1+cy3);
    else
      g.drawLine(x3,y3,x1+cx3,y1-cy3);
    //Label Points
    g.setColor(Color.black);
    g.drawString("(" + x1 + "," + y1 + ")",x1,y1);
    g.drawString("(" + x2 + "," + y2 + ")",x2,y2);
    g.drawString("(" + x3 + "," + y3 + ")",x3,y3);
  }
}