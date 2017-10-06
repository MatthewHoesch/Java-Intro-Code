import java.util.Scanner;

public class Method3
{
  public static void main (String [] args)
  {
    int num1, num2, result=0;
    String input;
    char opt;
    
    Scanner kb = new Scanner (System.in);
    
    Menu(); //function menu is called
    System.out.println("Enter num1, num2 and q to end");
    
    num1=kb.nextInt();
    num2=kb.nextInt();
    input=kb.next();
    opt = input.charAt(0);
    
    do 
    {
      switch (opt)
      {
        case '+': result = Addition (num1, num2);
        System.out.println(num1 + "+" + num2 + "=" + result);
        break;
        case '-': result = Subtraction (num1, num2);
        System.out.println(num1 + "-" + num2 + "=" + result);
        break;
        case '*': result = Multiplication (num1, num2);
        System.out.println(num1 + "*" + num2 + "=" + result);
        break;
        case '/': result = Division (num1, num2);
        System.out.println(num1 + "+" + num2 + "=" + result);
        break;
      }//end of switch
    num1=kb.nextInt();
    num2=kb.nextInt();
    input=kb.next();
    opt = input.charAt(0);
    
    }while (opt != 'q');
  }
  
  public static void Menu()
  {
    System.out.println("\n\t + for addition");
    System.out.println("\n\t - for subtraction");
    System.out.println("\n\t * for mult");
    System.out.println("\n\t / for division");  
    System.out.println("\n\t q for stop");
  }
  
  public static int Addition (int num1, int num2)
  {
    return num1 + num2;
  }
  public static int Subtraction (int num1, int num2)
  {
    return num1 - num2;
  }
  public static int Multiplication (int num1, int num2)
  {
    return num1 * num2;
  }
  public static int Division (int num1, int num2)
  {
    return num1 / num2;
  }
}