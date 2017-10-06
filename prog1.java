// Name: Matthew Hoesch 
/* Program Trip: This program calculates the total cost and miles per gallon of a vehicle
 * based ont the miles traveled, fuel consumed, fuel cost per gallon, and operating cost 
 * per mile.
 * 
 * Input: The total cost, miles traveled, total fuel consumed, unit cost of the fuel
 * and operating cost per mile.
 * 
 * Output: The Miles per gallon, total cost of the trip, and the cost per mile.*/

/* Variable Dictionary:
 * 
 * Miles: Total miles traveled.
 * Fuel:  Total gallons used.
 * FuelCost:  Fuel cost per gallon.
 * OperCost:  Operating cost per mile.
 * MPG:  Miles per gallon.
 * TFuelCost:  Total fuel cost.
 * ToperCost:  Total operating cost.
 * TTripCost:  Total trip cost.
 * CostPerMile:  Cost per mile.  */

import java.util.Scanner;
public class prog1
{
  public static void main (String [] args)
  {
    
  double Miles, Fuel, FuelCost, OperCost, MPG, TFuelCost, ToperCost, TTripCost, CostPerMile;
  
  Scanner kb = new Scanner (System.in);
  
  //Read in the total miles and fuel
  
  System.out.println("Enter the total miles traveled and total gallons used");
  Miles = kb.nextDouble();
  Fuel = kb.nextDouble();
  
  //Calculate miles per gallon
  
  MPG = Miles / Fuel;
    
  //Read in the fuel cost per gallon and operating cost per mile.
    
    System.out.println("Enter the cost per gallon and the cost per mile");
  FuelCost = kb.nextDouble();
  OperCost = kb.nextDouble();
  
  //Calculate the total fuel cost and total operating cost.
  
  TFuelCost = Fuel * FuelCost;
  ToperCost = Miles * OperCost;
  
  //Calculate total trip cost, and cost per mile.
  
  TTripCost = TFuelCost + ToperCost;
  CostPerMile = TTripCost / Miles;
  
  //Print the output
  
  System.out.println("Miles Per Gallon: " + MPG);
    System.out.println("Total Trip Cost: $" + TTripCost);
    System.out.println("Cost Per Mile: $" + CostPerMile);
    
  }
}
                  
    
  