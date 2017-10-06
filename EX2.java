import java.util.Scanner;
// Find the area of the rectangle
// Name: Matthew Hoesch

public class EX2
{
  public static void main (String[] args)
  {
    double length, width, area;
    Scanner keyboard= new Scanner (System.in);
    
    System.out.println("Enter length and width");
    length = keyboard.nextDouble();
    width = keyboard.nextDouble();
    
    area = length * width;
    
    System.out.println("The area of the rectangle = " + area);
  }
                   
}
                         
    
    