import java.util.Scanner;
public class TestFib
{
  public static void main (String[] args)
  {
    int number, Fibnumber1;
    Scanner kb= new Scanner(System.in);
    
    System.out.println("Enter a number");
    
    number= kb.nextInt();
    
    Fibnumber1= FibonacciNum.Fib(number);
    System.out.println(Fibnumber1);
  }
}