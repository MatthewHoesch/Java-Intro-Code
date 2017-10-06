//Write a program to calculate the area of the circle 
//Name: Matthew Hoesch

import java.util.Scanner;
public class calcarea
{
  public static void main(String [] args)
  {
    int radius;
    Scanner kb= new Scanner (System.in); //input the data with system.in
    System.out.println("Enter the radius");
    radius= kb.nextInt();
    
    //The object cr is created and the constructor(method) is called.
    //Same name as class must be used for the constructor.
    //Creating a new class and calling a new function.
    Circle cr = new Circle (radius); //radius is the argument, going to pass the data
    cr.findarea(); //Both apart of cr, new variables.
    cr.print();   
  }
}