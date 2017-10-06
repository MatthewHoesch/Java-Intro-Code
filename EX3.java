import java.util.Scanner;
public class EX3
{
  public static void main (String[] args)
  {
    int num1, num2, sum;
    Scanner kb = new Scanner (System.in);
    System.out.println ("Enter num1 , num2");
    num1= kb.nextInt();
    num2= kb.nextInt();
    sum= num1+num2;
    System.out.println("The sum of the integers is4 = " + sum);
  }
}