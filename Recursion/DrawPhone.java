import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Modification of draw house program
public class DrawPhone extends Applet implements ActionListener
{
  
  //Widgets, Panels
  JButton draw;
  JLabel lx, ly, lxscale, lyscale;
  JTextField tx, ty, txscale, tyscale;
  Panel flow;
  //Phone Coordinates, initialized to 1. (Top Right and No Scaling)
  int x = 1;
  int y = 1;
  int xz = 1;
  int yz = 1;
  
  public void init ()
  { //Set Up Input Fields for Drawing Coordinates
    lx = new JLabel ("x co-ord:");
    ly = new JLabel ("y co-ord:");
    lxscale = new JLabel ("x scaling factor:");
    lyscale = new JLabel ("y scaling factor:");
    tx = new JTextField ("1", 2);
    ty = new JTextField ("1", 2);
    txscale = new JTextField ("1", 2);
    tyscale = new JTextField ("1", 2);
    
    //Set up draw button and actionlistener
    draw = new JButton ("Draw");
    draw.addActionListener (this);
    draw.setActionCommand ("draw");
    
    //Set up layout, add widgets
    setLayout (new BorderLayout ());
    flow = new Panel (new FlowLayout ());
    flow.add (lx);
    flow.add (tx);
    flow.add (ly);
    flow.add (ty);
    flow.add (lxscale);
    flow.add (txscale);
    flow.add (lyscale);
    flow.add (tyscale);
    flow.add (draw);
    flow.setBackground (Color.red);
    add (flow, "South");
    resize (600, 500);
  }
  
  
  public void paint (Graphics g)
  { //draw a white box over the background to erase everything
    g.setColor (Color.white);
    g.fillRect (0, 0, 600, 500);
    //draw the phone passing in the global variables
    bat (x, y, xz, yz);
    //used only to force an update
    showStatus ("Done Drawing Phone");
  }
  
  /** Draws a phone
    * @param x is the top x co-ordinate of the phone
    * @param y is the left most y co-ordinate of the phone
    * @param xz is the x scaling factor, stretches horizontally
    * @param yz is the y scaling factor, stretches vertically
    */
  public void bat (int x, int y, int xz, int yz)
  {
    Color grayish = new Color(153, 153, 153);
    Graphics g = getGraphics ();
    
    x = x / xz; //reset top based on scaling factor
    y = y / yz; //reset right coordinate based on scaling factor
    //Phone Outline
    g.setColor (new Color(102, 102, 255));
    g.fillRect ((x+20)*xz,(y+20)*yz,80*xz,150*yz);
    //Screen
    g.setColor (new Color(64,64,64));
   g.fillRect ((x+33)*xz,(y+33)*yz,55*xz,55*yz);
    //Buttons
    g.setColor (new Color(192, 192, 192));
    g.fillRect ((x+34)*xz, (y+95)*yz, 15*xz, 15*yz);
    g.fillRect ((x+54)*xz, (y+95)*yz, 15*xz, 15*yz);
    g.fillRect ((x+74)*xz, (y+95)*yz, 15*xz, 15*yz);
    g.fillRect ((x+34)*xz, (y+120)*yz, 15*xz, 15*yz);
    g.fillRect ((x+54)*xz, (y+120)*yz, 15*xz, 15*yz);
    g.fillRect ((x+74)*xz, (y+120)*yz, 15*xz, 15*yz);
    g.fillRect ((x+34)*xz, (y+145)*yz, 15*xz, 15*yz);
    g.fillRect ((x+54)*xz, (y+145)*yz, 15*xz, 15*yz);
    g.fillRect ((x+74)*xz, (y+145)*yz, 15*xz, 15*yz);
  }
  /**
   Draw a new phone or clears the textfields
   @param e The ActionEvent invoked. e.getActionCommand contains nothing or draw
   */
  public void actionPerformed (ActionEvent e)
  {
    //get new co-ordinates and draws the phone
    if (e.getActionCommand ().equals ("draw"))
    {
      showStatus ("");
      try
      {
        x = Integer.parseInt (tx.getText ());
        y = Integer.parseInt (ty.getText ());
        xz = Integer.parseInt (txscale.getText ());
        if (xz <= 0)
          xz = 1; //divide by zero, negative error check
        yz = Integer.parseInt (tyscale.getText ());
        if (yz <= 0)
          yz = 1; //divide by zero, negative error check
        repaint ();
        
      }
      catch (java.lang.NumberFormatException error)
      { //if the user entered text, display an error message and clear the textfield
        showStatus ("Enter NUMBERS in the text fields. eg. 2. No decimals.");
        tx.setText ("1");
        ty.setText ("1");
        txscale.setText ("1");
        tyscale.setText ("1");
      }
      
    }
    
  }
}