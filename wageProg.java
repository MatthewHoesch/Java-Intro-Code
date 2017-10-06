//Write a program to calculate the wage for an employee.

import java.util.Scanner;
public class wageProg
{
  public static void main (String[] args)
  {
    double Hours, Rate, Wage, Overtime;
      
      Scanner kb = new Scanner (System.in);
      System.out.println("Enter the hours worked and the rate");
    
    Hours = kb.nextDouble();
    Rate = kb.nextDouble();
  
    //Find the wage
    
    if (Hours <= 40)
    {
      Wage= Hours * Rate;
    Overtime= 0;
    }
    else
    {
   Overtime= Hours - 40;
   Wage= 40* Rate + Overtime * Rate *1.5;
    } 
    
    //Print the hours and rate.
    
    System.out.println("Wage: $" + Wage);
    System.out.println("Overtime: " + Overtime);
  }
}
      
    