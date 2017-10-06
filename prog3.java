// Name: Matthew Hoesch
/*This program will read in the number of hours worked in a week and the number of 
 * dependants as input and that will then output the workers gross pay, each withholding
 * amount, and the net take-home pay for the week.*/

/* Inputs: rate, hours, dependence
 * Outputs: GrossPay, WHoldingAmt, NTakehomePay
*/

/* Variable Dictionary
 * 
 * Rate = rate
 * Hours= regular hours worked
 * Overtime = Extra hours worked
 * GrossPay= Annual wage
 * Tax = (Social Security Tax (6%), Federal Income Tax (14%), Income Tax (5%) = 25%.
 * UDues = Union Dues ($10 per Week)
 * Dependence = Number of dependents 
 * WHoldingAmt = Witholding amount (Amount of money after deduction of $35 from gross Pay)
 * NTakehomePay = Net Take home Pay 
 */

import java.util.Scanner;

  public class prog3
{
  public static void main (String[] args)
  {
    int Hours, Overtime, Udues, Dependence;
    double Rate, WHoldingAmt, GrossPay, Tax, NTakehomePay;
    
    Scanner kb = new Scanner (System.in);
    
    // Read in the hours and the rate
    
    System.out.println("Enter the hours worked and number of dependence");
    Hours = kb.nextInt();
    Dependence = kb.nextInt();
    
    Tax = 1 - .25;
    Udues = 10;
    Rate = 16.78;
    
    if (Hours <= 40)
    { 
      GrossPay = Hours * Rate;
      Overtime = 0;
      NTakehomePay = GrossPay * Tax - Udues;
    }
    else 
    {
      Overtime = Hours - 40;
      GrossPay = 40 * Rate + Overtime * Rate * 1.5;
      NTakehomePay = GrossPay * Tax - Udues;
    }
    
    if (Dependence >= 3)
    {
      WHoldingAmt = 35;
      NTakehomePay = GrossPay * Tax - Udues - 35;
    }
    else 
    {
      WHoldingAmt = GrossPay;
      NTakehomePay = GrossPay * Tax - Udues;
    }
       
    //Print the output
    
    System.out.println("The workers Gross Pay is = $" + GrossPay);
    System.out.println("The withholding Amount is = $" + WHoldingAmt);
    System.out.println("The net take home pay is = $" + NTakehomePay);
  }
}
    
    
      
      
    
    