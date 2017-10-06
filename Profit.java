//Create a program that can calculate the possible loss in profit
//Name: Matthew Hoesch 

import java.util.Scanner;
  
  public class Profit
{
  public static void main (String[] args)
  {
    Scanner kb = new Scanner (System.in);
    
    double Revenue, Cost, Profit, Loss;
    
    System.out.println("Enter the revenue and the cost");
    Revenue= kb.nextDouble();
    Cost= kb.nextDouble();
    
    if (Revenue > Cost)
    {
     Profit = Revenue- Cost;
      System.out.println("Profit = $" + Profit );
    }
    else if (Cost > Revenue)
    {
      Loss=Cost-Revenue;
        System.out.println("Loss = $" + Loss);
    }
    else if (Cost == Revenue)
      System.out.println("Breakeven");
  }
}