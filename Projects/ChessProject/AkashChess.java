/*************************************************************************
  * Author: Akash Patel, Karan Patel, Parmdeep Bansal                    *
  * Date: June 8th, 2015                                                 *
  * File Name: AkashChess.java                                           *
  * Description: This program runs a simulation of a chess game with the *
  * pieces: Queen, King, Knight, Bishop, & a Rook.                       *
  * Purpose: This program determines if a piece can attack the given    *
  * position 'X'.                                                        *                                                            
 /************************************************************************/

//required imports
import java.io.*;
import java.util.*;

public class AkashChess 
{
  
  public static void main(String[] args) 
  { 
    //arrays to hold the pieces and coordinates
    //all pieces
    String[] pieceCode = {"","","","","",""};
    //all pieces that are viable (can reach position x)
    String[] pos = new String[6];
    //x positions of chess pieces
    int[] px = new int[6];
    //y position of chess pieces
    int[] py = new int[6];
    
    //counting loop iterations and using loop # to add to array with same index #
    int loop = 0;
    int column = 0;
    int row = 0;
    
    try
    {
     
      //Setting up file input and output
      BufferedReader in = new BufferedReader(new FileReader("input.txt"));
      PrintWriter out = new PrintWriter(new FileWriter("output.txt"));   
      
      //creating chess board
      String[][] b = new String[8][8];
      
      //columns
      for (int r = 0; r < 8; r++)
      {
        //rows
        for (int c = 0; c < 8; c++)
        {
         
          b[r][c] = " . ";
         
        }//end of row loop  
        
      }//end of column loop
      
      String code = in.readLine();
      //Read until last line
      while (code != null)
      {        
       
        //Format pieces and location
        //getting Letter of the piece 
        String type = code;
        //storing Letter in array 
        pieceCode[loop] = type;
        //print to file
        out.print(code);
        
        //Storing letter
        pos[loop] = code;
        
        //getting letter for x-coordinate
        code = in.readLine();
        //getting index as a number
        column = getColumn(code);
        //Storing in x-pos array
        px[loop] = column;
        //print to file
        out.print(code);
        
        //Adding to array of entire coordinate
        pos[loop] += code;
        
        code = in.readLine();
        //getting row index
        row = Integer.parseInt(code);
        
        row = getRow(row);
        //adding to y-pos array
        py[loop] = row;
        
        //print to file
        out.print(code);
        
        //combine all 3 char to creat full coordinate to store (easier to print later)
        pos[loop] += code;
         
        //number of times the loop has been run
        loop++;
        out.print(" ");
        //Printing piece code (ex. K for king) to board at specified index
        b[row][column] = " " + type + " ";
        //reading next line
        code = in.readLine();  
        
      }//end of while
      
      //Check if user has specified X position
      int getXIndex = getIndex(pieceCode,"X");
      //if X is not specified, program does not continue and asks user to try again
      if (getXIndex == -1)
      {
       
       out.println();
       out.println("Please enter coordinates for X and try again");
       out.close();
       
      }//End of if
      
      //Printing new line for spacing
      out.println();
      out.println();
      
      //printing the chess board
      //columns
      for (int r = 0; r < 8; r++)
      {
        //rows
        for (int c = 0; c < 8; c++)
        {
         
          if (c == 7)
            out.println(b[r][c]);
          else
            out.print(b[r][c]);
            
        }//end of row loop 
        
      }//end of column loop
      
      //Makes an int that stores the index of the King
      int ki = getIndex(pieceCode, "K");
      //Makes an int that stores the index of the Queen
      int qi = getIndex(pieceCode, "Q");
      //Makes an int that stores the index of the Rook
      int ri = getIndex(pieceCode, "R");
      //Makes an int that stores the index of the Knight
      int ni = getIndex(pieceCode, "N");
      //Makes an int that stores the index of the Bishop
      int bi = getIndex(pieceCode, "B");
      
      out.println();
      out.println("Below is a list of all pieces that can attack position X:");
      
      //Prints out the position of the king if the king can attack the X
      if (ki != -1);
      {
       
        String king = checkKing(pieceCode,px,py,pos);
        
        if (!king.equals("error"))
          out.println(king);
          
      }//End of if
      
      //Prints out the position of the queen if the queen can attack the X
      if (qi != -1);
      {
       
        String queen = checkQueen(pieceCode,px,py,pos);
        
        if (!queen.equals("error"))
          out.println(queen);
          
      }//End of if
      
       //Prints out the position of the rook if the room can attack the X
      if (ri != -1);
      {
       
        String rook = checkRook(pieceCode,px,py,pos);
        
        if (!rook.equals("error"))
          out.println(rook);
          
      }//End of if
      
      //Prints out the position of the bishop if the bishiop can attack the X
      if (bi != -1);
      {
       
        String bishop = checkBishop(pieceCode,px,py,pos);
        
        if (!bishop.equals("error"))
          out.println(bishop);
          
      }//End of if
      
      //Prints out the position if the knight if the knight can attack the X
      if (ni != -1);
      {
       
        String knight = checkKnight(pieceCode,px,py,pos);
        
        if (!knight.equals("error"))
          out.println(knight);
          
      }//End of if
      
      in.close();
      out.close();
      
    }//end of try    
    
    
    //For any errors
    catch (IOException e)
    {
     
      System.out.println ("There was an error! Please try again.");
      
    }//end of catch
    
  }//end of main
  
  //Pre:Pieces have to be placed on the board
  //Post:gets the column position of each peice
  public static int getColumn (String s)
  {
   
   //Values for the columns
    char[] cl = {'a','b','c','d','e','f','g','h'};
    char[] s2 = s.toCharArray();
    int col = 0;
    //Checks if the value for the column on the board matches the value for each peice
    for (int b = 0; b < 8; b++)
    {
     
      if (cl[b] == s2[0])
        col = b;
        
    }//End of for
    
    return col;
    
  }//End of GetColumn
  
  //Pre:Pieces have to be placed on the board
  //Post:Gets the row position of each peice
   public static int getRow (int n)
  {
   
   //Values for the rows
    int[] rb = {8,7,6,5,4,3,2,1};
    //Gets row position of each piece
    int row = rb[n];
      return row;
      
   }//End of GetRow
  
  //Pre:Position of the king must be entered in th input file 
  //Post:Checks if the king can attack the X position
  public static String checkKing (String[] p, int[] x, int[] y, String[] s)
  {
    
    String pos = "";
    
    //Gets the index of the "X" position
    int xi = (getIndex(p,"X"));
    //Gets the index of the King 
    int ki = (getIndex(p,"K"));
    
    try 
    {
     
      //Gets the absolute value of the x position
      int dx = Math.abs((x[xi])-(x[ki])); 
      //Gets the absolute value of the y position 
      int dy = Math.abs((y[xi])-(y[ki])); 
      
       //Checks if the king is able to attack the X position if the King can move one space in the x and y direction
      if ((dx < 2) && (dy < 2))
        pos = s[ki];
      else
        pos = "error";
      
    }//End of try
    
    catch (IndexOutOfBoundsException e) 
    {
     
      pos = "error";
      
    }//End of catch
    
    return pos;
    
  }//End of CheckKing
  
  //Pre:Position of the queen must be entered in th input file 
  //Post:Checks if the queen can attack the X position
  public static String checkQueen (String[] p, int[] x, int[] y, String[] s)
  {
    
    String pos = "";
    
    //Gets the index of the "X" position
    int xi = (getIndex(p,"X"));
    //Gets the index of the Queen
    int qi = (getIndex(p,"Q"));
    
    
    try
    {
     
      //Checks if the queen is able to attack the X position
      for (int i = 0; i < 7; i++)
      {
        
        //Checks if the queen can attack the X position by going to the Right and Up 
        if (((x[qi]+i) == x[xi]) && ((y[qi]+i) == y[xi]))
        {
         
          pos = s[qi];
          break;
          
        }
        //Checks if queen can attack the X position by going to the Right and Down 
        if (((x[qi]+i) == x[xi]) && ((y[qi]-i) == y[xi]))
        {
         
          pos = s[qi];
          break;
          
        }
        //Checks if the queen can attack the X position by going to the Left and Down
        else if (((x[qi]-i) == x[xi]) && ((y[qi]-i) == y[xi]))
        {
         
          pos = s[qi];
          break;
          
        }
        //Checks if the queen can attack the X position by going to the Left and Up 
        else if (((x[qi]-i) == x[xi]) && ((y[qi]-i) == y[xi]))
        {
         
          pos = s[qi];
          break;
          
        }
          
        //Up,down,left or right in a straight line
        else if (((y[qi]+i) == y[xi]) || ((y[qi]-i) == y[xi]) || ((x[qi]+i) == x [xi]) || ((x[qi]-i) == x [xi]))
        {
         
          pos = s[qi];
          break;
          
        }
        
        else 
          pos = "error";
        
      }//End of for loop
      
    }//End of try
    
    
    catch (IndexOutOfBoundsException e) 
    {
      
      pos = "error";    
      
    }
    
    return pos;
  }
  
  //Pre:Position of the Bishop must be entered in th input file 
  //Post:Checks if the bishop can attack the X position
  public static String checkBishop (String[] p, int[] x, int[] y, String[] s)
  {
    
    String pos = "";
    
    //Gets the index of the "X" position 
    int xi = (getIndex(p,"X"));
    //Gets the index of the Bishop
    int bi = (getIndex(p,"B"));
    
    
    try
    {
     
      //Checks if the bishop is able to attack the X position in a diagonal direction
      for (int i = 0; i < 7; i++)
      {
        
        //Checks if the bishop can attack the X position by moving to the Right and Up 
        if (((x[bi]+i) == x[xi]) && (y[bi]+i == y[xi]))
        {
         
          pos = s[bi];
          break;
          
        }//End of if
        
        //Checks if the bishop can attack the X position by moving to the Right and Down 
        if (((x[bi]+i) == x[xi]) && (y[bi]-i == y[xi]))
        {
         
          pos = s[bi];
          break;
          
        }//End of if
      //Checks if the bishop can attack the X position by moving to the Left and Down 
        else if (((x[bi]-i) == x[xi]) && ((y[bi]-i) == y[xi]))
        {
         
          pos = s[bi];
          break;
          
        }//End of else if
        //Checks if the bishop can attack the X position by moving to the Left and Up 
        else if (((x[bi]-i) == x[xi]) && ((y[bi]+i) == y[xi]))
        {
         
          pos = s[bi];
          break;
          
        }//End of else if
        
        else 
          pos = "error";
        
      }//End of for loop
      
    }//End of try
    
    catch (IndexOutOfBoundsException e) 
    {
     
      pos = "error";
      
    }
    
    return pos;
    
  }//End of checkBishop
  
  //Pre:Position of the knight must be entered in th input file 
  //Post:Checks if the kinght can attack the X position by moving in an L-shape
  public static String checkKnight(String[] p, int[] x, int[] y, String[] s)
  {
    
    String pos = "";
    
    //Gets the index of the "X" 
    int xi = (getIndex(p,"X"));
    //Gets the index of the Knight
    int ni = (getIndex(p,"N"));
    
    
    try
    {      
      
      //Checks if the knight can attack the X positon by moving 2 to the Right and 1 Up 
      if (((x[ni]+2) == x[xi]) && ((y[ni]+1) == y[xi]))
        pos = s[ni];
      
      //Checks if the knight can attack the X position by moving 2 to the Right and 1 Down 
      else if (((x[ni]+2) == x[xi]) && ((y[ni]-1) == y[xi]))
        pos = s[ni];
      
      //Checks if the knight can attack the X position by moving 2 to the Left and 1 Up 
      else if (((x[ni]-2) == x[xi]) && ((y[ni]+1) == y[xi]))
        pos = s[ni];
      
      //Checks if the knight can attack the X position by moving 2 to the Left and 1 Down
      else if (((x[ni]-2) == x[xi]) && ((y[ni]-1) == y[xi]))
        pos = s[ni];
      
      //Checks if the knight can attack the X position by moving 1 to the Right and 2 Up
      else if (((x[ni]+1) == x[xi]) && ((y[ni]+2) == y[xi]))
        pos = s[ni];
      
      //Checks if the knight can attack the X position by moving 1 to the Right and 2 Down 
      else if (((x[ni]+1) == x[xi]) && ((y[ni]-2) == y[xi]))
        pos = s[ni]; 
      
      //Checks if the knight can attack the X position by moving 1 to the Left and 2 Up 
      else if (((x[ni]-1) == x[xi]) && ((y[ni]+2) == y[xi]))
        pos = s[ni];
      
      //Checks if the knight can attack the X position by moving 1 to the Left and 2 Down  
      else if (((x[ni]-1) == x[xi]) && ((y[ni]-2) == y[xi]))
        pos = s[ni];
      
      else
        pos = "error";
      
    }//End of try

    
    catch (IndexOutOfBoundsException e) 
      
    {
     
      pos = "error";
      
    }//End of catch
    
    return pos;
    
  }//End of checkKnight
  
  //Pre:Position of the rook be entered in th input file
  //Post:Checks if the rook can attack the X position
  public static String checkRook (String[] p, int[] x, int[] y, String[] s)
  {
    
    String pos = "";
    //Gets the index of the "X"
    int xi = (getIndex(p,"X"));
    //Gets the index of the Rook
    int ri = (getIndex(p,"R"));
    
    
    try
    {
      //Checks if the rook can attack the X position by moving horizonatlly aor vertically
      for (int i = 0; i < 7; i++)
      {
        
        if (((y[ri]+i) == y[xi]) || ((y[ri]-i) == y[xi]) || ((x[ri]+i) == x [xi]) || ((x[ri]-i) == x [xi]))
        {
         
          pos = s[ri];  
          break;
          
        }//End of if statement
          
      }//End of for loop
      
    }//End of try
    
    catch (IndexOutOfBoundsException e) 
    {
     
      pos = "error";
      
    }//End of catch
    
    return pos;
  }//End of checkRook
  
  //Pre:Pieces have to be placed on the board
  //Post:Allows you to get the index of each peice
  public static int getIndex (String[] p, String s)
  {
   
    int index = -1;
    for (int i = 0; i < 6; i++)
    
    {
      
      if (p[i].matches(s))
        index = i;
      
    }//End of for loop
    
    return index;
    
  }//End of getIndex
  
}//end of class
