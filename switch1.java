// MAtthew Hoesch
import java.util.Scanner;
public class switch1
{
  public static void main (String [] args)
  {
    Scanner kb = new Scanner (System.in);
    
    int Num1, Num2, option;
    int Result;
    
    System.out.println("Enter num1, num2, and option " +  " End case by entering 5");
    
    Num1= kb.nextInt();
    Num2= kb.nextInt();
    option= kb.nextInt();
    
    do 
    {
      switch (option)
      {
        case 1: Result = Num1 + Num2;
        System.out.println(Num1 + Num2 = + Result);
        break;
        case 2: Result = Num1 + Num2;
        System.out.println(Num1 -  Num2 =  Result);
        break;
        case 3: Result = Num1 + Num2;
        System.out.println(Num1 * Num2 = Result);
        break;
        case 4: Result = Num1 + Num2;
        System.out.println(Num1 / Num2 = Result);
        break;
      }
//Case
      
    Num1= kb.nextInt();
    Num2= kb.nextInt();
    Option= kb.nextInt();
    }
//End of loop
    
    while (Option !=5);
  }
}
      
      
        


  