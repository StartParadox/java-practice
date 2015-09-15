/*************************************************************************
  * Author: Akash Patel                                                  *
  * Date: March 13th, 2015                                               *
  * File Name: AkashPigLatin.java                                        *
  * Description: The class translates messages from English to Pig Latin.*
  * The input is received from one text file and outputted to another.   * 
  * If it begins with a vowel, "way" is added at the end of the word.    * 
  * If there are one or more consonants, the consonants up to the first  *
  * vowel are moved to the end and "ay" is added                         *
  *                                                                      *
  * Resources:                                                           *  
  * http://docs.oracle.com/javase/7/docs/api/java/lang/String.html       *
  *                                                                      *
  * NOTE: Input/output files and actual program must be in SAME place    *
  ************************************************************************/
//required imports
import java.io.*;
import java.util.*;

public class AkashPigLatin //class name
{
  static final String alphabet = "[abcdefghijklmnopqrstuvwxyz]";
  static final String vowels = "[aeiou]";   
  public static void main(String[] args)//main method
  {    
    try
    {
      //Setting up file input and output
      BufferedReader in = new BufferedReader(new FileReader("sentence.txt"));
      PrintWriter out = new PrintWriter(new FileWriter("pigLatinSentence.txt"));   
      //read first line of file
      String message = in.readLine();
      //Read until last line
      while (message != null)
      {
        //call the getPigLatinSentence method to pigLatinfy entire sentence
        message = getPigLatinSentence(message);
        //Print this sentence to file
        out.println(message);
        //read next line
        message = in.readLine();
      }//end of while
      System.out.println ("Check the pigLatinSentence.txt for your message in Pig Latin.");
      in.close();
      out.close();
    }//end of try    
    //For any errors
    catch (IOException e)
    {
      System.out.println ("There was an error! Please try again."); 
    }//end of catch
  }//end of main method
  
   public static String getPigLatinSentence(String c)
  {
    //empty string to store sentence
    String message = "";
    //Split sentence(into tokens) by words
    StringTokenizer st = new StringTokenizer(c, " .?!,;", true);
    //while there are more words (or tokens)
    while (st.hasMoreTokens())
    { 
      //call pigLatinfy for token or word
      c = pigLatinfy(st.nextToken());
      //add new pig latin word to sentence
      message += c;
    }//end of while
    return message;    
  }//end of getPigLatinSentence method
   
  public static String pigLatinfy(String a)
  { 
    //make string lowercase
    a = a.toLowerCase();
    //call detectPrefix method to get prefix of word (until first word)
    String prefix = detectPrefix(a);
    //First letter of word
    String letter = a.substring(0,1);
    //Check if the first word is a vowel
    if (letter.matches(vowels))
    {
      //add "way" to the end of the word
      a = a + "way";
    }//end of if
    //if first word isn't vowel
    else if (letter.matches(alphabet))
    {
      //Remove prefix from word
      a = a.replace (prefix, "");
      //Add prefix to end of word with "ay"
      a = a + prefix + "ay";
    }//end of else
    //return new pig latin word
    return a; 
  }//end of pigLatinfy method
  
  public static String detectPrefix(String b)
  {
    //check each letter of the word
    for (int i = 0; i < b.length(); i++)
    { 
      //nth letter of the word
      String letter = b.substring(i,i+1);
      //Temporary prefix
      String prefix = b.substring(0, 1);
      //Check if the first word is a vowel
      if (prefix.matches("[aeiou]"))
      {
        //keep the prefix the same (first letter which is a vowel)
        b = prefix;
      }//end of if
      //if first word isn't vowel, program keeps checking until it reaches a vowel
      else if (letter.matches("[aeiou]"))
      {
        //prefix until the first vowel
        prefix = b.substring(0, b.indexOf(letter));
        //new prefix
        b = prefix;
      }//end of else if
    }//end of for    
    //return prefix
    return b; 
  }//end of detectPrefix method
}//end of class
