//Factorial example for final
import java.util.Scanner;
public class TestFactorial
{
  public static void main (String [] args)
  {
    int number, Factnum;
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter a number");
    number= kb.nextInt();
    
    Factorial f = new Factorial();
    Factnum= f.Fact(number); //Call method fact and return Factnum
    System.out.println("Factorial of " + number + " is = " + Factnum);
  }
}
