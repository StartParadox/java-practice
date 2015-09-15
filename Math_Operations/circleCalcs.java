public class circleCalcs 
{
  
  
  public static void main(String[] args) 
  { 
    final Double PI = 3.1415;
    System.out.println ("Input the radius of the circle below");
    Double radius = In.getDouble ();
    Double circumference = (2*PI*radius);
    System.out.println ("\nThe circumference of the circle is " + circumference);
    Double area = (PI * radius * radius);
    System.out.println ("\nThe area of the circle is " + area);
    
  }
  
  
}
