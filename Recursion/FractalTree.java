import java.applet.Applet; 
import java.awt.*; 

public class FractalTree extends Applet 
{ 
  public void paint(Graphics g) 
  {
    //call the tree method (x position, y position, size and angle)
    tree(200, 250, 100, 90);
 
  }// end of paint method
  
  public void tree(int x, int y, double size, int angle) 
  {  
    try
    {
      //once size is less than 2, stop drawing more lines
      if (size < 2) return;
      Graphics g= getGraphics();
      //find end coordinates (polar coordinates) using angle and size
      int newx = x+(int)(size*Math.cos(Math.toRadians(angle)));
      int newy = y-(int)(size*Math.sin(Math.toRadians(angle)));
      //Pauses for 100ms
      Thread.sleep(15);
      //draw branch to the end coordinates
      int red = (int)((Math.random()*254)+1);
      int blue = (int)((Math.random()*254)+1);
      int green = (int)((Math.random()*254)+1);
      
      g.setColor (new Color(red,blue,green));
   
      g.drawLine(x, y, newx, newy);
      g.drawRect(x,y,200,200);
      //two angles at which it will branch off
      int angle1 = angle + 15;
      int angle2 = angle - 35;
      
      
      //draws "branch" in the two different angles (splits off into two branches)
      tree(newx, newy, size/2.6, angle1);
      tree (newy, newx, size*1.1, angle2);
    }//end of try
    catch (Exception e)
    {
    }//end of catch
  }//end of tree method
}
