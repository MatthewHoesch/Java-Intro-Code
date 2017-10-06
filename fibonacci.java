//Write a program to print a series of fibonacci numbers
import java.util.Scanner;
public class fibonacci 
{
  public static void main(String[] args)
  {
    int number, x,y,sum;
    Scanner kb= new Scanner(System.in);
    System.out.println("Enter the last number");
    
    number=kb.nextInt();
    x=1;
    y=1;
    
    System.out.print(x + " ");
    
    while(y<= number)
    {
      System.out.print(y + " ");
      sum= x+y;
      x=y;
      y=sum;
    }
    System.out.println();
  }
}
    