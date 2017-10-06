import java.util.Scanner;
public class ExceptionExample
{
  public static void main(String[] args)
  {
    int dividend, divisor, quotient;
    
    Scanner kb = new Scanner(System.in);
    
    try
    {
      System.out.println("Please enter the dividend: ");
      dividend = kb.nextInt();
      
      System.out.println("Please Enter divisor: ");
      divisor = kb.nextInt();
      System.out.println();
      
      quotient= dividend/divisor;
        
        System.out.println("quotient =" + quotient);
    }
    catch(Exception e)
    {
      System.out.println(e.toString());
    }
  }
}
