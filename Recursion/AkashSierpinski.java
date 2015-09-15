/*************************************************************************
  * Author: Akash Patel                                                  *
  * Date: March 20th, 2015                                               *
  * File Name: AkashSierpinski.java                                      *
  * Description: Uses recursion to draw Sierpenski's triangle            *
  *                                                                      *
  * Resources:                                                           *  
  * https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html     * 
  *                                                                      *
  * NOTE: In order to get a proper Sierpinski triangle, the original     *
  * triangle MUST be an EQUILATERAL triangle.                            *           
  ************************************************************************/

//required imports.
import java.applet.Applet; 
import java.awt.*; 
import javax.swing.*; 


public class AkashSierpinski extends Applet 
{ 
  
  int number = 0;
  
  //Pre: N/A
  
  //Post: gets number of recursions from user through option pane
  public void init () 
  {
    //get user input for number of recursions (via option pane)
    number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1 and 10:"));  
    //ask again if number is too big or small (greater than 10 or less than 1)
    if (number < 1 || number > 10)
      init();
  }//end of init
  
  //Draw the triangle and call the sierpinski method for recursion
  public void paint(Graphics g) 
  {
    //coordinates of the original equilateral triangle 
    int xArray[] = {100, 100+(int)(700*Math.cos(Math.toRadians(60))), 800};
    int yArray[] = {800, 800-(int)(700*Math.sin(Math.toRadians(60))), 800}; 
    
    //Make background/canvas black
    setBackground(Color.black);
    
    //generate random colour by calling randColor method
    g.setColor(randColor());
    //draw triangle
    g.drawPolygon(xArray,yArray,3);
    
    //call the sierpinski method n amount of times (n recursions)
    sierpinski (xArray,yArray,number);
    
  }// end of paint method
  
  //Pre: x and y coordinates of triangles are sent into the method with number of recursions required 
  
  //Post: draws three smaller triangles and recurs n amount of times 
  public void sierpinski(int xA[], int yA[], int n) 
  { 
    Graphics g = getGraphics();
    //using a try-catch method and Thread.sleep() to slow down recursion so that it can be seen on the applet 
    try 
    {     
      //the simple case that ends recursion if n is equal to or less than 1  
      if (n <= 1)
        return;
      
      //continue recursion until n equals 1
      
      //finding the midpoint coordinates for each side of the triangle by calling the midpoint (mp) method
      //x coordinates for each side
      int cx1 = mp(xA[0],xA[1]);
      int cx2 = mp(xA[0],xA[2]);
      int cx3 = mp(xA[1],xA[2]);
      //y coordinates for each side
      int cy1 = mp(yA[0],yA[1]);
      int cy2 = mp(yA[0],yA[2]);
      int cy3 = mp(yA[1],yA[2]);        
      
      //coordinates of the new (down facing) triangle stored in the array
      int xArray[] = {cx1, cx2, cx3};
      int yArray[] = {cy1, cy2, cy3};
      
      //generate random colour by calling randColor method
      g.setColor (randColor());
      
      //slow down recursion
      Thread.sleep(100);
      //draw new triangle
      g.fillPolygon(xArray,yArray,3);
      
      /* the x and y coordinates of the three smaller triangles
        
                      (x[1],y[1])  *
                                  * *
                                 *   *
                                *     *
                               *  TT   *
                              *         *
                             *           *
                       cx1  * * * * * * * * cx2
                           *               *
                          * *             * *
                         *   *     M     *   *
                        *     *         *     *
                       *       *       *       *
                      *   TL    *     *   TR    *
                     *           *   *           *
      (xA[0],yA[0]) * * * * * * * * * * * * * * * * (x[2],y[2])
                                  cx2
       TT = Top Triangle
       TL = Left Triangle
       TR = Right Triangle
       M = Main triangle drawn above
       */
      
      //x and y coordinates of top triangle
      int TTx[] = {cx1,xA[1],cx3};
      int TTy[] = {cy1,yA[1],cy3};
      //x and y coordinates of left triangle
      int TLx[] = {xA[0],cx1,cx2};
      int TLy[] = {yA[0],cy1,cy2};
      //x and y coordinates of left triangle
      int TRx[] = {cx2,cx3,xA[2]};
      int TRy[] = {cy2,cy3,yA[2]};
      
      //Call sierpinski for left,right and top triangle seperatelty
      sierpinski(TLx, TLy, n-1);
      sierpinski(TTx, TTy, n-1);
      sierpinski(TRx, TRy, n-1);
      
    }//end of try
    
    catch(Exception e)
    {
      
    }//end of catch
  }//end of sierpinski method
  
  
  //Pre: send method two points
  
  //Post: returns the midpoint coordinate (x or y) of the two points 
  public int mp(int p1, int p2)
  {
    int point = ((p1+p2)/2);
    return point;
  }//end of mpy method
  

  //Pre: N/A
  
  //Post: Generates and returns random colour
  public Color randColor()
  {
        //generate random number from 0 to 255 for red,green and blue    
    int r = (int)((Math.random()*254)+1);
    int g = (int)((Math.random()*254)+1);    
    int b = (int)((Math.random()*254)+1);

    //create new colour from generated rgb values
    Color c = new Color(r,g,b);
    //return new colour
    return c;
  }//end of randColor method
  
}//end of AkashSierpinski class

