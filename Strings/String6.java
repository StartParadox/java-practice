public class String6
{
  public static void main (String[] args)
  {
    System.out.println ("Enter the student's answer for the 10 questions IN ONE LINE");
    String s = In.getString();
    char[] s2 = s.toCharArray();
    char[] a = {'T','F','T','T','F','F','T','F','T','T'};
    int i;
    int score = 0;
    for (i = 0; i < 10; i++)
    {
      if (s2[i] == a[i])
      {
        score++;
      }
    }
    System.out.println ("The student has scored " + score + "/10");
  }
} 