import java.util.Scanner; 
// Name: Matthew Hoesch
/* Write a program that will take three imputs. This Program calculates and then 
 * prints the face value required in order for the consumer
 * to receive the amount needed and calculates the monthly payment. 
 
 Inputs: The amount the consumer needs to receive, the interest rate, and the duration of
         the loan in months.
 
 Variable Dictionary:
 LfaceValue = Loan face value, value of the loan
 IntRate = Interest Rate
 Dur = Duration in months 
 Intr = Interest
 TintOwed = Total interest owed
 Rpment = Repayment 
 MloanPmnt = Monthly loan payment 
 */
 
public class prog2
{
  public static void main (String[] args)
  {
    double LfaceValue, IntRate, Dur, Intr, TintOwed, Rpment, MloanPmnt;
    
    Scanner kb = new Scanner (System.in);
    
    //Read in the loan face value, the interest rate and the duration in years and months 
    
    System.out.println("Enter the loan face value, the interest rate, and the duration in months");
    
    LfaceValue = kb.nextDouble();
    IntRate = kb.nextDouble();
    Dur = kb.nextDouble();
     
    
    //Calculate the interest
    
    Intr = LfaceValue * IntRate;
      
    //Calculate Total interest owed
      
    TintOwed = Intr * (Dur / 12);
      
    //Calculate the repayment 
      
    Rpment = LfaceValue - TintOwed;
      
    //Calculate the monthly loan payment 
      
    MloanPmnt = LfaceValue / Dur;
   
    // Print the output
    
      System.out.println("The amount the consumer needs to recieve is $ " + Rpment);
      System.out.println("The monthly payment is $ " + MloanPmnt);
  }
}
