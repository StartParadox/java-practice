/*************************************************************************
  * Author: Akash Patel                                                  *
  * Date: March 3rd, 2015                                                *
  * File Name: AkashCipher.java                                          *
  * Description: This class encodes a message saved in a file            *
  *              using Ceaser cipher, and saves the encoded message in   *
  *              another text file.                                      *
  * NOTE: Input/output files and actual program must be in SAME place    *
  ************************************************************************/
//This encryption adds the letter depending on its case (upper or lower)
// If the letter is lowercase, then it alters ONLY the lowercase alphabet
// If the letter is uppercase, then it alters ONLY the uppercase alphabets
import java.io.*;
import java.util.*;


public class AkashCipher  // Class Name
{
  //Uppercase Letters
  static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  //Lowercase Letters
  static final String alphabets2 = "abcdefghijklmnopqrstuvwxyz";
  public static void main(String[] args) 
  {
    String message;             // message to be encoded
    int cipher_num;             // the cipher number
    String cipher_keyword;      // the cipher keyword 
    String codedMessage = "";   // encoded message
    String in_file;             // input file name
    String out_file;            // output file name
    String curr_letter;         //current letter
    int au_index;               //index of uppercase alphabet
    int al_index;               //index of lowercase alphabet
    int new_index;              //new index after cipher number is applied
    String na = alphabets;      //new alphabet from where to remove the duplicate letters
    String nal = alphabets2;    //new lowercase alphabet from where to remove duplicate letters 
    String keyword;             //var to store cipher keyword
    // Getting the Cipher value from the user
    System.out.println("Please enter the cipher number: ");
    cipher_num = In.getInt();
    /*************** PART B *****************/
    // Getting the cipher keyword from the user
    System.out.print("Please enter the keyword for the cipher (no spaces please)");
    cipher_keyword = In.getString();
    cipher_keyword = cipher_keyword.replace(" ", "");
    //Start Checking letters from end of string to prevent keyword from being backwards
    for (int i = cipher_keyword.length()-1; i >= 0; i--)
    {
      //substring of cipher keyword
      String keyword_letter = cipher_keyword.substring(i, i+1);
      //temporarily holding keyword letter 
      String temp = keyword_letter;
      //This will store the ENTIRE keyword to be added to the new alphabet at the end
      keyword = "";
      //Check if letter is uppercase
      if (na.indexOf(keyword_letter) > -1)
      {
        //removing all duplicate letters
        na = na.replace(keyword_letter, "");
        //Adding each temporary letter to form keyword
        keyword += temp;
        //Adding keyword to new alphabet
        na = keyword+na;
      }//end of for
      //Check if letter is lowercase
      else if (nal.indexOf(keyword_letter)> -1)
      {
        //removing all duplicate letters
        nal = nal.replace(keyword_letter, ""); 
        //Adding each temporary letter to form keyword
        keyword += temp;
        nal = keyword+nal;   
      }//end of else if
    }//end of for
    //Print out modified alphabets
    System.out.println (na);
    System.out.println (nal);
    
    /****************************************************************************/
    // Getting the file name where the message to be encoded is saved
    System.out.print("Please enter the name of the file (without the file extension)"
                       + " where the message is saved: ");
    in_file = In.getString();
    
    // Getting the output file name from the user.
    System.out.print("Please enter the name of the file (without file extension) in which you "
                       + "would like to save your coded message:");
    out_file = In.getString();
    
    try 
    {
      BufferedReader in = new BufferedReader(new FileReader(in_file+".txt"));
      PrintWriter out = new PrintWriter(new FileWriter(out_file+".txt"));
      message = in.readLine();
      // Encoding the message line by line and writing it to the output file
      while (message != null) 
      {
        /************************************** PART A ********************************************/
        // TASK: Complete the following for loop to encode the current line of the message
        
        //Run for entire message
        for (int i = 0; i < message.length(); i++) 
        {
          //Current letter at i
          curr_letter = message.substring(i,i+1);
          //index of letter in either alphabet (upper or lower)
          au_index = na.indexOf(curr_letter);
          al_index = nal.indexOf(curr_letter);
          
          //Check if character included in uppercase alphabet 
          if (au_index > -1)
          {
            //move n amount of spaces (where n is the cipher number) from original letter index
            new_index = au_index+cipher_num;
            //calls getLetter method to get new "encrypted" letter
            curr_letter = getLetter (new_index, na);
          }//end of if
          //Check if character included in lowercase alphabet
          else if (al_index > -1)
          {
            //move n amount of spaces (where n is the cipher number) from original letter index
            new_index = al_index+cipher_num;
            //calls getLetter method to get new "encrypted" letter
            curr_letter = getLetter (new_index, nal);
            
          }//end of else if
          //Add new enrypted letter to codedMessage string
          codedMessage += curr_letter; 
        } // end of for
        out.println(codedMessage);
        //reset coded message for new line
        codedMessage = "";
        //read next line
        message = in.readLine();
      } // end of while
      System.out.println("Please check your output file to see the encrypted message! Your selected output file is: " + out_file + ".txt");
      in.close();
      out.close();
    } // end of try
    catch (IOException e) 
    {
      System.out.println("File Not Found");
    }//end of catch
  }// end of main
  //Method handles indexes greater than alphabet index and gets current letter
  public static String getLetter(int index, String s)
  {
    //If index is greater than actual index, then loop around
    if (index > 25)
      index %= 26; 
    //get the new letter after cipher number and keyword are applied
    String curr_letter = s.substring(index,index+1);
    return curr_letter;
  }//end of getLetter method
} // end of class
