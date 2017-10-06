//Matthew Hoesch
//Find the discount and the sales price using switch statements

import java.util.Scanner;
public class Price
{
  public static void main (String [] args)
  {
    Scanner kb = new Scanner (System.in);
    
    double RegPrice, Discount = 0, SalesPrice;
    int Code;
    
    System.out.println("Enter the regular price and code");
    
    RegPrice= kb.nextInt();
    Code = kb.nextInt();
    
    //Calculate the amount of discount
    
    switch (Code)
    {
      case 1:Discount = RegPrice * .10;
             break;
      case 2:Discount = RegPrice * .20;
             break;
      case 3:Discount = RegPrice * .30;
             break;
      default:Discount = RegPrice * .50;
              break;
    }
    //End of switch
    
    SalesPrice = RegPrice - Discount;
    
    System.out.println("Discount = $" + Discount);
    System.out.println("SalesPrice = $" + SalesPrice);
  }
}
