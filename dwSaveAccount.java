//You have 100000 to put in a savings account
//Interest rate is .03% how many years to get to million?

import java.util.Scanner;

  public class dwSaveAccount
{
  public static void main(String [] args)
  {
    Scanner kb = new Scanner (System.in);
    
    int Year=0;
    double Balance;
    
    System.out.println("enter in the balance");
    Balance=kb.nextDouble();
   do
    {
      Balance= Balance + (Balance *.03);
      Year++;
    }
    while(Balance<1000000);
    System.out.println("In " + Year + " years to become a millionaire");
  }
}